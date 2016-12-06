/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.Cliente;
import controller.Pedido;
import controller.Produto;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import static model.ClienteDAO.listaClientes;



/**
 *
 * @author andre.facchin
 */
public class PedidoDAO {
    
    public Pedido pedido;
    public Produto prod;
    public Cliente cli;
    public int quantidade;
    public ArrayList<Pedido> pedidos = new ArrayList<>();
    
    
    public void adicionarPedido(Pedido ped){
        if (ped != null) {
            pedidos.add(ped);
        }
    }
    
    public void atualizarPedido(Pedido pedido) {
        pedidos.remove(pedido);
        pedidos.add(pedido);
    }
    
    public Pedido pesquisarPedido(int cod){
        pedido = null;
        for (Pedido pedido1 : pedidos) {
            if (pedido1.codigo == cod) {
                pedido = pedido1;
            }
        }
        
        return pedido;
    }
    
    public ArrayList<String[]> getListArrays() {
        ArrayList<String[]> listaObjetos = new ArrayList<>();
        SimpleDateFormat dtformate = new SimpleDateFormat("HH:mm:ss");
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.UP);
        
        if (pedidos.size() > 0) {
            for (Pedido pedido : pedidos) {
                String[] obj = {String.valueOf(pedido.codigo), pedido.cliente.nome , pedido.pedidoDescricao, df.format(pedido.total) , String.valueOf(dtformate.format(pedido.data)) , pedido.status};
                listaObjetos.add(obj);
            }
        }
        
        
        return listaObjetos;
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

        
}
