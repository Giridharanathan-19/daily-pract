import java.util.*;
public class String2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int vow, cons;
        vow=0;cons=0;
        int i=0;
        while (true) {
            
        
        try{
        
            char ch=str.charAt(i);
            if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')){
                if (ch=='a'||ch=='e'||ch=='A'||ch=='E'||ch=='I'||ch=='i'||ch=='o'||ch=='O'||ch=='u'||ch=='U') {
                    vow++;
                }else{
                    cons++;
                }

            }
            i++;
        }
        
         catch (Exception e){
            break;

        }
    }
    
        
       
        System.out.println("Vowels:"+vow);
        System.out.println("Constants:"+cons);




    sc.close();
    }
    
}
