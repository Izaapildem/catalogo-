public class Filme {

    private Condicoes condicoes;
    private String titulo;
    private String autor;
    private int anoDeLancamento;
    private double media;
    private String sinopse;

    public Filme(String titulo, String autor, int anoDeLancamento, double media, String sinopse) {
        this.autor = autor;
        this.titulo = titulo;
        this.anoDeLancamento = anoDeLancamento;
        this.media = media;
        this.sinopse = sinopse;
    }

    public String verificarLancamento() {
        if (anoDeLancamento > 2025) {
            return "Lançamentos que os clientes estão curtindo!";
        } else {
            return "Filmes que você vai adorar!";
        }
    }

    public void setCondicoes(Condicoes condicoes) {
        this.condicoes = condicoes;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public double getMedia() {
        return media;
    }

    public String getSinopse() {
        return sinopse;
    }

    public String getAutor() {
        return autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void exibirInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        System.out.println("Média: " + media);
        System.out.println("Sinopse: " + sinopse);
        System.out.println(verificarLancamento());

        if (condicoes != null) {
            condicoes.verificarCondicaoDePlano();
        }
    }
}





