package com.softserve.edu;

import com.softserve.edu.parse_json.gson_parser.GsonParser;
import com.softserve.edu.parse_json.root.Root;

public class Main {
    public static void main(String[] args) {

        GsonParser parser = new GsonParser();
        System.out.println(parser.getRoot());
    }
}
