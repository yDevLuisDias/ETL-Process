package com.etl_basic.service;

import com.etl_basic.model.CsvEntity;
import com.etl_basic.model.JsonEntity;

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
                csvColumns.add(data[3]);

                if (csvColumns == null){
                    System.out.println("Vazio");
                }
            }
        }catch(IOException e){
            System.out.println("ERROR : " + e.getMessage());
        }
        return new CsvEntity();
    }

    public JsonEntity inputPathJson(String path){
        try(BufferedReader bf = new BufferedReader(new FileReader(path))){
            String line = bf.readLine();

            while ((line = bf.readLine()) != null){
                var data = line.split("\"\"");

                jsonColumns.add(data[0]);
                jsonColumns.add(data[1]);

                if (jsonColumns == null){
                    System.out.println("vazio");
                }
            }
        }catch (IOException e){
            System.out.println("ERROR : " + e.getMessage());
        }
        return new JsonEntity();
    }

    public void inputPathXml(String path){

    }
}