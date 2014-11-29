package Casa;

import animais.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;



public class Joana {
    private ArrayList<Galo> listaGalo = new ArrayList<Galo>();
    private ArrayList<Cachorro> listaCachorro = new ArrayList<Cachorro>();
    String p;
    public static void main(String Args[]) {
    Joana joana = new Joana();
    String n;
    Cachorro cachorro;
    Galo galo;
    int opcao = 0; //menu
		while (opcao != 7) {
			opcao = Integer.parseInt(JOptionPane.showInputDialog("Entre com a opção desejada:\n 1- Adicionar cachorro.\n 2- Adicionar galo.\n 3- Remover cachorro.\n 4- Remover Galo. \n 5- Consultar cachoro.\n 6- Consultar galo.\n 7- Sair"));
			if (opcao == 1) { // cadastrar moto
				n = JOptionPane.showInputDialog("Entre com o nome do cachorro");
                                cachorro = new Cachorro(n);
                                joana.adicionarCachorro(cachorro);
                        }
                        if(opcao == 2){
                            n = JOptionPane.showInputDialog("Entre com o nome do galo");
                            galo = new Galo(n);
                            joana.adicionarGalo(galo);
                        }
                        if(opcao == 3){
                            n = JOptionPane.showInputDialog("Entre com o nome do cachorro");
                            cachorro = new Cachorro(n);
                            joana.removerCachorro(n);
                        }
                        if(opcao == 4){
                            n = JOptionPane.showInputDialog("Entre com o nome do galo");
                            galo = new Galo(n);
                            joana.removerGalo(n);
                        }
                        if(opcao == 5){
                            n = JOptionPane.showInputDialog("Entre com o nome do cachorro");
                            cachorro = new Cachorro(n);
                            joana.consultarCachorro(n);
                        }
                        if(opcao == 6){
                            n = JOptionPane.showInputDialog("Entre com o nome do galo");
                            galo = new Galo(n);
                            joana.consultarGalo(n);
                        }
    
                }
    }
    //METODOS
    //PARTES DO CACHORRO
    public void adicionarCachorro(Cachorro cachorro){
	this.listaCachorro.add(cachorro);
	
    }
    
    public void removerCachorro(String nome){
        boolean foiEncontrado = false;
        if(this.listaCachorro.isEmpty()){
                JOptionPane.showMessageDialog(null,"Não tem cachorro");
                //não tem cachorro
        }
        else{
            for (int i = 0; i < listaCachorro.size(); i++) {
                Cachorro cachorro = (Cachorro) listaCachorro.get(i); //Salva o objeto Cachorro
                String n = cachorro.getNome();
                
                if (n.equalsIgnoreCase(nome)){
                    JOptionPane.showMessageDialog(null, "O cachorrinho "+cachorro.getNome()+" está indo embora agora com suas "+cachorro.getCaminhada(p));
                    this.listaCachorro.remove(i);
                    foiEncontrado = true;
                } 
                
            }
            if(!foiEncontrado){
                JOptionPane.showMessageDialog(null,"Cachorrinho não encontrado");
            }
        }
    }
    public void adicionarGalo(Galo galo) {
	listaGalo.add(galo);
	
    }
    
    public void removerGalo(String nome){
        boolean foiEncontrado = false;
        if(this.listaGalo.isEmpty()){
                JOptionPane.showMessageDialog(null,"Não tem gato");
                //não tem cachorro
        }
        else{
            for (int i = 0; i < listaGalo.size(); i++) {
                Galo galo = (Galo) listaGalo.get(i); //Salva o objeto Cachorro
                
                String n = galo.getNome();
                
                if (n.equalsIgnoreCase(nome)){
                    JOptionPane.showMessageDialog(null, "O galinho "+galo.getNome()+" está indo embora agora com suas "+galo.getCaminhada(p));
                    this.listaCachorro.remove(i);
                }
                               
            }
            if(!foiEncontrado){ 
                    JOptionPane.showMessageDialog(null,"Não tem esse gatinho aqui");
                
                }
        }
    }
    public void consultarGalo(String nome) {
	boolean foilocalizado = false;	
        if (this.listaGalo.isEmpty()) {
			JOptionPane.showMessageDialog(null,
					"Não tem nenhum gato na minha casa");
		}// senão... procurar moto
		else {
			for (int i = 0; i < listaGalo.size(); i++) {
				Galo galo = (Galo) listaGalo.get(i); // Salva o obejto moto
														// inteiro dentro da
														// variavel moto
				String n = galo.getNome(); // pega a placa do objeto moto e
											// salva em plc
				// se encontrar mostre
				if (n.equalsIgnoreCase(nome)) {
					JOptionPane.showMessageDialog(null, "O galinho "+ galo.getNome()+" está aqui sim");
                                        foilocalizado = true;
				}
                                if(!foilocalizado){
                                    JOptionPane.showMessageDialog(null, "O galinho não está aqui");
                                }
			}
		}
	}
    public void consultarCachorro(String nome) {
	boolean foilocalizado = false;	
        if (this.listaCachorro.isEmpty()) {
			JOptionPane.showMessageDialog(null,
					"Não tem nenhum gato na minha casa");
		}// senão... procurar moto
		else {
			for (int i = 0; i < listaCachorro.size(); i++) {
				Cachorro cachorro = (Cachorro) listaCachorro.get(i); // Salva o obejto moto
														// inteiro dentro da
														// variavel moto
				String n = cachorro.getNome(); // pega a placa do objeto moto e
											// salva em plc
				// se encontrar mostre
				if (n.equalsIgnoreCase(nome)) {
					JOptionPane.showMessageDialog(null, "O Cachorro "+ cachorro.getNome()+" está aqui sim");
                                        foilocalizado = true;
				}
                                if(!foilocalizado){
                                    JOptionPane.showMessageDialog(null, "O Cachorro não está aqui");
                                }
			}
		}
	}
}
