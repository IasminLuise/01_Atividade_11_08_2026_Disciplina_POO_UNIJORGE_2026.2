import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a idade do lutador: ");
        int idade = input.nextInt();
        System.out.println("Digite o peso do lutador: ");
        double peso = input.nextDouble();
        System.out.println("Digite a graduação:");
        System.out.println("1 - Branca");
        System.out.println("2 - Azul");
        System.out.println("3 - Roxa");
        System.out.println("4 - Marrom");
        System.out.println("5 - Preta");
        int graduacao = input.nextInt();
        if (idade >= 8 && idade <= 12) {
            System.out.println("Categoria: Infantil");
        } else if (idade >= 13 && idade <= 15) {
            System.out.println("Categoria: Infantojuvenil");
        } else if (idade >= 16 && idade <= 17) {
            System.out.println("Categoria: Juvenil");
        } else if (idade >= 18 && idade <= 29) {
            System.out.println("Categoria: Adulto");
        } else if (idade >= 30 && idade <= 39) {
            System.out.println("Categoria: Master 1");
        } else if (idade >= 40) {
            System.out.println("Categoria: Master 2");
        } else {
            System.out.println("Idade fora das categorias.");
        }

        if (peso <= (double)70.0F) {
            System.out.println("Categoria de peso: Leve");
        } else if (peso > (double)70.0F && peso <= (double)82.0F) {
            System.out.println("Categoria de peso: Medio");
        } else {
            System.out.println("Categoria de peso: Pesado");
        }

        if (idade >= 8 && peso > (double)0.0F) {
            if (graduacao >= 2 && graduacao <= 5) {
                System.out.println("Lutador APTO para competir.");
            } else if (graduacao == 1 || graduacao < 1 || graduacao > 5) {
                System.out.println("Lutador NAO APTO para competir.");
            }
        } else {
            System.out.println("Lutador NAO APTO para competir.");
        }

    }
}
