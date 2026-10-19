import java.util.*;
public class prgrm23{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        k=k%n;
        int[] result=new int[n];
        for(int i=0;i<n;i++){
            result[(i+k)%n]=arr[i];
        }
        for(int i=0;i<n;i++){
            System.out.print(result[i]+" ");
        }
    }
}
