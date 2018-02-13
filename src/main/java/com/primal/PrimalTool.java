package com.primal;

import org.apache.commons.configuration2.Configuration;
import org.apache.commons.configuration2.builder.fluent.Configurations;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class PrimalTool {


    private static String dbConnString=null;
    private static String dbHost=null;
    private static int dbPort=3306;

    private static String dbUser=null;
    private static String dbPassword=null;

    private static int dbTimeOut=60000;

    private static final Logger logger = LoggerFactory.getLogger(PrimalTool.class);

    private String sqlStatement=null;
    private Statement stmt = null;
    private Connection conn=null;
    private ResultSet rs=null;
    private PreparedStatement preparedStmt = null;

    public void connectDatabase(String dbConnString, String dbUser, String dbPassword) {

        try {

            Class.forName("oracle.jdbc.OracleDriver").newInstance();
            if (conn == null) {
                conn = DriverManager.getConnection(dbConnString, dbUser, dbPassword);//("jdbc:mysql://localhost/test?user=minty&password=greatsqldb");
                conn.setAutoCommit(false);
            }
        } catch (Exception e) {

            logger.error(e.getMessage());

        }
    }

    public void closeDatabase() {

        try {
            if (conn != null)
                conn.close();
        }catch (Exception e) {
            logger.error(e.getMessage());
        }
    }

    public static void main(String[] args) {


        Configurations configs = new Configurations();
        try {
            Configuration config = configs.properties(new File("config.properties"));
            // access configuration properties
            dbHost = config.getString("database.host", "localhost");
            dbPort = config.getInt("database.port", 3306);
            dbUser = config.getString("database.user", "primal");
            dbPassword = config.getString("database.password", "primal01");  // provide a default
            dbTimeOut = config.getInt("database.timeout", 60000);

            dbConnString="jdbc:mysql://"+dbHost+":"+dbPort+"/ustax";
            dbConnString="jdbc:oracle:thin:@192.168.0.190:1521:orcl";

            PrimalTool primalTool = new PrimalTool();

            primalTool.connectDatabase(dbConnString, dbUser, dbPassword);
            primalTool.loadPrimalRateTables("c:\\primal\\20180125_SSiMobile_OCS_rateTableStatic_v5.csv");
            primalTool.closeDatabase();

        } catch (Exception e) {

            StringWriter sw = new StringWriter();
            PrintWriter pw = new PrintWriter(sw);
            e.printStackTrace(pw);
            logger.error(sw.toString().replace("\r\n","\r\n[ERROR]"));
            pw.close();

            try {
                sw.close();
            }catch ( IOException ioe) {
                logger.error(ioe.getMessage());
            }
        }
    }

    public int addDestination(Destination destination) {


        try {

            String query = "select max(destinationid) from bc_destination";
            preparedStmt = conn.prepareStatement(query);
            ResultSet rs = preparedStmt.executeQuery();
            if(rs.next()) {

                destination.setDestinationId(rs.getInt(1) + 1);
            }
            preparedStmt.close();

            query = "insert into bc_destination (destinationid, destinationname,input, description,status) values ( ?,?,?,?,? )";

            preparedStmt = conn.prepareStatement(query);
            preparedStmt.setInt(1, destination.getDestinationId());
            preparedStmt.setString(2, destination.getDestinationName());
            preparedStmt.setString(3, destination.getInput());
            preparedStmt.setString(4, destination.getDescription());
            preparedStmt.setInt(5, destination.getStatus());

            preparedStmt.executeUpdate();


        } catch (Exception e) {

            logger.error(e.getMessage());

        }finally {

            try {

                if( rs != null)
                    rs.close();
                if(stmt != null)
                    stmt.close();
                if(preparedStmt != null )
                    preparedStmt.close();

            }catch ( Exception e){

                logger.error(e.getMessage());
            }
        }


        return destination.getDestinationId();

    }

    public int addRoute(Route route) {


        try {

            String query = "select max(routeid) from bc_route";
            preparedStmt = conn.prepareStatement(query);
            ResultSet rs = preparedStmt.executeQuery();
            if(rs.next()) {

                route.setRouteId(rs.getInt(1) + 1);
            }

            preparedStmt.close();



            query = "insert into bc_route (routeid,routename, destinationid,rateplanid,mediagroup,starttime,endtime,DOWM," +
                    "interval1,interval2,interval3,cpi1,cpi2,cpi3,min1,min2,min3,max1,max2,max3," +
                    "status,rateplantype,originalrateplan,parentrouteid) values ( ?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,? )";

            preparedStmt = conn.prepareStatement(query);

            preparedStmt.setInt(1, route.getRouteId());
            preparedStmt.setString(2, route.getRouteName());
            preparedStmt.setInt(3, route.getDestinationId());
            preparedStmt.setInt(4, route.getRateplanId());
            preparedStmt.setInt(5, route.getMediaGroup());
            preparedStmt.setString(6, route.getStartTime());
            preparedStmt.setString(7, route.getEndTime());
            preparedStmt.setString(8, route.getDowm());
            preparedStmt.setInt(9, route.getInterval1());
            preparedStmt.setInt(10, route.getInterval2());
            preparedStmt.setInt(11, route.getInterval3());
            preparedStmt.setInt(12, route.getCpi1());
            preparedStmt.setInt(13, route.getCpi2());
            preparedStmt.setInt(14, route.getCpi3());
            preparedStmt.setInt(15, route.getMin1());
            preparedStmt.setInt(16, route.getMin2());
            preparedStmt.setInt(17, route.getMin3());
            preparedStmt.setInt(18, route.getMax1());
            preparedStmt.setInt(19, route.getMax2());
            preparedStmt.setInt(20, route.getMax3());
            preparedStmt.setInt(21, route.getStatus());
            preparedStmt.setInt(22, route.getRatePlanType());
            preparedStmt.setInt(23, route.getOriginalRatePlan());
            preparedStmt.setInt(24, route.getParentRouteId());

            preparedStmt.executeUpdate();


        } catch (Exception e) {

            logger.error(e.getMessage());

            StringWriter sw = new StringWriter();
            PrintWriter pw = new PrintWriter(sw);
            e.printStackTrace(pw);
            logger.error(sw.toString().replace("\r\n","\r\n[ERROR]"));
            pw.close();

        }finally {

            try {

                if( rs != null)
                    rs.close();
                if(stmt != null)
                    stmt.close();
                if(preparedStmt != null )
                    preparedStmt.close();

            }catch ( Exception e){

                logger.error(e.getMessage());
            }
        }


        return route.getRouteId();

    }

    public int setRoute(Route route, String routeType) {

        route.setRouteName(String.format("%d_%d", route.getRateplanId(),route.getDestinationId()));
        if(routeType.compareToIgnoreCase("LC") == 0) {

            logger.info(Character.toString((char)(18 + 38)));

            route.setDowm(String.format("%s%s",Route.DOWM_WITH_BUCKET , Character.toString((char)(14 + 38))));
        }
        else if(routeType.compareToIgnoreCase("LD") == 0) {
            route.setDowm(String.format("%s%s", Route.DOWM_WITH_BUCKET , Character.toString((char)(15 + 38))));
        }
        else if(routeType.compareToIgnoreCase("Unlimited") == 0) {
            route.setDowm(Route.DOWM_NO_BUCKET );
            route.setCpi1(0);
        }
        else if(routeType.compareToIgnoreCase("PAYG") == 0) {
            route.setDowm(Route.DOWM_NO_BUCKET );
        }
        else if(routeType.compareToIgnoreCase("N/A") == 0) {
            route.setDowm(Route.DOWM_NO_BUCKET );
        }

       return 0;
    }

    public void loadPrimalRateTables(String rateTableFile) throws Exception {

        String csvFile = rateTableFile;
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";


        br = new BufferedReader(new FileReader(csvFile));
        br.readLine();

        while ((line = br.readLine()) != null) {

            String[] columns = line.split(cvsSplitBy,-1);

            RateTableFile rateTable = new RateTableFile();

            rateTable.setDestinationName(columns[0]);
            rateTable.setRoutingCode(columns[2]);
            rateTable.setInterval(columns[3]);
            rateTable.setRate(columns[4]);
            rateTable.setRatePlan13(columns[5]);
            rateTable.setRatePlan14(columns[6]);
            rateTable.setRatePlan15(columns[7]);
            rateTable.setRatePlan16(columns[8]);

            Destination destination = new Destination();
            destination.setDescription(rateTable.getDestinationName().substring(0,Math.min(63,rateTable.getDestinationName().length())));
            destination.setDestinationName(rateTable.getDestinationName().substring(0,Math.min(15,rateTable.getDestinationName().length())));
            destination.setInput(rateTable.getRoutingCode());

            addDestination(destination);

            Route route = new Route();
            route.setDestinationId(destination.getDestinationId());

            logger.info(rateTable.toString());

            if(rateTable.getRate().compareToIgnoreCase("N/A") == 0) {
                continue;
            }

            BigDecimal cpi = new BigDecimal(rateTable.getRate().substring(1)).multiply(new BigDecimal("10000")).setScale(4);
            route.setCpi1(cpi.intValue());

            if( (rateTable.getRatePlan13().compareToIgnoreCase(rateTable.getRatePlan14()) == 0)
                    && (rateTable.getRatePlan13().compareToIgnoreCase(rateTable.getRatePlan15()) == 0)
                    && (rateTable.getRatePlan13().compareToIgnoreCase(rateTable.getRatePlan16()) == 0) ) {


                if(rateTable.getRatePlan13().compareToIgnoreCase("N/A") == 0 ) {
                    continue;
                }

                route.setRateplanId(0);
                setRoute(route, rateTable.getRatePlan13());
                addRoute(route);

                continue;
            }

            if(destination.getInput().compareToIgnoreCase("1867222####") == 0)
                logger.info("test");

            route.setRateplanId(13);
            setRoute(route, rateTable.getRatePlan13());
            addRoute(route);

            route.setRateplanId(14);
            setRoute(route, rateTable.getRatePlan14());
            addRoute(route);

            route.setRateplanId(15);
            setRoute(route, rateTable.getRatePlan15());
            addRoute(route);

            route.setRateplanId(16);
            setRoute(route, rateTable.getRatePlan16());
            addRoute(route);


            logger.info(rateTable.toString());

        }

        conn.commit();

    }

}
