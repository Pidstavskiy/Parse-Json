package com.softserve.edu.parse_json.gson_parser;

import com.google.gson.Gson;
import com.softserve.edu.parse_json.root.Root;

import java.io.FileReader;

public class GsonParser {
    private Root root;
    private Gson gson;

    public GsonParser() {
        this.gson = new Gson();
        this.root = parse();
    }

    private Root parse() {
        try (FileReader reader = new FileReader("settings.json")) {
            root = gson.fromJson(reader, Root.class);
            return root;
        } catch (Exception e) {
            System.out.println("Parsing error " + e.toString());
        }
        return null;
    }

    public Root getRoot() {
        return root;
    }
}
