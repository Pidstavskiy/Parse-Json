package com.softserve.edu.parse_json.epic;

import java.util.List;

public class Epic {
    private String name;
    private String description;
    private int sSizes;
    private int startDateOffset;
    private List<String> releases;

    @Override
    public String toString() {
        return "Epic{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", sSizes=" + sSizes +
                ", startDateOffset=" + startDateOffset +
                ", releases='" + releases + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getsSizes() {
        return sSizes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setsSizes(int sSizes) {
        this.sSizes = sSizes;
    }

    public void setStartDateOffset(int startDateOffset) {
        this.startDateOffset = startDateOffset;
    }

    public void setReleases(List<String> releases) {
        this.releases = releases;
    }

    public int getStartDateOffset() {
        return startDateOffset;
    }

    public List<String> getReleases() {
        return releases;
    }
}
