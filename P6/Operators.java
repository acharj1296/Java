class Operators 
{
    public static void main(String[] args) 
    {
        int a = 10;
        int b = 5;

        // Arithmetic Operators
        System.out.println("Arithmetic Operators:");
        System.out.println(" (a + b) " + (a + b));
        System.out.println(" (a - b) " + (a - b));
        System.out.println(" (a * b ) " + (a * b));
        System.out.println(" (a / b) " + (a / b));
        System.out.println(" (a % b) " + (a % b));

        // Relational Operators
        System.out.println("Relational Operators:");
        System.out.println(" a < b " + (a < b));
        System.out.println("a > b " + (a > b));
        System.out.println("a <= b " + (a <= b));
        System.out.println("a >= b " + (a >= b));
        System.out.println("a == b " + (a == b));
        System.out.println("a != b " + (a != b));

        // Logical Operators
        boolean x = true;
        boolean y = false;
        System.out.println("Logical Operators:");
        System.out.println(" x && y " + (x && y));
        System.out.println(" x || y " + (x || y));
        System.out.println(" !x " + (!x));

        //unary Operators
        System.out.println("Unary Operators:");
        int c = 5;
        System.out.println("c= " + c);
        System.out.println(" pri-increment " + (++c));
        System.out.println(" post-increment " + (c++));
        System.out.println(" final value of c " + (c));

        // Assignment Operators
        int d=10;
        System.out.println("Assignment Operators:");
        System.out.println("d= " + d);
        d+=5;
        System.out.println("d+=5 " + d);
        d-=2;
        System.out.println("d-=2 " + d);
        d*=4;
        System.out.println("d*=4 " + d);
        d/=2;
        System.out.println("d/=2 " + d);
    }
}