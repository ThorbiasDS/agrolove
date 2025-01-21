import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int controle = 10;

        while (controle != 0) {
            System.out.println("Bem-vindo ao AgroLove!");
            System.out.println("Entre no programa utilizando login e senha:");

            System.out.print("Login: ");
            Scanner login = new Scanner(System.in);
            String log = login.next();
            System.out.print("Senha: ");
            Scanner senha = new Scanner(System.in);
            String sen = senha.next();

            if(log == "0" || sen == "0"){
                controle = 0;
            }
        }
    }
}
