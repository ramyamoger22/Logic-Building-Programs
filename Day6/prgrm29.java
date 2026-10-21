import java.util.*;
import java.util.Arrays;
public class prgrm29{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        char[] a=s1.toCharArray();
        char[] b=s2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if(Arrays.equals(a,b)){
            System.out.println("anagram");
        }else{
            System.out.println("Not anagram");
        }
    }
}
