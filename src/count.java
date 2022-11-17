import java.util.*;

class get_count {

    //method to get white space count
    public int white_space_count(String string){
        int space=0;
        for(int i=0; i<string.length(); i++){
            char ch=string.charAt(i);
            if(ch==' '){
                space++;
            }
        }
        return space;
    }

    //method to get word count
    public int word_count(String s)
    {
        int word=0;
        for (int i = 0;i<=(s.length()-1);i++)
        {
            if(  ( (i>0)&& (s.charAt(i)!=' ') &&(s.charAt(i-1)==' ')) || ((s.charAt(i)!=' ')&&(i==0)) )
                word++;
        }
        return word;
    }



}

public class count {
    public static void main(String[] args){
        int s_count = 0,w_count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("PLEASE ENTER THE STRINGS(TYPE 0 TO STOP): ");
        ArrayList<String> str=new ArrayList<>(1000);
        String str1 = null;

        //entering values into the arraylist
        do {
            str1=sc.nextLine();
            if(!str1.equals("0")) {
                str.add(str1);
            }
        }while(!str1.equals("0"));


        //printing no of lines in the text
        System.out.println("\nNO LINES IN THE GIVEN TEXT : "+str.size());
        get_count g1=new get_count();

        //calculating an printing the no of white spaces and words in the whole text
        for(int i=0;i<str.size();i++){
            int c= g1.white_space_count(str.get(i));
            int l=g1.word_count(str.get(i));
            s_count+=c;
            w_count+=l;
        }
        System.out.println("NUMBER OF WHITE SPACES:"+s_count);
        System.out.println("NUMBER OF WORDS:"+w_count);


    }
}
