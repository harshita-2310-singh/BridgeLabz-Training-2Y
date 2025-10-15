public class CloningPrototypeObjects {
    static class Document implements Cloneable {
        String title;
        String content;

        public Document(String title, String content) {
            this.title = title;
            this.content = content;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

        public void display() {
            System.out.println("Title: " + title);
            System.out.println("Content: " + content);
        }
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Document original = new Document("Insurance Form", "This is the original content.");
        Document cloned = (Document) original.clone();

        System.out.println("=== Original Document ===");
        original.display();

        System.out.println("\n=== Cloned Document ===");
        cloned.display();

        cloned.title = "Cloned Form";
        cloned.content = "This is the cloned copy.";

        System.out.println("\n=== After Modifying Cloned ===");
        System.out.println("Original:");
        original.display();

        System.out.println("Clone:");
        cloned.display();
    }
}
