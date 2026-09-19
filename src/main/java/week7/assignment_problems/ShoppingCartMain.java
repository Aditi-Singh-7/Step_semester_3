package main.java.week7.assignment_problems;

class Cart {

    private final String cartId; // Fixed cart ID[cite: 7]
    private final double[] itemPrices; // Private array[cite: 7]
    private int count;

    public Cart(String cartId, int maxItems) {
        this.cartId = cartId;
        this.itemPrices = new double[maxItems];
        this.count = 0;
    }

    public String getCartId() {
        return cartId;
    }

    public void addItem(double price) {
        if (count < itemPrices.length) {
            itemPrices[count] = price;
            count++;
        }
    }

    public double getTotal() {
        double total = 0;
        for (int i = 0; i < count; i++) {
            total += itemPrices[i]; // Loop and sum prices on request[cite: 7]
        }
        return total;
    }

    public int getItemCount() {
        return count; // Read-only item count[cite: 7]
    }
}

public class ShoppingCartMain {

    public static void main(String[] args) {
        Cart cart = new Cart("CART-5", 20);
        cart.addItem(250);
        cart.addItem(99);
        cart.addItem(151);

        System.out.println("cart.getTotal() -> " + (int) cart.getTotal());
        System.out.println("cart.getItemCount() -> " + cart.getItemCount());
    }
}
