import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Seja bem-vindo ao AgroLove!");
            System.out.println("Escolha uma das seguintes opções: ");
            System.out.println("1. Cadastrar um novo animal");
            System.out.println("2. Cadastrar um novo tipo de vacina");
            System.out.println("3. Cadastrar tratamento de um animal");
            System.out.println("4. Listar todos os animais");
            System.out.println("5. Visualizar animais que precisam ser tratados");
            System.out.println("0. Sair do sistema");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Cadastrar um novo animal");
                    break;
                case 2:
                    System.out.println("Cadastrar um novo tipo de vacina");
                    break;
                case 3:
                    System.out.println("Cadastrar tratamento de um animal");
                    break;
                case 4:
                    System.out.println("Listar todos os animais");
                    break;
                case 5:
                    System.out.println("Visualizar animais que precisam ser tratados");
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
        scanner.close();
    }
}