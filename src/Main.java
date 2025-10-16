import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a distancia até o cliente (em km): ");
        double distancia = scanner.nextDouble();

        System.out.print("Esta chovendo ? (s/n): ");
        String chuva = scanner.next().toLowerCase();

        double taxa;

        if (distancia <= 5){
            taxa = 5.0;
        } else if (distancia <= 10) {
            taxa = 8.0;
        }else {
            taxa = 10.0;
        }

        if (chuva.equals("s")){
            taxa += 2.0;
        }

        System.out.println("O valor final da taxa de entrega é R$ " + taxa );

        scanner.close();

    }
}