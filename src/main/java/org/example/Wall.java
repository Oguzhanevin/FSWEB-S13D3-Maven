package org.example; // Wall sınıfı org.example paketinde olmalı

public class Wall {
    private double width;
    private double height;

    // Constructor
    public Wall(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // getWidth method
    public double getWidth() {
        return width;
    }

    // getHeight method
    public double getHeight() {
        return height;
    }

    // setWidth method
    public void setWidth(double width) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    // setHeight method
    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    // getArea method
    public double getArea() {
        return width * height;
    }

    // Main method for testing
    public static void main(String[] args) {
        Wall wall = new Wall(5, 4);
        System.out.println("area= " + wall.getArea());  // Expected: 20.0

        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());  // Expected: 5.0
        System.out.println("height= " + wall.getHeight()); // Expected: 0.0
        System.out.println("area= " + wall.getArea());  // Expected: 0.0
    }
}
