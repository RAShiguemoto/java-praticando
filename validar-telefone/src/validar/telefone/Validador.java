package validar.telefone;

/**
 *
 * @author raula
 */

public class Validador {
        
    public String validarDDD(String ddd) {
        String mensagem = "*** " + ddd + " *** DDD válido!";
        
        if (ddd.length() != 2) {
            mensagem = "*** " + ddd + " *** DDD deve ser composto por dois caracteres numéricos.";
            
        } else {

            if (ddd.matches("[0-9]+") == Boolean.FALSE) {
                mensagem = "*** " + ddd + " *** DDD deve ser composto apenas por números.";
            }
        }
        
        return mensagem;
    } 
    
    public String validarTelefone(String telefone) {
        String mensagem = "*** " + telefone + " *** Número válido!";
        
        if (telefone.length() != 9) {
            mensagem = "*** " + telefone + " *** Número deve ser composto por nove caracteres numéricos.";
            
        } else {

            if (telefone.matches("[0-9]+") == Boolean.FALSE) {
                mensagem = "*** " + telefone + " *** Número deve ser composto por nove caracteres numéricos.";
            }
        }
        
        return mensagem;
    } 
}
