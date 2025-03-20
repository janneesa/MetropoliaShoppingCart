import java.util.*;

public class ShoppingCart {
    private ArrayList<Item> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public double getTotal() {
        double total = 0;
        for (Item item : items) {
            total += item.getTotalPrice();
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();
        Locale locale = Locale.getDefault();

        System.out.println("Select a language");
        System.out.println("1. Finnish");
        System.out.println("2. Swedish");
        System.out.println("3. English");
        System.out.println("4. Japanese");

        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                locale = new Locale("fi", "FI");
                break;
            case 2:
                locale = new Locale("sv", "SE");
                break;
            case 3:
                locale = new Locale("en", "US");
                break;
            case 4:
                locale = new Locale("ja", "JP");
                break;
            default:
                System.out.println("Invalid choice. Defaulting to English (US)");
                locale = new Locale("en", "US");
                break;
        }

        ResourceBundle rb;
        try {
            rb = ResourceBundle.getBundle("messages", locale);
        } catch (Exception e) {
            System.out.println("Invalid locale. Defaulting to English (US)");
            rb = ResourceBundle.getBundle("messages", new Locale("en", "US"));
        }

        System.out.println(rb.getString("number"));
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println(rb.getString("name"));
            String name = sc.next();
            System.out.println(rb.getString("price"));
            double price = sc.nextDouble();
            System.out.println(rb.getString("amount"));
            int quantity = sc.nextInt();
            Item item = new Item(name, price, quantity);
            cart.addItem(item);
        }

        System.out.println(rb.getString("total") + cart.getTotal());


    }

}
