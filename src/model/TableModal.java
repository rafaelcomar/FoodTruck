/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.Cliente;
import controller.Pedido;
import controller.Produto;
import java.awt.HeadlessException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author rafael.comar
 */
//public class TableModal {
//    
//}
@SuppressWarnings("serial")
public class TableModal extends JFrame {
    Cliente cliente;
    Produto produto;
    Pedido pedido;
    String[] colunas;
    ArrayList<Object> lista;
    
    
    
    
//    public TableModal(String[] nomesColunas , ArrayList<Object> list)  {
//        colunas = nomesColunas;
//        this.lista = list;
//    }
    /**
     * Modelo hipotético para fornecer dados para a JTable<BR>
     */
    private class MeuModeloComMuitasLinhas extends AbstractTableModel {

        /**
         * A JTable chama esse método para saber quantas colunas ela possui
         */
        @Override
        public int getColumnCount() {
            
            return colunas.length;
        }

        /**
         * A JTable chama esse método para saber qual é o nome da coluna informada
         */
        @Override
        public String getColumnName(int col) {
            // o nome das colunas será "coluna 0", "coluna 1" e "coluna 2"
            // mas poderia ser algo mais óbvio como "Nome", "Idade" e "Gênero" por exemplo
            return colunas[col];
        }

        /**
         * A JTable chama esse método para saber quantos itens ela possui
         */
        @Override
        public int getRowCount() {
            // minha JTable terá 10 mil linhas
            // mas poderia por exemplo retornar o tamanho da lista de objetos que quero renderizar
            int qtdLinhas = 0;
            if (lista != null) {
                qtdLinhas = lista.size();
            }
            return qtdLinhas;
        }

        /**
         * A JTable chama esse método para saber qual o valor que ela deve apresentar na célula informada
         */
        @Override
        public Object getValueAt(int lin, int col) {
            // cada célula da minha JTable vai renderizar sua linha e sua coluna
            // mas poderia fazer o seguinte:
            // pegar o objeto na posição "lin" da lista
            // um switch da coluna e com isso
            // devolver o valor dos atributos "nome", "idade" e "genero"
            
            return "célula (" + lin + ", " + col + ")";
        }
    }

    /**
     * Ponto de entrada do exemplo
     */
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            JFrame janela = new TableModal();
            janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            janela.setSize(640, 480);
            janela.setLocationRelativeTo(null);
            janela.setVisible(true);
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

//    private ExemploTableModel() {
//        super("Exemplo");
//
//        /*
//         * Vejam, aqui eu digo para a JTable utilizar o meu modelo de dados assim, não preciso me preocupar em fazer laços para inserir itens
//         */
//        JTable table = new JTable(new MeuModeloComMuitasLinhas());
//
//        JScrollPane scroll = new JScrollPane(table);
//        Container panel = getContentPane();
//        panel.add(BorderLayout.CENTER, scroll);
//    }
}