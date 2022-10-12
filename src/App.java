import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com a altura de uma pessoa:");
        double altura = sc.nextDouble();

        double pesoh = (77.7 * altura) - 58;
        System.out.println("O peso ideal para homens é: " + pesoh);

        double pesom = (62.1 * altura) - 44.7;
        System.out.println("O peso ideal para Mulheres é: " + pesom);

    }
}