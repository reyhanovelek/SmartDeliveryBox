public class Document {
    private String name;

    public Document (String name ){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "Document: " + name;
    }
}
