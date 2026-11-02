import java.util.Scanner;

public class prgrm46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for(int i=2;i*i<=n;i++){
            int count=0;
            while(n%i==0){
                count++;
                n/=i;
            }
            if(count>0){
                System.out.println(i+" "+count);
            }
            }
             if(n>1){
                System.out.println(n + " 1 ");
        }
        sc.close();
    }
}