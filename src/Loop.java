import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner Leitura = new Scanner(System.in);

        double avaliacao = 0;
        double nota= 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite sua avaliacao para o fime!");
            nota = Leitura.nextDouble();
            avaliacao += nota;
        }
        System.out.println("Media de avaliacao" + avaliacao/3);
    }
}
