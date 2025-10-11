package flower.store;

import java.util.ArrayList;
import java.util.List;


public class Store {
    private List<FlowerBucket> inventory = new ArrayList<>();


    public void addBucket(final FlowerBucket bucket) {
        inventory.add(bucket);
    }

    public List<FlowerBucket> search(final FlowerBucket searchCriteria) {
        List<FlowerBucket> results = new ArrayList<>();
        for (FlowerBucket bucket : inventory) {
            if (matchesCriteria(bucket, searchCriteria)) {
                results.add(bucket);
            }
        }
        return results;
    }

    private boolean matchesCriteria(final FlowerBucket bucket,
            final FlowerBucket criteria) {
        return true;
    }
}
