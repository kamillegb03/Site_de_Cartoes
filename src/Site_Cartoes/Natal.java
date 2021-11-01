package Site_Cartoes;

public class Natal extends Cartao{

    public Natal(Pessoa destinatario) {
        super(destinatario);
    }

    @Override
    public void showMessage(){
        if(getMensagemPlus() == null){
            setMensagemPlus("");
        }
        String textBlock = getDestinatario().getNome()+" "+getDestinatario().getSobrenome() +"""
        ,

        Mais um ano chega ao fim..
        mais uma vez o espírito de Natal chega para suavizar os nossos dias, 
        e trazer brilho e alegria para as nossas vidas.
        O meu pedido especial para o próximo ano que se inicia é que a energia 
        e as boas vibrações encham seu coração com o amor do Natal, 
        e permaneça sempre em sua vida.

        Tenha um Natal muito Feliz e um Ano Novo pleno de realizações! 
        Muito sucesso, paz, amor e saúde.

        """
        +getMensagemPlus()
        
        ;
        System.out.println(textBlock);
    }
}
