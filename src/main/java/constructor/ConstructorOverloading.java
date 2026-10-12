package constructor;

public class ConstructorOverloading {

    ConstructorOverloading(int a)
    {
        this();
        System.out.println("int cons");
    }
    ConstructorOverloading()
    {
        this("s",5);
        System.out.println("no-arg cons");
    }
    ConstructorOverloading(String s, int a)
    {
        System.out.println("two-arg cons");
    }

    public static void main(String[] args) {

       new ConstructorOverloading(5);


    }
}
