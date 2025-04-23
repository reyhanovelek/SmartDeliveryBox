public class Electronic {
    private String brand;

    public Electronic (String brand) {
        this.brand = brand;
    }
    public String getBrand() {
        return brand;
    }
    @Override
    public String toString() {
        return "Electronic : " + brand;
    }
}
