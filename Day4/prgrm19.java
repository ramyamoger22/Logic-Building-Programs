import java.util.*;
public class prgrm19{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=sc.nextInt();
        int min,max;
        min=num;
        max=num;
        for(int i=1;i<n;i++){
            num=sc.nextInt();
            if(num<min){
                min=num;
            }
            if(num>max){
                max=num;
            }
        }
        System.out.println(min + " " + max);
    }
}