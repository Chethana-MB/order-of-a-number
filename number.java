import java.util.*;
public class number{
    public static void main(String[] args){
        int n1,n2,n3;
        Scanner input=new Scanner(System.in);
        n1=input.nextInt();
        n2=input.nextInt();
        n3=input.nextInt();
        if(n1<n2 && n2<n3){
            System.out.println("the numbersare in increasing order");
        }
        else if(n1>n2 && n2>n3){
            System.out.println("the numbersare in decreasing order");
        }
        else{
            System.out.println("the numbers are in neither in increasing 
            order nor in decreasing order");
        }
    }


}