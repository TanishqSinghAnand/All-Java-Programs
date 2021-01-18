class Perimeters
    {
        void rect(double l , double b )
            {
                double perimeter = 2 * (l+b);
                System.out.println("Perimeter of Rectangle : " + perimeter);
            }
        void square(double s)
            {
                double perimeter = 4 * s;
                System.out.println("Perimeter of Square : " + perimeter );
            }
        void circle(double r)
            {
                double perimeter =  2 * 3.14 * r;
                System.out.println("Perimeter of Circle : " + perimeter );
            }
    }
