/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.Cliente;
import java.util.ArrayList;

/**
 *
 * @author rafael.comar
 */
public class ClienteDAO {

    Cliente cliente;
    public static ArrayList<Cliente> listaClientes = new ArrayList<>();
    
    public ClienteDAO() {
    }
    
    public void adicionarCliente(Cliente cliente){
        if (cliente != null) {
            listaClientes.add(cliente);
        }
    }
    
    public void excluirCliente(Cliente cliente){
        if (cliente != null) {
//            int position = listaClientes.indexOf(cliente);
            listaClientes.remove(cliente);
                    
        }
    }
    
    public Cliente pesquisarCliente(int codigo, String nome){
        Cliente clientePesquisa = null;
        for (Cliente cli : listaClientes) {
            if (cli.nome.equals(nome) || cli.codigo == codigo) {
                return cli;
            }
        }
        return clientePesquisa;
    }

    public ArrayList<String[]> getListArrays() {
        ArrayList<String[]> listaObjetos = new ArrayList<>();
        
        for (Cliente listaCliente : listaClientes) {
            String[] obj = {String.valueOf(listaCliente.codigo) , listaCliente.nome};
            listaObjetos.add(obj);
        }
        return listaObjetos;
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public ArrayList<String[]> transformaListArray(ArrayList<Cliente> listaClientePesquisado) {
        ArrayList<String[]> listaObjetos = new ArrayList<>();
        
        for (Cliente listaCliente : listaClientePesquisado) {
            String[] obj = {String.valueOf(listaCliente.codigo) , listaCliente.nome};
            listaObjetos.add(obj);
        }
        return listaObjetos;
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
