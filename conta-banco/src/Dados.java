import java.util.Locale;
import java.util.Scanner;

public class Dados {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Informe seu nome:");
        String nome = scanner.next();

        System.out.println("Informe seu sobrenome:");
        String sobrenome = scanner.next();

        System.out.println("Informe sua idade:");
        int idade = scanner.nextInt();

        System.out.println(nome);
        System.out.println(sobrenome);
        System.out.println(idade);




    }
    
}
