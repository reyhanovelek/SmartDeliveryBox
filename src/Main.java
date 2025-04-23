public class Main {
    public static void main(String[] args) {
        SmartBox<Document> docBox = new SmartBox<>();
        docBox.addItem(new Document ("Fuhrerschein"));
        printBoxItem(docBox);

        SmartBox<Electronic> elecBox = new SmartBox<>();
        elecBox.addItem(new Electronic ("Apple Watch"));
        printBoxItem(elecBox);
    }
    public static void printBoxItem(SmartBox<? extends Object> box) {
        System.out.println("Box Contains : " + box.getItem());
    }
}
