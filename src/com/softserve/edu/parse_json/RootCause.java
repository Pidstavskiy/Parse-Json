package com.softserve.edu.parse_json;

public class RootCause {
    private String name;
    private String description;

    @Override
    public String toString() {
        return "RootCauses{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
