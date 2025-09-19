//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        Condicoes plano = new Condicoes(true, "Plus");
        var esquadraosuicida = new Filme("Esquadrão Suicida", "John Ostrander", 2016, 8.9, "Coringa e Arlequina em Delírio a Dois");

        esquadraosuicida.setCondicoes(plano);
        esquadraosuicida.exibirInformacoes();
    }
}
