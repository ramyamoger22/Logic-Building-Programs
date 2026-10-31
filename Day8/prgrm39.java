import java.util.Scanner;
public class prgrm39{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] words=s.split(" ");
        for(int i=0;i<words.length;i++){
            String rev=new StringBuilder(words[i]).reverse().toString();
            System.out.print(rev);
            if(i<words.length - 1);
                System.out.print(" ");
        }
    }
}
