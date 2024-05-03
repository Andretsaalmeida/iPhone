import devices.IPhone;

public class Main {
    public static void main(String[] args) {
        // Criando uma instância de iPhone
        IPhone iPhone = new IPhone();

        // Utilizando os métodos das interfaces
        iPhone.selecionarMusica();
        iPhone.tocar();
        iPhone.pausar();

        iPhone.ligar();
        iPhone.atender();
        iPhone.iniciarCorreioVoz();


        iPhone.exibirPagina();
        iPhone.adicionarNovaAba();
        iPhone.atualizarPagina();
    }
}

