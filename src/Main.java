import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     System.out.println("Bom dia, porfavor coloque os dados na seguinte ordem") ;
     System.out.print("nome: ");
     String name = sc.nextLine();
     System.out.print("idade: ");
     int age = sc.nextInt();
     sc.nextLine();
     System.out.print("cpf: ");
     String cpf = sc.nextLine();
     System.out.print("Data de entrada: ");
     String checkIn = sc.nextLine();
     System.out.print("ata de saida: ");
     String checkOut = sc.nextLine();
    }
}