import java.util.Scanner;

public class prgrm7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int reverse=0;
        int a=num;
        while(num!=0){
            int digit=num % 10;
            reverse=reverse * 10 + digit;
            num=num/10;
        }
        if(a==reverse){
            System.out.println("It is palindrome");
        }else{
            System.out.println("It is not a palindrome");
        }
    }
}