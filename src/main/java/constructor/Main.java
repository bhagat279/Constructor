package constructor;

class Parent{
    String s="parent";
}

public class Main extends Parent {

   String s= "child";

   public void show()
   {
       System.out.println(s);
       System.out.println(this.s);
       System.out.println(super.s);

   }

    public static void main(String[] args) {
       Main m = new Main();

        m.show();
    }
}

/*
1. return type not appliacable, if we use return type JVM will treat as a method.
2. only 4 modifiers are appliacable for constructor are below:
   1.public
   2.private
   3.protected
   4 default

3. If Class contains at least 1 constructor, then compiler will not create Default constructor.
4. All java classes even abstract class contains default constructor.
5. Default constructor always No-Arg constructor
6. If we create No-Arg constructor, then it is not a default constructor, only compiler will create default
   constructor.

7. Default constructor access modifier always same as its class modifier, but class modifiers should
   public and default.

8. Default constructor contain only 1 line is:
   super();
9. When we create child class object, then by defualt parent class constructor called

=====================================super-this=========================================================
1. first line of constructor always should this()/Super(), If we not write any one either this() or Super()
    Then, compiler will use Super()
2. this()/Super() only we can use inside constructor.
3. this()---> use to call current class constructor.
4. Super()---> use to call parent class constructor.
5. this===>it is use to call current class instance variable.
6. super===>it is use to call parent class instance variable.
7. super/this both are related to objet, we can use anywhere, but inside static area we can not use.

==================================================constructor overloading============================







 */