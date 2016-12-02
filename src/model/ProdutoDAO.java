/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.Produto;
import java.util.ArrayList;

/**
 *
 * @author rafael.comar
 */
public class ProdutoDAO {
    Produto produto;
    ArrayList<Produto> listaProdutos = new ArrayList<>();
    
    public ProdutoDAO() {
    }
    
    public void adicionarProduto(Produto produto){
        if (produto != null) {
            listaProdutos.add(produto);
        }
    }
    
    public void excluirProduto(Produto produto){
        if (produto != null) {
//            int position = listaProdutos.indexOf(produto);
            listaProdutos.remove(produto);
                    
        }
    }
    
    public Produto pesquisarProduto(int codigo, String descProduto){
        Produto produtoPesquisa = null;
        for (Produto pro : listaProdutos) {
            if (pro.descricaoProduto.equals(descProduto) || pro.codigo == codigo) {
                return pro;
            }
        }
        return produtoPesquisa;
    }
}
