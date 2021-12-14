package com.softserve.edu;

import com.softserve.edu.parse_json.GsonParser;
import com.softserve.edu.parse_json.Root;

public class Main {
    public static void main(String[] args) {

        GsonParser parser = new GsonParser();
        Root root = parser.parse();

        System.out.println(root.toString());
    }
}
