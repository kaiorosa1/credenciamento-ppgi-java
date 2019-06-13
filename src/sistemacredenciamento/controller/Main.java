package sistemacredenciamento.controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import sistemacredenciamento.model.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kaio Rosa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Read Files and create the objects
       String docentesFile = "C:\\Users\\user\\Documents\\NetBeansProjects\\SistemaCredenciamentoPPGI\\src\\sistemacredenciamento\\docentes.csv";
       String veiculosFile = "C:\\Users\\user\\Documents\\NetBeansProjects\\SistemaCredenciamentoPPGI\\src\\sistemacredenciamento\\veiculos.csv";
       
       List<Docente> listaDocentes = null;
       List<Veiculo> listaVeiculos = null;
        
       try {
            listaDocentes = readDocentes(docentesFile);
            listaVeiculos = readVeiculos(veiculosFile);
            // ler publicacoes file
            // ler qualificacoes file
            // ler regras de pontuacao file
            
        } catch (ParseException ex) {
            System.out.println("Error ao converter data");
        }
       
       
//       printListaDocente(listaDocentes);
//       printListaVeiculos(listaVeiculos);
    }
    
    public static List<Docente> readDocentes(String fName) throws ParseException{
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ";";
        
        List<Docente> listaDocentes = new ArrayList<>();
        
        try {

            br = new BufferedReader(new FileReader(fName));
            // header of the file
            line = br.readLine();
            while ((line = br.readLine()) != null) {

                String[] codigo = line.split(cvsSplitBy,'\n');
               
                if(Objects.equals(codigo[4],"X")){
                    listaDocentes.add( new Docente(Long.parseLong(codigo[0]), codigo[1],new SimpleDateFormat("dd/MM/yyyy").parse(codigo[2]),new SimpleDateFormat("dd/MM/yyyy").parse(codigo[3]),true));
                    
                }else{
                    listaDocentes.add( new Docente(Long.parseLong(codigo[0]), codigo[1],new SimpleDateFormat("dd/MM/yyyy").parse(codigo[2]),new SimpleDateFormat("dd/MM/yyyy").parse(codigo[3]),false));
                
                }
            }

        } catch (Exception e) {
             System.out.println( e.getMessage());
            
        } 
        
        return listaDocentes;
    }
    
    public static List<Veiculo> readVeiculos(String fName) throws ParseException{
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ";";
        
        List<Veiculo> listaVeiculos = new ArrayList<>();
        
        try {

            br = new BufferedReader(new FileReader(fName));
            // header of the file
            line = br.readLine();
            while ((line = br.readLine()) != null) {

                String[] codigo = line.split(cvsSplitBy,'\n');
                
                listaVeiculos.add(new Veiculo(codigo[0].trim(),codigo[1].trim(),codigo[2].charAt(0),Double.parseDouble(codigo[3].trim().replace(',', '.')),codigo[4].trim()));
                
            }

        } catch (IOException | NumberFormatException e) {
            System.out.println( e.getMessage());       
        } 
        
        return listaVeiculos;
    }
    
    
    
    
    public static void printListaDocente(List<Docente> list){
        
        list.forEach((l) -> {
            System.out.println(l.getNome());
        });
        
    }
    public static void printListaVeiculos(List<Veiculo> list){
        
        list.forEach((l) -> {
            System.out.println(l.getSigla() + " "+ l.getNome());
        });
        
    }
}

