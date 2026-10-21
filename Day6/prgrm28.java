import java.util.*;
public class prgrm28{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String result="";
        int shift=sc.nextInt();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='A' && ch<='Z'){
                ch=(char)((ch - 'A' + shift) % 26 + 'A');
            }else if(ch>='a' && ch<='z'){
                ch=(char)((ch - 'a' + shift) % 26 + 'a');
            }
            result+=ch;
        }
        System.out.println(result);
    }
}

