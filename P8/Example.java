class Vehicle {
    final int speedlimit = 100;

    void display() {
        System.out.println("Speed Limit: " + speedlimit);
    }
}
public class Example{
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.display();
    }
}