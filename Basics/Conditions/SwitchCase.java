package Basics.Conditions;

public class SwitchCase {
    public static void main(String[] args) {
        int n= 10;
        switch (n) {
            case 1:
            System.out.println("sunday");
                break;
            case 2:
            System.out.println("Monday");
                break;
            case 3:
            System.out.println("Tuesday");
                break;
            case 4:
            System.out.println("Wednesday");
                break;
            case 5:
            System.out.println("ThursDay");
                break;
            case 6:
            System.out.println("Friday");
                break;
            case 7:
            System.out.println("Saturday");
                break;
        
            default:
            System.out.println("no matching day!");
                break;
        }
    }
    
}
