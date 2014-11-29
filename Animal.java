
package animais;


public class Animal {
        protected String nome;
        protected String caminhada;

    

  
        public Animal(String n){//metodo construtor
            setNome(n);
        } 
        public void setNome(String n) {
        this.nome = n;
    }
        public String getNome() {
        return this.nome;
    }
        public String getCaminhada(String pernas){//metodo pra retornar o numero de patas
            return this.caminhada + " patas";
        }
        
}
