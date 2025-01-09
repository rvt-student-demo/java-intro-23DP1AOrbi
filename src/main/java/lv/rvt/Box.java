package lv.rvt;

public class Box {
    private double width;
    private double height;
    private double length;
    private double side;

    public Box(double width, double height, double lenght) {
        this.width = width;
        this.height = height;
        this.length = lenght;
    }

    public Box(double side) {
        this.width = side;
        this.height = side;
        this.length = side;
    }

    public double volume() {
        return this.width * this.height * this.length;
    }

    /// Exercise 2

    public double area() {
        return 2 * faceArea() + 2 * topArea() + 2 * sideArea();
    }

    private double faceArea() {
        return this.width * this.height;
    }

    private double topArea() {
        return this.width * this.length;
    }

    private double sideArea() {
        return this.length * this.height;
    }
    /// Exercise 3

    public Box(Box oldBox) {
        this.width = oldBox.width;
        this.height = oldBox.height;
        this.length = oldBox.length;
    }
    
    public double lenght() {
        return this.length;
    }

    public double height() {
        return this.height;
    }

    public double width() {
        return this.width;
    }

    /// Exercise 4

    public Box biggerBox(Box oldBox) {
        return new Box(
             1.25*oldBox.width(), 
             1.25*oldBox.height(),
             1.25*oldBox.lenght());
    }

    public Box smallerBox(Box oldBox) {
        return new Box(
             0.75*oldBox.width(), 
             0.75*oldBox.height(),
             0.75*oldBox.lenght());
    }

    /// Exercise 5

    public boolean nests( Box outsideBox ) {
        if (this.height < outsideBox.height &&
            this.length < outsideBox.length &&
            this.width < outsideBox.width) {
            return true;
        }
        return false;
    }
}
