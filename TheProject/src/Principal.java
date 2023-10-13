import br.com.guismx.screenmatch.calculos.CalculadoraDeTempo;
import br.com.guismx.screenmatch.calculos.FiltroRecomendacao;
import br.com.guismx.screenmatch.modelos.Filme;
import br.com.guismx.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme Meufilme = new Filme();
        Meufilme.setNome("Avatar");
        Meufilme.setAnoDeLancamento(1980);
        Meufilme.setDuracaoEmMinutos(200);
        Meufilme.setIncluidoNoPlano(true);

//COMANDO PARA EXIBIR A FICHA TÉCNICA DO FILME
        Meufilme.exibeFichaTecnica();
        Meufilme.avalia(10);
        Meufilme.avalia(8);
        Meufilme.avalia(9);
//SOMA DAS AVALIAÇÕES
        System.out.println("Total de avaliações: " + Meufilme.getTotalDeAvaliacao());
        System.out.println(Meufilme.pegaMedia());
//DADOS DA SÉRIE
        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2005);
        lost.exibeFichaTecnica();
        lost.setTemporadas(6);
        lost.setEpisodioPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar LOST: " + lost.getDuracaoEmMinutos());

        Filme outroFilme = new Filme();
        outroFilme.setNome("Carros");
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(180);
//CALCULAR TEMPO TOTAL SOMANDO FILME E SÉRIE
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(Meufilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());
//FILTRO PARA AS RECOMENDAÇÕES
        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(Meufilme);
    }
}
