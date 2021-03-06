/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemacredenciamento.model;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Kaio Rosa
 */
public class RegrasPontuacao {

    private Date dataInicio;
    private Date dataFim;
    private List<Qualis> listaQualis;
    private double multiplicadorPeridicos;
    private int quantidadeDeAnosConsiderar;
    private int pontuacaoMinimaRecredenciamento;

    public RegrasPontuacao() {

    }

    public RegrasPontuacao(Date dataInicio, Date dataFim, List<Qualis> listaQualis, double multiplicadorPeridicos, int quantidadeDeAnosConsiderar, int pontuacaoMinimaRecredenciamento) {
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.listaQualis = listaQualis;
        this.multiplicadorPeridicos = multiplicadorPeridicos;
        this.quantidadeDeAnosConsiderar = quantidadeDeAnosConsiderar;
        this.pontuacaoMinimaRecredenciamento = pontuacaoMinimaRecredenciamento;
    }

    public List<Qualis> getListaQualis() {
        return listaQualis;
    }

    public void setListaQualis(List<Qualis> listaQualis) {
        this.listaQualis = listaQualis;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public double getMultiplicadorPeridicos() {
        return multiplicadorPeridicos;
    }

    public void setMultiplicadorPeridicos(double multiplicadorPeridicos) {
        this.multiplicadorPeridicos = multiplicadorPeridicos;
    }

    public int getQuantidadeDeAnosConsiderar() {
        return quantidadeDeAnosConsiderar;
    }

    public void setQuantidadeDeAnosConsiderar(int quantidadeDeAnosConsiderar) {
        this.quantidadeDeAnosConsiderar = quantidadeDeAnosConsiderar;
    }

    public int getPontuacaoMinimaRecredenciamento() {
        return pontuacaoMinimaRecredenciamento;
    }

    public void setPontuacaoMinimaRecredenciamento(int pontuacaoMinimaRecredenciamento) {
        this.pontuacaoMinimaRecredenciamento = pontuacaoMinimaRecredenciamento;
    }

}
