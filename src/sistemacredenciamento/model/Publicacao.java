/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemacredenciamento.model;

import java.util.List;

/**
 *
 * @author Kaio Rosa
 */
public class Publicacao {
    private int ano;
    private String siglaVeiculo;
    private String titulo;
    List<Docente> listaAutores;
    private int numero;

    public Publicacao(int ano, String siglaVeiculo, String titulo, List<Docente> listaAutores, int numero, int paginalInical, int paginaFinal) {
        this.ano = ano;
        this.siglaVeiculo = siglaVeiculo;
        this.titulo = titulo;
        this.listaAutores = listaAutores;
        this.numero = numero;
        this.paginalInical = paginalInical;
        this.paginaFinal = paginaFinal;
    }
    
   
    private int paginalInical;
    private int paginaFinal;

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getSiglaVeiculo() {
        return siglaVeiculo;
    }

    public void setSiglaVeiculo(String siglaVeiculo) {
        this.siglaVeiculo = siglaVeiculo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }


    public int getPaginalInical() {
        return paginalInical;
    }

    public void setPaginalInical(int paginalInical) {
        this.paginalInical = paginalInical;
    }

    public int getPaginaFinal() {
        return paginaFinal;
    }

    public void setPaginaFinal(int paginaFinal) {
        this.paginaFinal = paginaFinal;
    }
    
    
}