package com.example.Etl_basic.controller;

import com.example.Etl_basic.service.ExtractService;

public class EtlController {

    private final ExtractService extractService;

    public EtlController(ExtractService extractService) {
        this.extractService = extractService;
    }
    public void Test(){
        //Scanner path of user;
        String path = ("./src/main/resources/data/test.csv");

        extractService.pathValid(path);
    }

}
