package web.model;

public class Car {
    private String model;
    private int version;
    private String color;

    public Car(String model, int version,String color) {
        this.model = model;
        this.version = version;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
