package com.mycompany.ej1_accesoadatos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Properties;

public class Fichero_Facil implements Serializable{
    public ArrayList<String> arrayFacil;

    public void palabras(){
        Properties dificultad = new Properties();
        try { 
            dificultad.load(Files.newInputStream(Path.of("palabras.properties"))) ;
            String fileproperties = dificultad.getProperty("filepropertiesF");
            Charset charset = StandardCharsets.UTF_8;
            arrayFacil = (ArrayList<String>) Files.readAllLines(Paths.get(fileproperties), charset);
            }catch(IOException ex){
                System.err.println("error 404");
            }
    }
}

