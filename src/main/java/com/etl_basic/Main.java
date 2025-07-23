package com.etl_basic;

import com.etl_basic.service.ExtensionFile;
import com.etl_basic.service.ExtractService;
import com.etl_basic.service.TransformService;

public class Main {
    public static void main (String[] args){

        String path = ("./src/main/java/com/etl_basic/data/file.csv");

        ExtensionFile extensionFile = new ExtensionFile();
        TransformService transformService = new TransformService();

        extensionFile.extensionType(path);
        transformService.Test();
    }
}
