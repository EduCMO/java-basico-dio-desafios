public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{
    public void tocar() {
    System.out.println("REPRODUZINDO MÚSICA!");
    }


    public void pausar() {
        System.out.println("PAUSANDO MÚSICA");
    }

    public void selecionarMusica(String musica) {
        System.out.println("PRÓXIMA MÚSICA: " + musica);
    }


    public void ligar(String numero) {
        System.out.println("LIGANDO PARA " + numero);
    }


    public void atender() {
        System.out.println("ATENDENDO LIGAÇÃO");
    }


    public void iniciarCorreioVoz() {
        System.out.println("CORREIO DE VOZ INICIADO");
    }


    public void exibirPagina(String url) {
        System.out.println("PÁGINA ATUAL: " + url);
    }


    public void adicionarNovaAba() {
        System.out.println("NOVA ABA");
    }


    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PAGINA");
    }
   
    public static void main(String[] args) {
        
        
    Iphone iphone = new Iphone();

    System.out.println(">>>>>>>>>> REPRODUTOR MUSICAL <<<<<<<<<<");

    iphone.tocar();
    iphone.pausar();
    iphone.selecionarMusica("Unshaken - D'Angelo");

    System.out.println(">>>>>>>>>> APARELHO TELEFONICO <<<<<<<<<<");
    iphone.ligar("87992113270");
    iphone.atender();
    iphone.iniciarCorreioVoz();

    System.out.println(">>>>>>>>>> NAVEGADOR DA INTERNET <<<<<<<<<<");

    iphone.exibirPagina("https://www.habbo.com");
    iphone.adicionarNovaAba();
    iphone.atualizarPagina();
   }


}
