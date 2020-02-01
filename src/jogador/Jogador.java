/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogador;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author eluiz
 */
@Entity
@Table(name="tbJogador")
public class Jogador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String nickname;
    @Column
    private int tempo_jogo;
    @Column
    private int num_jogadas;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getTempo_jogo() {
        return tempo_jogo;
    }

    public void setTempo_jogo(int tempo_jogo) {
        this.tempo_jogo = tempo_jogo;
    }

    public int getNum_jogadas() {
        return num_jogadas;
    }

    public void setNum_jogadas(int num_jogadas) {
        this.num_jogadas = num_jogadas;
    }


}
