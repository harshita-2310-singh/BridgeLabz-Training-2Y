import java.io.*;

class FileHandler {
    public FileHandler(String fileName) throws IOException {
        File file = new File(fileName);
        if (!file.exists()) {
            throw new IOException("File not found: " + fileName);
        } else {
            System.out.println("File opened successfully: " + fileName);
        }
    }
}

public class FileHandlerDemo {
    public static void main(String[] args) {
        try {
            FileHandler fh = new FileHandler("data.txt");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
