package com.softserve.edu.parse_json.release;

import java.util.List;

public class ReleaseGroup {
    private String name;
    private List<Releases> releases;

    @Override
    public String toString() {
        return "ReleaseGroup{" +
                "name='" + name + '\'' +
                ", releases=" + releases +
                '}';
    }

    public String getName() {
        return name;
    }

    public List<Releases> getReleases() {
        return releases;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReleases(List<Releases> releases) {
        this.releases = releases;
    }
}
