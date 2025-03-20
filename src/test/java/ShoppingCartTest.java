import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartTest {

    private ShoppingCart cart;

    @BeforeEach
    void setUp() {
        cart = new ShoppingCart();
    }

    @Test
    void addItem() {
        Item item = new Item("Apple", 0.99, 3);
        cart.addItem(item);
        assertEquals(1, cart.getItems().size());
        assertEquals(item, cart.getItems().get(0));
    }

    @Test
    void getTotal() {
        cart.addItem(new Item("Apple", 0.99, 3));
        cart.addItem(new Item("Banana", 0.59, 2));
        assertEquals(4.15, cart.getTotal(), 0.001);
    }
}