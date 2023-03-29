import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int 점수 = sc.nextInt();
        if(점수 >= 90){
            System.out.println("A");
        }else if(점수 >= 80){
            System.out.println("B");
        }else if(점수 >= 70){
            System.out.println("C");
        }else if(점수 >= 60){
            System.out.println("D");            
        }else{
            System.out.println("F");
        }
    }
}