import java.util.*;
public class Substring {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("PLEASE ENTER A STRING: ");
        String str =sc.nextLine();
        System.out.println("THE SUBSTRINGS OF THE GIVEN STRING ARE: ");
        for(int i=0;i<str.length();i++){
            for(int j=1;j<=(str.length()-i);j++){
                System.out.println(str.substring(i,(j+i)));
            }
        }
    }
}
