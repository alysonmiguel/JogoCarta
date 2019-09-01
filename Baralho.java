/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogocartas;

import java.util.Random;

/**
 *
 * @author Alyson
 */
public class Baralho {
    
    private Random aleatorio = new Random();
    private int controlador;
    Carta[] carta;
    

    public Baralho() {
        String[] face = { "A", "K", "J", "Q", "1", "2","3", "4", "5", "6", "7", "8", "9" }; 
        String[] naipe = {"copas","espadas","paus","ouros"};
        
        carta = new Carta[52];
        
        for (int i = 0; i < carta.length; i++) {
            carta[i] = new Carta(face[i],naipe[i]); // i % 13
        }
        
        
    }
   
    public void mostrarBaralho(){
         for (int i = 0; i < carta.length; i++) {
               toString();
        }
    }
    public void embaralhar(){
        controlador = 0;
        for (int i = 0; i < carta.length; i++) {
          int numero = aleatorio.nextInt(52);
        
          Carta temp = carta[i];
          carta[i] = carta[numero];
          carta[numero] = temp;
        }
        
    }
    public Carta distribuirCartas(int qtdCartas){
        
        if(controlador < carta.length){
            return carta[controlador++];
        }else{      
        return null; 
        }
    }
    
    public Carta[] getCartas(){
        return null;
    }
   
      
 
}
