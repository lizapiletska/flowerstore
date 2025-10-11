package flower.store;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class FlowerPackTest {
    @Test
    public void testFlowerPackPrice() {
        Flower flower = new Rose();
        flower.setPrice(10.0);
        FlowerPack pack = new FlowerPack(flower, 5);
        Assertions.assertEquals(50.0, pack.getPrice());
    }
}
