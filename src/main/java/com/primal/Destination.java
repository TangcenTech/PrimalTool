package com.primal;

public class Destination {

    private int destinationId;
    private String destinationName;
    private String input;
    private String description;
    private int status;

    public Destination() {
        this.destinationId = 0;
        this.destinationName = destinationName;
        this.input = input;
        this.description = description;
        this.status = 1;

    }

    public Destination(int destinationId, String destinationName, String input, String description, int status) {
        this.destinationId = destinationId;
        this.destinationName = destinationName;
        this.input = input;
        this.description = description;
        this.status = status;
    }

    public int getDestinationId() {
        return destinationId;
    }

    public void setDestinationId(int destinationId) {
        this.destinationId = destinationId;
    }

    public String getDestinationName() {
        return destinationName;
    }

    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Destination{" +
                "destinationId=" + destinationId +
                ", destinationName='" + destinationName + '\'' +
                ", input='" + input + '\'' +
                ", description='" + description + '\'' +
                ", status=" + status +
                '}';
    }


}
