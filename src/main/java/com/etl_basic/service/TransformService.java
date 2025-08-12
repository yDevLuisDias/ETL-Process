package com.etl_basic.service;

public class TransformService {
    ExtractService extractService;

    public TransformService() {
        this.extractService = new ExtractService();
    }

    public void Test(){
        extractService.inputPathCsv("./src/main/java/com/etl_basic/data/file.csv");

        System.out.println(extractService.csvColumns);
    }
}
