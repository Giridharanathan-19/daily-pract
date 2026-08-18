import java.util.*;
public class Score {
    public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int score=sc.nextInt();
            if(score<50)
                System.out.println("You need to improve.");
            else if(score>49&&score<71)
                System.out.println("Good Job!");
            else
                System.out.println("Excellent perfomance");
            sc.close();
    }

    
}
