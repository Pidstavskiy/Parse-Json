package com.softserve.edu.parse_json.project;

import com.softserve.edu.parse_json.report_file.ReportFile;
import com.softserve.edu.parse_json.root_cause.RootCause;
import com.softserve.edu.parse_json.epic.Epic;

import java.util.List;

public class Project {
    private String name;
    private String releaseGroup;
    private List<ReportFile> reportFiles;
    private List<Project> childProjects;
    private List<RootCause> rootCauses;
    private List<Epic> epics;

    @Override
    public String toString() {
        return "Project{" +
                "name='" + name + '\'' +
                ", releaseGroup='" + releaseGroup + '\'' +
                ", reportFiles=" + reportFiles +
                ", childProjects=" + childProjects +
                ", rootCauses=" + rootCauses +
                ", epics=" + epics +
                '}';
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

    public List<Project> getChildProjects() {
        return childProjects;
    }

    public List<RootCause> getRootCauses() {
        return rootCauses;
    }

    public List<Epic> getEpics() {
        return epics;
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

    public void setChildProjects(List<Project> childProjects) {
        this.childProjects = childProjects;
    }

    public void setRootCauses(List<RootCause> rootCauses) {
        this.rootCauses = rootCauses;
    }

    public void setEpics(List<Epic> epics) {
        this.epics = epics;
    }
}
