public class Areas {
    void square(double side) {
        // Area of Square
        double area = Math.pow(side, 2);
        System.out.println("Area of Square : " + area);
    }

    void rect(double l, double b) {
        // Area of Rectangle
        double area = l * b;
        System.out.println("Area of Rect : " + area);
    }

    void Circle(double r) {
        // Area of Circle
        double area = 3.14 * r * r;
        System.out.println("Area of Circle : " + area);
    }

    void Triangle(double b, double h) {
        // Area of Triangle
        double area = 0.5 * (h * b);
        System.out.println("Area of Circle : " + area);
    }
}
