package com.softserve.edu.parse_json.release;

import com.softserve.edu.parse_json.sprint.Sprint;

import java.util.List;

public class Releases {
    private String name;
    private String length;
    private String startDateOffset;
    private List<Sprint> sprints;

    @Override
    public String toString() {
        return "Releases{" +
                "name='" + name + '\'' +
                ", length='" + length + '\'' +
                ", startDateOffset='" + startDateOffset + '\'' +
                ", sprints=" + sprints +
                '}';
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

    public void setSprints(List<Sprint> sprints) {
        this.sprints = sprints;
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

    public List<Sprint> getSprints() {
        return sprints;
    }
}
