package flower.store;


public enum FlowerColor {

    RED("#FF0000"),


    BLUE("#0000FF"),


    YELLOW("#FFFF00"),


    WHITE("#FFFFFF");

    private final String colorString;

    FlowerColor(final String newColorString) {
        this.colorString = newColorString;
    }


    public String getColorString() {
        return colorString;
    }
}
