/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author 182210051
 */
public class ProdutoVO {
    
   private long idproduto;
   private String nomepro;
   private int quantidade;
   private double valorcusto;
   private ArrayList tipoproduto;

    public long getIdproduto() {
        return idproduto;
    }

    public void setIdproduto(long idproduto) {
        this.idproduto = idproduto;
    }

    public String getNomepro() {
        return nomepro;
    }

    public void setNomepro(String nomepro) {
        this.nomepro = nomepro;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorcusto() {
        return valorcusto;
    }

    public void setValorcusto(double valorcusto) {
        this.valorcusto = valorcusto;
    }

    public ArrayList getTipoproduto() {
        return tipoproduto;
    }

    public void setTipoproduto(ArrayList tipoproduto) {
        this.tipoproduto = tipoproduto;
    }
   
   
    
}
