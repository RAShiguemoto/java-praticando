package juntar.pdf;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.pdfbox.multipdf.PDFMergerUtility;

/**
 *
 * @author raula
 */
public class JuntarPdf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        PDFMergerUtility merge = new PDFMergerUtility();
        merge.addSource("C:\\anexos\\arquivo1.pdf");
        merge.addSource("C:\\anexos\\arquivo2.pdf");
        merge.setDestinationFileName("C:\\anexos\\arquivoFinal.pdf");
        merge.mergeDocuments(null);
    }
    
}
