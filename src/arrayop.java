import java.util.*;

class array_operations{

    //method to display an array
    public void display(int[] arr){
        System.out.println(Arrays.toString(arr));
    }

    //method to search an element in an array with exception handling
    public void search(int num,int[] arr){
        int flag=0;
        try{
            for (int i = 0; i <arr.length; i++) {
                if(arr[i]==num){
                    flag=1;
                    break;
                }
            }
        }
        catch(ArrayIndexOutOfBoundsException msg1){
            System.out.println(msg1);
        }
        finally {
            if(flag==1){
                System.out.println("FOUND....");
            }
            else{
                System.out.println("NOT FOUND....");
            }
        }
    }

    //method to sort an array
    public void sort(int[] arr1){
        Arrays.sort(arr1);
        System.out.println("\nTHE SORTED ARRAY IS : ");
        display(arr1);
    }

}

public class arrayop {
    public static void main(String[] args)
    {
        System.out.println("PLEASE ENTER THE SIZE OF THE ARRAY : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arr[]=new int[num];
        System.out.println("PLEASE ENTER THE ELEMENTS : ");

        //inserting elements into an array with exception handling
        try{
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
        }
        catch(ArrayIndexOutOfBoundsException msg){
            System.out.println(msg);
        }

        //display an array
        array_operations a1=new array_operations();
        System.out.println("THE UNSORTED ARRAY IS  : ");
        a1.display(arr);

        //sort and display array
        a1.sort(arr);

        //searching an integer in array
        System.out.println("\nPLEASE ENTER THE NUMBER TO BE SEARCHED : ");
        int s_num= sc.nextInt();
        a1.search(s_num,arr);
    }
}
