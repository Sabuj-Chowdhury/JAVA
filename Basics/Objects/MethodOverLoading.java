package Basics.Objects;
class Calculator2{
    // method overloading (same name different parameters )
    public int add(int n1,int n2){
        return n1 + n2;
    }
    public int add(int n1,int n2,int n3){
        return n1 + n2+ n3;
    }
    public float add(double n1,float n2,int n3){
        return (float) (n1 + n2+ n3);
    }
}

public class MethodOverLoading {
    public static void main(String[] args) {
        Calculator2 obj = new Calculator2();
       int result1= obj.add(14, 15);
        int result2=obj.add(23, 25,26);
       float result3=obj.add(45.90, 02.09f, 100);
        System.out.println("First result " +result1);
        System.out.println("Second result " +result2);
        System.out.println("Third result " +result3);
    }
    
}
