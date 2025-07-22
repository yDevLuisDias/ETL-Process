package com.etl_basic;

import com.etl_basic.service.ExtensionFile;

public class Main {
    public static void main (String[] args){

        String path = ("./src/main/com/etl_basic/data/file.csv");

        ExtensionFile extensionFile = new ExtensionFile();
        extensionFile.extensionType(path);
    }
}
