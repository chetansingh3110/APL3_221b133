/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class Mother {
    static int x = 10;
    static void show() {
        System.out.println("Hello from Mother");
    }
}
class Child extends Mother {
    static void show() {
        System.out.println("Hello from Child");
    }
}
public class Application {
    public static void main(String args[]) {
        Mother m1 = new Child();
        m1.show(); 
        Mother.show(); 
        Child.show(); 
    }
}


