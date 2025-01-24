/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class Mother {
    int x = 10; 
    void show() {
        System.out.println("Value of x in Mother: " + x);
    }
}
class Child extends Mother {
    
}
public class Main {
    public static void main(String args[]) {
        Mother m = new Mother();
        m.show(); 
        Child ch = new Child();
        ch.show(); 
    }
}
