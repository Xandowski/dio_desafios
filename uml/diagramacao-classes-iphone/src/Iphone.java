public class Iphone implements ReprodutorMusical, AparelhoTelefonico, Navegador{
    @Override
    public void tocar(){
        System.out.println("Tocando musica");
    }
    @Override
    public void pausar(){
        System.out.println("Pausando musica");
    }

    @Override
    public void selecionarMusica(){
        System.out.println("Selecionando musica");
    }

    @Override
    public void ligar(String numero){
        System.out.println("Ligando para " + numero);
    }

    @Override
    public void atender(String numero){
        System.out.print("Atendendo ligação de " + numero);
    }

    @Override
    public void iniciarCorreioVoz(String numero){
        System.out.println("Iniciando chamada de voz para o numero " + numero);
    }

    @Override
    public void exibirPagina(String url){
        System.out.println("Exibindo a pagina " + url);
    }

    @Override
    public void adicionarNovaAba(String url){
        System.out.println("Criando nova aba para " + url);
    }

    @Override
    public void atualizarPagina(){
        System.out.println("Atualizando pagina");
    }
}
