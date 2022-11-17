import java.util.*;

class InvalidPanException extends Exception {
    public InvalidPanException(String s)
    {
        // Call constructor of parent Exception
        super(s);
    }
}

public class pancard {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("PLEASE ENTER YOUR NAME: ");
        String name=sc.nextLine();
        System.out.print("PLEASE ENTER YOUR PAN NUMBER: ");
        String p_number=sc.nextLine();
        try {
          if(name.charAt(0)==p_number.charAt(4)){
              System.out.println("PAN NUMBER IS VALID.........");
          }
          else{
                throw new InvalidPanException("THE PAN NUMBER IS INVALID");
          }
        }
        catch(InvalidPanException msg){
            System.out.println(msg);
        }
    }
}
