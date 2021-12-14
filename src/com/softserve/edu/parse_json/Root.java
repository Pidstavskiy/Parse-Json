package com.softserve.edu.parse_json;

import java.util.List;

public class Root {
    private List<ReleaseGroup> releaseGroups;
    private List<Project> projects;

    @Override
    public String toString() {
        return "Root{" +
                "releaseGroups=" + releaseGroups +
                ", projects=" + projects +
                '}';
    }

    public void setReleaseGroups(List<ReleaseGroup> releaseGroups) {
        this.releaseGroups = releaseGroups;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public List<ReleaseGroup> getReleaseGroups() {
        return releaseGroups;
    }

    public List<Project> getProjects() {
        return projects;
    }
}
