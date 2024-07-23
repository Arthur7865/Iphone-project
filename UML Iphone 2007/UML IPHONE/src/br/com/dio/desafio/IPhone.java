package br.com.dio.desafio;

public class IPhone extends ReprodutorMusical implements AparelhoTelefonico, NavegadorInternet {
    // Métodos de ReprodutorMusical são herdados diretamente

    // Implementação dos métodos de AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero + " usando o iPhone...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo a chamada usando o iPhone.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz no iPhone.");
    }

    // Implementação dos métodos de NavegadorInternet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url + " no iPhone.");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no iPhone.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página no iPhone.");
    }
}
