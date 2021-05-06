package SCW.shop;

public class ShopApp {
    public static void main(String[] args) {
        double tax = 0.2;

        System.out.println("Welcome!");

        // Customer login
        Customer c = new Customer("Pinky", 3);

        Clothing.Size CustomerSize;
        switch (c.measurement) {
            case 1, 2, 3:
                CustomerSize = Clothing.Size.S;
                break;
            case 4, 5, 6:
                CustomerSize = Clothing.Size.M;
                break;
            case 7, 8, 9:
                CustomerSize = Clothing.Size.L;
                break;
            default:
                throw new RuntimeException("Invalid measurement");
        }

        // Product Listing
        Clothing[] items = {
            new Clothing("Blue Jacket", 20.0, Clothing.size.M),
            new Clothing("Orange T-shirt", 10.5, Clothing.size.S),
            new Clothing("Blue T-shirt", 10.5, Clothing.size.S),
            new Clothing("Green Scarf", 5.0, Clothing.size.S)
        };

        for (Clothing item: items) {
            if (item.size == CustomerSize) {
                System.out.printf("$%f4.2 %s10", item.price, item.description);
            }
        }

        // Shopping
        HashMap<Clothing, Integer> cart = new HashMap();

        cart.put(item1, 1);
        cart.put(item2, 2);

        // Checkout
        double gross = cart.entrySet().toArray().stream().reduce(
            0,
            (acc, entry) -> acc + entry.getValue() * entry.getKey().price
        );

        System.out.printf("Total: $%f.2", total * (1 + tax));

    }
}
