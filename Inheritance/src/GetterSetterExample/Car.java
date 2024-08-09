package GetterSetterExample;

public class Car {
    private String make;
    private String model;
    private String color;
    private int doors;
    private boolean isConvertible;
    private char grade;

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return isConvertible;
    }

    public char getGrade() {
        return grade;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        isConvertible = convertible;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public void describleCar () {
        System.out.println(
                make + " " +
                model + " " +
                grade + " " +
                color + " " +
                doors + " Doors " +
                (isConvertible? "Convertible": "Non-convertible")
        );
    }

    public void describleCarWithValues () {
        make ="Toyota";
        model="Camry";
        grade='A';
        color="White";
        doors=4;
        isConvertible=false;
        System.out.println(
                make + " " +
                        model + " " +
                        grade + " " +
                        color + " " +
                        doors + " Doors " +
                        (isConvertible? "Convertible": "Non-convertible")
        );
    }

}