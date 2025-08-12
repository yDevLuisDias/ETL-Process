package com.example.Etl_basic.service;

import com.example.Etl_basic.model.FilesEntity;
import org.apache.commons.io.FilenameUtils;

public class ExtractService {

    public void pathValid(String path){
        //Valid if a file is csv, json or xml
        if (path.endsWith(".csv") || path.endsWith(".json") || path.endsWith(".xml")){

            //Extract suffix of a file
            String extractExtension = FilenameUtils.getExtension(path);
            System.out.println(STR."File is \{extractExtension}");
        }
        else if (path.isEmpty()){
            System.out.println("File is empty");
        }else {
            System.out.println("File is not csv, json or xml");
        }
    }

    public void setPath(String path){

        pathValid(path);

        if (path.endsWith(".csv")){
            //test of path
            System.out.println("File is csv");
            fileReaderCsv();
        }
        else if (path.endsWith(".json")){
            fileReaderJson();
        }
        else if (path.endsWith(".xml")){
            fileReaderXml();
        }
    }

    public FilesEntity fileReaderCsv(){
        //Test of path
        System.out.println("File is csv");
        return null;
    }

    public FilesEntity fileReaderJson(){

        return null;
    }

    public FilesEntity fileReaderXml(){

        return null;
    }

}
