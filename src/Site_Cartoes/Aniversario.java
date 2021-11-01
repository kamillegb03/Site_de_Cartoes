package Site_Cartoes;

public class Aniversario extends Cartao{

    public Aniversario(Pessoa destinatario) {
        super(destinatario);
    }

    @Override
    public void showMessage() {
        if(getMensagemPlus() == null){
            setMensagemPlus("");
        }
        String textBlock =getDestinatario().getNome()+" "+getDestinatario().getSobrenome() +"""
        ,
        
        Tenha um feliz aniversário cheio
        de sorrisos e gargalhadas, repleto
        de paz, amor e muita alegria.
        Parabéns por mais um ano de vida!
        
        """
        +getMensagemPlus()
        ;
        System.out.println(textBlock);
    }

}
