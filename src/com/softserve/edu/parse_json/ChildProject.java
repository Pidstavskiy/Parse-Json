package com.softserve.edu.parse_json;

import java.util.List;

public class ChildProject {
    private String name;
    private String releaseGroup;
    private List<ReportFile> reportFiles;
    private List<ChildProject> childProjects;

    @Override
    public String toString() {
        return "ChildProject{" +
                "name='" + name + '\'' +
                ", releaseGroup='" + releaseGroup + '\'' +
                ", reportFiles=" + reportFiles +
                ", childProjects=" + childProjects +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReleaseGroup(String releaseGroup) {
        this.releaseGroup = releaseGroup;
    }

    public void setReportFiles(List<ReportFile> reportFiles) {
        this.reportFiles = reportFiles;
    }

    public void setChildProjects(List<ChildProject> childProjects) {
        this.childProjects = childProjects;
    }

    public String getName() {
        return name;
    }

    public String getReleaseGroup() {
        return releaseGroup;
    }

    public List<ReportFile> getReportFiles() {
        return reportFiles;
    }

    public List<ChildProject> getChildProjects() {
        return childProjects;
    }
}
