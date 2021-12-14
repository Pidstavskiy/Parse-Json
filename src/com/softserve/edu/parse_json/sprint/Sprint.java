package com.softserve.edu.parse_json.sprint;

public class Sprint {
    private String name;
    private String length;
    private String startDateOffset;

    @Override
    public String toString() {
        return "Sprint{" +
                "name='" + name + '\'' +
                ", length='" + length + '\'' +
                ", startDateOffset='" + startDateOffset + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getLength() {
        return length;
    }

    public String getStartDateOffset() {
        return startDateOffset;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public void setStartDateOffset(String startDateOffset) {
        this.startDateOffset = startDateOffset;
    }
}
