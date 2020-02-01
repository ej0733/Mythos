/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogador;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author eluiz
 */
public class JogadorTableModel extends AbstractTableModel{
    private List<Jogador> jogadores = new ArrayList<>();
    private String[] colunas = {"Nickname", "Tempo", "Número de Jogadas"};

    @Override
    public int getRowCount() {
        return jogadores.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        switch(coluna){
            case 0:
                return jogadores.get(linha).getNickname();
            case 1:
                return jogadores.get(linha).getTempo_jogo();
            case 2:
                return jogadores.get(linha).getNum_jogadas();
        }
        return null;
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }
    
    public void adicionarLinha(Jogador j){
        this.jogadores.add(j);
        this.fireTableDataChanged();
    }
    
    public void limpar(){
        jogadores.clear();
    }
}
