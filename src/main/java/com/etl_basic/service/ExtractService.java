package com.etl_basic.service;

import com.etl_basic.model.CsvEntity;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExtractService {

    TransformService transformService;

    public ExtractService(TransformService transformService) {
        this.transformService = transformService;
    }

    List<String> csvColumns = new ArrayList<>();
    List<String> jsonColumns = new ArrayList<>();
    List<String> xmlColumns = new ArrayList<>();

    public ExtractService() {
    }

    public CsvEntity inputPathCsv(String path){
        try(BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();
            var header = line.split(",");

            while((line = br.readLine()) != null){

                var data = line.split(",");

                csvColumns.add(data[0]);
                csvColumns.add(data[1]);
                csvColumns.add(data[2]);

                if (csvColumns == null){
                    System.out.println("Vazio");
                }
            }

        }catch(IOException e){
            System.out.println("ERROR : " + e.getMessage());
        }

        return new CsvEntity();
    }

    public void inputPathJson(String path){

    }

    public void inputPathXml(String path){

    }
}