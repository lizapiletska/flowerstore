package flower.store;


public class FlowerPack {
    private Flower flower;
    private int quantity;


    public FlowerPack(final Flower newFlower, final int newQuantity) {
        this.flower = newFlower;
        this.quantity = newQuantity;
    }


    public Flower getFlower() {
        return flower;
    }


    public int getQuantity() {
        return quantity;
    }


    public double getPrice() {
        return flower.getPrice() * quantity;
    }
}
