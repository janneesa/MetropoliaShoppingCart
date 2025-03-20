import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ItemTest {

    @Test
    void getName() {
        Item item = new Item("Apple", 0.99, 3);
        assertEquals("Apple", item.getName());
    }

    @Test
    void getPrice() {
        Item item = new Item("Apple", 0.99, 3);
        assertEquals(0.99, item.getPrice());
    }

    @Test
    void getQuantity() {
        Item item = new Item("Apple", 0.99, 3);
        assertEquals(3, item.getQuantity());
    }

    @Test
    void getTotalPrice() {
        Item item = new Item("Apple", 1.0, 3);
        assertEquals(3, item.getTotalPrice());
    }
}