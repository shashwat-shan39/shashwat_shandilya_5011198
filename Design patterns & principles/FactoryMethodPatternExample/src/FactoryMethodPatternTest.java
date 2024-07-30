public class FactoryMethodPatternTest {
    public static void main(String[] args) {
        // Create factory instances
        DocumentFactory wordFactory = new WordDocumentFactory();
        DocumentFactory pdfFactory = new PdfDocumentFactory();
        DocumentFactory excelFactory = new ExcelDocumentFactory();

        // Create documents using the factories
        Document wordDocument = wordFactory.createDocument();
        Document pdfDocument = pdfFactory.createDocument();
        Document excelDocument = excelFactory.createDocument();

        // Use the documents
        wordDocument.open();
        wordDocument.save();
        wordDocument.close();

        pdfDocument.open();
        pdfDocument.save();
        pdfDocument.close();

        excelDocument.open();
        excelDocument.save();
        excelDocument.close();
    }
}
