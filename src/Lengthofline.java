import java.util.*;

//user defined exception for short no of characters
class ExceptionLineTooShort extends Exception{
    public ExceptionLineTooShort(String s){
        super(s);
    }
}

//user defined exception for long no of characters
class ExceptionLineTooLong extends Exception{
    public ExceptionLineTooLong(String s){
        super(s);
    }
}

//Class for getting the no of characters
class get_line_count{
    //method to get no of characters in a string
    public int line_count(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' '){
                count++;
            }
        }
        return count;
    }
}

//class for displaying appropriate exception message including exception messages
class display{
    public display(int t_count, int index){
        try{
            if(t_count<5){
                throw new ExceptionLineTooShort("THE INPUT IS TOO SHORT....");
            }
            else if(t_count>10){
                throw new ExceptionLineTooLong("THE INPUT IS TOO LONG....");
            }
            else{
                System.out.println("PERFECT....");
            }
        }

        catch(ExceptionLineTooShort msg1){
            System.out.println(msg1);
        }

        catch(ExceptionLineTooLong msg2){
            System.out.println(msg2);
        }
    }
}


public class Lengthofline {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("PLEASE ENTER THE STRINGS(TYPE 0 TO STOP): ");
        ArrayList<String> string = new ArrayList<>(1000);
        String str1 = null;

        //entering values into the arraylist
        do {
            str1 = sc.nextLine();
            if (!str1.equals("0")) {
                string.add(str1);
            }
        } while (!str1.equals("0"));
        get_line_count c1=new get_line_count();
        for(int i=0;i<string.size();i++){
            int n_of_char=c1.line_count(string.get(i));
            System.out.println("IN LINE "+(i+1)+" : ");
            display d1=new display(n_of_char,i);
        }

    }
}


