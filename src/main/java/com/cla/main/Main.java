package com.cla.main;

import com.cla.excel.CreadorExcel;
import com.cla.excel.LectorExcel;
import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by alaya on 7/09/17.
 */
public class Main {


    private final static Logger log = Logger.getLogger(Main.class);

    public static void main(String[] args) throws IOException {

        log.debug("Log funcionando");

        if (args.length == 0) {
            System.out.println("Debe ingresar el nombre del archivo");
            System.exit(-1);
        }

        //CreadorExcel.crear();
        LectorExcel.leer();

        System.out.println("Nombre del archivo : " + args[0]);
/*
        System.out.println("Iniciando...\n" + new Date());
        System.out.println(new Main().leerArchivo());
        System.out.println("Hecho\n" + new Date());
        */


        log.debug("Log funcionando");
        log.warn("Log funcionando");
        log.info("Log funcionando");
        log.error("Log funcionando");

    }


    public String leerArchivo(){

        String csvFile = "/home/alaya/Escritorio/FL_insurance_sample.csv";
        String linea = "";
        StringBuilder sb = new StringBuilder();


        try(BufferedReader br = new BufferedReader(new FileReader(csvFile))){

            while ((linea = br.readLine()) != null){
                    sb.append(linea).append("\n");
            }

        }catch (IOException e){
            e.printStackTrace();
        }

        return sb.toString();
    }
}
