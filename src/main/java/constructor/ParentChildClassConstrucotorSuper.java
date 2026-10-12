package constructor;

import org.w3c.dom.ls.LSOutput;

class Parent1{
   Parent1(int a)
   {

   }
}
public class ParentChildClassConstrucotorSuper extends Parent1 {


    ParentChildClassConstrucotorSuper(int a) {
        super(a);
    }

    public static void main(String[] args) {
        System.out.println("super");
    }
}
/*
1. In Parent class If we write at least 1 Arg-Constructor, then we should also use 1 No-Arg Constructor in parrent, because If in child class we not
   call Parent class Arg-Constructor using "super(int a)" then compile time error will come, beacuse in child class a default Constructor will
   be created by compiler and inside that default Constructor by default compiler will write super() in 1st line and this super() will search
   no-arg Constructor in parent and it will not get, then error will come.



 */
