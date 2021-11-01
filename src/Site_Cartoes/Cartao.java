package Site_Cartoes;

public abstract class Cartao {
    private Pessoa destinatario;
    private String mensagemPlus;

    public Cartao(Pessoa destinatario) {
        this.destinatario = destinatario;
    }

    public Pessoa getDestinatario() {
        return destinatario;
    }
    public void setDestinatario(Pessoa destinatario) {
        this.destinatario = destinatario;
    }

    public String getMensagemPlus() {
        return mensagemPlus;
    }
    public void setMensagemPlus(String mensagemPlus) {
        this.mensagemPlus = mensagemPlus;
    }

    public abstract void showMessage();
}
