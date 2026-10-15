import java.util.Scanner;

public class prgrm12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int original=num;
        int sum=0;
        while(num>0){
            int digit=num % 10;
            sum=sum + (digit * digit * digit);
            num=num / 10;
        }
        if(sum==original){
            System.out.println("Armstrong number");
        }else{
            System.out.println(" not a Armstrong number");
        }
    }
}
