public class DataExportFeature {

    interface DataExporter {
        void export(String data);
    }

    static class CsvExporter implements DataExporter {
        public void export(String data) {
            System.out.println("Exporting to CSV: " + data.replace(" ", ","));
        }
    }

    static class PdfExporter implements DataExporter {
        public void export(String data) {
            System.out.println("Exporting to PDF: [PDF Document] " + data);
        }
    }

    public static void main(String[] args) {
        String reportData = "Sales Report Q3";

        DataExporter csvExporter = new CsvExporter();
        DataExporter pdfExporter = new PdfExporter();

        DataExporter jsonExporter = (data) -> {
            System.out.println("Exporting to JSON: { \"report\": \"" + data + "\" }");
        };

        System.out.println("=== Data Export ===");
        csvExporter.export(reportData);
        pdfExporter.export(reportData);
        jsonExporter.export(reportData);
    }
}
