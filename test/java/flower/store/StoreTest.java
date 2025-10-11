package flower.store;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class StoreTest {
    private static final double TEST_PRICE = 15.0;
    private static final int TEST_QUANTITY = 10;
    private static final int EXPECTED_SIZE = 1;


    @Test
    public void testStoreSearch() {
        Store store = new Store();
        FlowerBucket bucket = new FlowerBucket();
        Flower rose = new Rose();
        rose.setPrice(TEST_PRICE);
        FlowerPack pack = new FlowerPack(rose, TEST_QUANTITY);
        bucket.add(pack);
        store.addBucket(bucket);
        List<FlowerBucket> results = store.search(new FlowerBucket());
        Assertions.assertEquals(EXPECTED_SIZE, results.size());
    }
}
