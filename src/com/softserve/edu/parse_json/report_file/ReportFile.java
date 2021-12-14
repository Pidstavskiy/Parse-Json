package com.softserve.edu.parse_json.report_file;

public class ReportFile {
    private String fileLocation;
    private int startDateOffset;

    @Override
    public String toString() {
        return "ReportFile{" +
                "fileLocation='" + fileLocation + '\'' +
                ", startDateOffset=" + startDateOffset +
                '}';
    }

    public void setFileLocation(String fileLocation) {
        this.fileLocation = fileLocation;
    }

    public void setStartDateOffset(int startDateOffset) {
        this.startDateOffset = startDateOffset;
    }

    public String getFileLocation() {
        return fileLocation;
    }

    public int getStartDateOffset() {
        return startDateOffset;
    }
}
