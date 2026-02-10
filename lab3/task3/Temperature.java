package lab3;

public class Temperature {

    private double value;
    private char scale;


    public Temperature() {
        value = 0;
        scale = 'C';
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setScale(char scale) {
        if (scale == 'C' || scale == 'F') {
            this.scale = scale;
        } else {
            System.out.println("Invalid scale. Use 'C' or 'F'.");
        }
    }

    public void setTemperature(double value, char scale) {
        setValue(value);
        setScale(scale);
    }

    public char getScale() {
        return scale;
    }
}
