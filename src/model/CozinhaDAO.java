/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.Pedido;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author rafael.comar
 */
public class CozinhaDAO {
    
     public static ArrayList<String[]> getListArrays(ArrayList<Pedido> pedidos) {
        ArrayList<String[]> listaObjetos = new ArrayList<>();
//        SimpleDateFormat dtformate = new SimpleDateFormat("HH:mm:ss");
//        DecimalFormat df = new DecimalFormat("#.##");
//        df.setRoundingMode(RoundingMode.UP);
        
        if (pedidos.size() > 0) {
            for (Pedido pedido : pedidos) {
                String[] obj = {String.valueOf(pedido.codigo), pedido.pedidoDescricao, pedido.status};
                listaObjetos.add(obj);
            }
        }
        
        
        return listaObjetos;
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
