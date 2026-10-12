package constructor;

public class RecMethodConsCall {
    /*public static void m1()
    {
        m2();
    }
    public static void m2()
    {
     m1();
    }*/

    RecMethodConsCall()
    {
        this(5);
    }
    RecMethodConsCall(int a)
    {
    // this();
    }

    public static void main(String[] args) {
       // m1();
        System.out.println("hello");
    }

}
/*
1. Recursive method call give runtime exception, stackOverFlow.
2. Recursive Constructor call give Compile time error.


 */
