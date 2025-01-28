package Basics.Objects;

 class Calculator {
    int a;
    public int add (int num1, int num2){
        // System.out.println("in add");
        
        return num1+num2;
    }

    
}

public class Demo {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int num1 = 4;
        int num2 = 5;
    //    int result =  calculator.add(2,3);
    System.out.println(calculator.add(num1,num2));
    //    System.out.println(result);
    }
}
