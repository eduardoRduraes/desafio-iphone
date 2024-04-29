import intercace.AparelhoTelefonico;
import intercace.NavegadorNaInternet;
import intercace.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, NavegadorNaInternet, AparelhoTelefonico {
    private String numeroDeSerie;

    public Iphone(String numeroDeSerie) {
        this.numeroDeSerie = numeroDeSerie;
    }

    public String getNumeroDeSerie() {
        return numeroDeSerie;
    }

    public void setNumeroDeSerie(String numeroDeSerie) {
        this.numeroDeSerie = numeroDeSerie;
    }


    @Override
    public void tocar() {
        System.out.println("Ligar tocador de musica!");
    }

    @Override
    public void pausar() {
        System.out.println("pausar musica!");

    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionar "+musica);
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo pagina");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina");
    }

    @Override
    public void ligar(String contato) {
        System.out.println("Ligando para: "+contato);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação!");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }
}
