/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author rafael.comar
 */
public class Pedido {
    
    public int codigo;
    public Cliente cliente;
    public ArrayList<Produto> produtos = new ArrayList<>();
    public Date data;
    public double total;
    public String status;
    public String pedidoDescricao = "";
    
    public Pedido(){
        
    }
    public Pedido(int i){
        this.codigo = i;
    }
    
    
    
}
