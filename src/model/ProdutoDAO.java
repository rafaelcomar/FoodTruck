/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


import controller.Produto;
import java.util.ArrayList;
import java.util.Random;


/**
 *
 * @author andre.facchin
 */
public class ProdutoDAO {

    Random rd = new Random();
    Produto produto;
    public static ArrayList<Produto> listaProdutos;

    public ProdutoDAO() {

        if (listaProdutos == null) {
            listaProdutos = new ArrayList<>();

            Produto p = new Produto();
            p.descricaoProduto = "Combo 1";
            p.codigo = rd.nextInt(1000);
            p.valor = 19.6;
            listaProdutos.add(p);
            Produto p2 = new Produto();
            p2.descricaoProduto = "Combo 2";
            p2.codigo = rd.nextInt(1000);
            p2.valor = 25.4;
            listaProdutos.add(p2);
            Produto p3 = new Produto();
            p3.codigo = rd.nextInt(1000);
            p3.descricaoProduto = "Combo 3";
            p3.valor = 15.10;
            listaProdutos.add(p3);
            Produto p4 = new Produto();
            p4.codigo = rd.nextInt(1000);
            p4.descricaoProduto = "Combo 4";
            p4.valor = 20.89;
            listaProdutos.add(p4);
            Produto p5 = new Produto();
            p5.codigo = rd.nextInt(1000);
            p5.descricaoProduto = "Combo 5";
            p5.valor = 32.60;
            listaProdutos.add(p5);
            Produto p6 = new Produto();
            p6.codigo = rd.nextInt(1000);
            p6.descricaoProduto = "Combo 6";
            p6.valor = 10.90;
            listaProdutos.add(p6);
           

        }

    }

    public void adicionarProduto(Produto produto) {
        if (produto != null) {
            listaProdutos.add(produto);
        }
    }

    public void excluirProduto(Produto produto) {
        if (produto != null) {
//            int position = listaProdutos.indexOf(produto);
            listaProdutos.remove(produto);

        }
    }

    public Produto pesquisarProduto(int codigo, String descProduto) {
        Produto produtoPesquisa = null;
        for (Produto pro : listaProdutos) {
            if (pro.descricaoProduto.equals(descProduto) || pro.codigo == codigo) {
                return pro;
            }
        }
        return produtoPesquisa;
    }

    public ArrayList<String[]> getListArrays() {
        ArrayList<String[]> listaObjetos = new ArrayList<>();

        for (Produto listaProduto : listaProdutos) {
            String[] obj = {String.valueOf(listaProduto.codigo), listaProduto.descricaoProduto};
            listaObjetos.add(obj);
        }
        return listaObjetos;
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
