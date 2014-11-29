/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package animais;


public class Cachorro extends Animal {
        
    public Cachorro(String n){// construtor
        super(n); // pega o construtor da classe principal
        caminhada = "4 "; //numero de patas pro cachorro
    }
    public String getAndando(){
        return caminhada;
    }
    
    }
