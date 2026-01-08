class std
{
    String name;
    int age;
    void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);    
    }
}
class wdemo
{
       public static void main(String[] args) {
              std s1 = new std();
                s1.name = "Arjun";
                s1.age = 21;
                s1.display();
                System.err.println("");
                int n = 50;
                Integer wrap = n;
                System.err.println("Prmitive value: " + n);
                System.err.println("Wrapped class: " + wrap);
       }
}