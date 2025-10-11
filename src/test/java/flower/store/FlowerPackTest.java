package flower.store;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class FlowerPackTest {
    private static final double TEST_PRICE = 10.0;
    private static final int TEST_QUANTITY = 5;
    private static final double EXPECTED_PRICE = 50.0;


    @Test
    public void testFlowerPackPrice() {
        Flower flower = new Rose();
        flower.setPrice(TEST_PRICE);
        FlowerPack pack = new FlowerPack(flower, TEST_QUANTITY);
        Assertions.assertEquals(EXPECTED_PRICE, pack.getPrice());
    }
}
