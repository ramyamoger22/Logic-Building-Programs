import java.util.Scanner;
public class prgrm42{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        str=str.trim();
        if(str.isEmpty()){
            System.out.println(0);
        }else{
            String[] words=str.split("\\s+");
            System.out.println(words.length);
        }
        sc.close();
    }
}