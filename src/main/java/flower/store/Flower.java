package flower.store;

public class Flower {
    private double sepalLength;
    private FlowerColor color;
    private double price;
  
    public double getSepalLength() {
        return sepalLength;
    }

  
    public void setSepalLength(final double newSepalLength) {
        this.sepalLength = newSepalLength;
    }


    public FlowerColor getColor() {
        return color;
    }


    public void setColor(final FlowerColor newColor) {
        this.color = newColor;
    }


    public double getPrice() {
        return price;
    }


    public void setPrice(final double newPrice) {
        this.price = newPrice;
    }


    public String getColorString() {
        return color.getColorString();
    }
}
