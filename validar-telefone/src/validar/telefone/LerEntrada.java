package validar.telefone;

import java.util.Scanner;

/**
 *
 * @author raula
 */
public class LerEntrada {
      
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe seu DDD: ");
        String ddd = scanner.nextLine();
        
        System.out.print("Informe seu telefone: ");
        String telefone = scanner.nextLine();
        
        Validador v = new Validador();
        System.out.println(v.validarDDD(ddd));
        System.out.println(v.validarTelefone(telefone));
    }
}
