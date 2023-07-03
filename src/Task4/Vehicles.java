package Task4;

public enum Vehicles {
    CAR(20000) {
        @Override
        public String getColor() {
            return "Blue";
        }

        @Override
        public String toString() {
            return "Car (color: " + getColor() + ", price: " + getPrice() + ")";
        }
    }, TRUCK(135000) {
        @Override
        public String getColor() {
            return "Green-Sparkle";
        }

        @Override
        public String toString() {
            return "Truck (color: " + getColor() + ", price: " + getPrice() + ")";
        }
    };


    private final int price;

    Vehicles(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public abstract String getColor();

}
