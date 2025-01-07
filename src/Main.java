import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int controle = 10;

        while (controle != 0) {
            System.out.println("Bem-vindo ao AgroLove!");
            System.out.println("Escolha uma opção: ");
            System.out.println("0 - Sair do programa");
            Scanner scanner = new Scanner(System.in);
            controle = scanner.nextInt();
        }
    }
}
