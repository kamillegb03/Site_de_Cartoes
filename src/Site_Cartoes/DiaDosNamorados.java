package Site_Cartoes;

public class DiaDosNamorados extends Cartao{

    public DiaDosNamorados(Pessoa destinatario) {
        super(destinatario);
    }

    @Override
    public void showMessage() {
        if(getMensagemPlus() == null){
            setMensagemPlus("");
        }
        String textBlock = getDestinatario().getNome()+" "+getDestinatario().getSobrenome() +"""
        ,

        Hoje é um dia especial, mais uma data em que celebramos 
        nosso amor e tudo de maravilhoso que temos vivido.

        Sou tão feliz por ter você ao meu lado. Só o que posso 
        dizer é que tenho sorte de ter te encontrado e, no dia 
        de hoje, passar o dia dos namorados com o amor da minha vida.

        Feliz Dia Dos Namorados!
        Eu amo você infinitamente!

        """
        +getMensagemPlus()
        ;
        System.out.println(textBlock);
    }
}
