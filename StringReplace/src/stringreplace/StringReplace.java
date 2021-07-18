package stringreplace;

/**
 *
 * @author raula
 */
public class StringReplace {

    public static void main(String[] args) {
        String cpf = "101.315.169-06";
        
        System.out.println("CPF informado: " + cpf);
        System.out.println("CPF limpo: " + cpf.replace(".", "").replace("-", ""));
    }
    
}
