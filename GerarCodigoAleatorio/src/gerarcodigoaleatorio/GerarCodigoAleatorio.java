package gerarcodigoaleatorio;

/**
 *
 * @author raula
 */
public class GerarCodigoAleatorio {

    public static void main(String[] args) {
        String[] carct = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

        String codigo = "";

        for (int x = 0; x < 5; x++) {
            int j = (int) (Math.random() * carct.length);
            codigo += carct[j];
        }

        System.out.println("Código gerado: " + codigo);
    }
    
}
