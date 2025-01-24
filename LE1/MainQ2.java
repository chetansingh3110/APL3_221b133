/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class Mother {
    int x = 10; 
    void show() {
        System.out.println("Hello World");
    }
}
class Child extends Mother {
    void show() {
        System.out.println("Hello JUET"); 
}
public class Main {
    public static void main(String args[]) {
        Mother m = new Mother();
        m.show(); 
        Child ch = new Child();
        ch.show(); 
    }
}

