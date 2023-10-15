package org.devwander;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private String nome;
    private String modelo;
    private int armazenamento;

    public Iphone(String nome, String modelo, int armazenamento) {
        this.nome = nome;
        this.modelo = modelo;
        this.armazenamento = armazenamento;
    }

    @Override
    public void tocar() {
        System.out.println("TOCANDO");
    }

    @Override
    public void pausar() {
        System.out.println("PAUSANDO");
    }

    @Override
    public void selecionarMusica(Musica musica) {
        System.out.println("SELECIONANDO MUSICA");
    }

    @Override
    public void ligar() {
        System.out.println("LIGANDO");
    }

    @Override
    public void atender() {
        System.out.println("ATENDENDO");
    }

    @Override
    public void iniciarConversaVoz() {
        System.out.println("INICIANDO CONVERSA DE VOZ");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("EXIBINDO PÁGINA");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("ADICIONANDO NOVA ABA");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PÁGINA");
    }
}
