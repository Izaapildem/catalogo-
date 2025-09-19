public class Condicoes {

    public boolean incluidoNoPlano;
    public String tipoPlano;

    public Condicoes(boolean incluidoNoPlano, String tipoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
        this.tipoPlano = tipoPlano;
    }

    public void verificarCondicaoDePlano() {
        if (incluidoNoPlano && tipoPlano.equals("Plus")) {
            System.out.println("Filme liberado!");
        } else {
            System.out.println("Adquira nosso plano!");
        }
    }


    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public String getTipoPlano() {
        return tipoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setTipoPlano(String tipoPlano) {
        this.tipoPlano = tipoPlano;
    }
    public void exibirPlano() {
    }
}
