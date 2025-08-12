package com.etl_basic.service;

import org.apache.commons.io.FilenameUtils;

public class ExtensionFile {

    ExtractService extractService;

    public ExtensionFile() {
        this.extractService = new ExtractService();
    }

    public void extensionType (String path){

        String extension = FilenameUtils.getExtension(path);

        switch (extension){
            case "csv" -> extractService.inputPathCsv(path);
            case "json" -> extractService.inputPathJson(path);
            case "xml" -> extractService.inputPathXml(path);
        }
    }
}
