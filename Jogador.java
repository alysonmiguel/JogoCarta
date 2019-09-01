/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogocartas;

/**
 *
 * @author Alyson
 */
public class Jogador {
    private String nome;
    private Carta[] carta;

    public Jogador(String nome) {
        this.nome = nome;
    }
   
    public void setCartas(Carta[] cartas){
    
    }
    
    public void mostrarCartas(){
        System.out.println("CARTAS DE "+ nome);
        
        for (int i = 0; i < carta.length; i++) {
              toString();
        }
        
    }
    
}
