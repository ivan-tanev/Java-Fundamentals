package Vehicle_Catalogue;

public class Car {
    private String type;
    private String model;
    private String color;
    private int horsePower;

    public Car(String model, String color, int horsePower) {
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
        this.type = "Car";
    }

    public int getHorsePower() {
        return this.horsePower;
    }

    @Override
    public String toString() {
        return String.format("Type: %s%n" +
                "Model: %s%n" +
                "Color: %s%n" +
                "Horsepower: %d", type, model, color, horsePower);
    }

    public String getModel() {
        return this.model;
    }
}
