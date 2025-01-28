package Basics.Objects;
class Computer {
    public void playMusic(){
       System.out.println("Playing Music..");
    }
    public String getMePen(int cost){
        if(cost>10) return "pen";

        return "nothing";
    }
    
}

public class ObjectWithMethod {
    public static void main(String[] args) {
        Computer computer = new Computer();
        String result = computer.getMePen(2);
        computer.playMusic();
        System.out.println( result);
    }
    
}
