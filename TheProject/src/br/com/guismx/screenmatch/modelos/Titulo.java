package br.com.guismx.screenmatch.modelos;

public class Titulo {
    //ATRIBUTOS DO TÍTULO
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacao;
    private int totalDeAvaliacao;
    private int media;
    private int duracaoEmMinutos;

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }


    public int getTotalDeAvaliacao() {
        return totalDeAvaliacao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setMedia(int media) {
        this.media = media;
    }
    public void exibeFichaTecnica() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("O filme possui: " +  duracaoEmMinutos + " minutos");

    }
    public void avalia (double nota){
        somaDasAvaliacao += nota;
        totalDeAvaliacao++;
    }
    public double pegaMedia() {
        return somaDasAvaliacao / totalDeAvaliacao;
    }
}
