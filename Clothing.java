public class Clothing {
    public String description;
    public double price;
    public Size size;

    public enum Size {
        S,
        M,
        L;
    }

    public Clothing(String desc, double price, Clothing.Size size) {
        this.description = desc;
        this.price = price;
        this.size = size;
    }
}
