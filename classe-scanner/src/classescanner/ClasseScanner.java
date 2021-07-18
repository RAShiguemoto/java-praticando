package classescanner;

import java.util.Scanner;

/**
 *
 * @author raula
 */
public class ClasseScanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.printf("Nome: ");
        String nome = scanner.nextLine();
        
        System.out.printf("Idade: ");
        Integer idade = scanner.nextInt();
        
        System.out.println(nome + " - " + idade + " anos.");
    }
    
}
