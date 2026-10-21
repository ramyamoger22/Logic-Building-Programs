import java.util.*;
public class prgrm30{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int[] freq=new int[26];
        for(int i=0;i<str.length();i++){
            freq[str.charAt(i)-'a']++;
        }
        for(int i=0;i<str.length();i++){
            if(freq[str.charAt(i)-'a']==1){
                System.out.println(i);
                return;
            }
        }
         System.out.println(-1);
    }
}