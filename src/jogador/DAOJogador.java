/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogador;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import sgbd.ConnectionFactory;
import view.IniciarSessao;
import org.hibernate.Session;

/**
 *
 * @author eluiz
 */
public class DAOJogador {   
    public void criar(Jogador j){
        em.getTransaction().begin();
        em.persist(j);
        em.getTransaction().commit();
    }
    
    public void atualizar(Jogador j){
        em.getTransaction().begin();
        em.merge(j);
        em.getTransaction().commit();
    }
    
    public List<Jogador> listar(String listar){
        List<Jogador> jogadores = new ArrayList<>();
        if(listar.equals("Tempo")){
            jogadores = em.createQuery("FROM Jogador ORDER BY tempo_jogo ASC").getResultList();
        }
        else if(listar.equals("Jogadas")){
            jogadores = em.createQuery("FROM Jogador ORDER BY num_jogadas ASC").getResultList();
        }
        else{
            jogadores = em.createQuery("FROM Jogador").getResultList();
        }
        return jogadores;
    }
    
    public void remover(Jogador j){
        em.getTransaction().begin();
        em.remove(j);
        em.getTransaction().commit();
    }
    
    public Jogador buscarJogador(Jogador j, int id){
        j = em.find(Jogador.class, j.getId());
        return j;
    }
    
    EntityManager em = new ConnectionFactory().getConnection();
    IniciarSessao is;
    Session session;
}
