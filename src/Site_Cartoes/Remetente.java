package Site_Cartoes;

import java.util.ArrayList;

public class Remetente extends Pessoa{
    
    protected ArrayList <Cartao> listacartoes = new ArrayList<Cartao>();

    public Remetente(String nome, String sobrenome, String email) {
        super(nome, sobrenome, email);
    }

    public void addCartão(Cartao c){ 
        listacartoes.add(c);
    }
    
    public void showCartão(Cartao c){
        c.showMessage();
        System.out.println("Assinado por: "+getNome()+" "+getSobrenome());
    }
}
