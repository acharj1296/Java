class StaticExample {
    static int staticVariable = 10;

    static {
        System.err.println("Inside static block. Initializing static variable to 10");
    }

    static void staticMethod() {
        System.out.println("Inside static method. Static variable value: " + staticVariable);
    }
    public static void main(String[] args) {
        System.err.println("Inside main method.");
        System.err.println("Inside main method. Static variable value: " + StaticExample.staticVariable);
        StaticExample.staticMethod();
    }
}