import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
	System.out.println("Enter String");
        String s;
        Boolean status=false;
        s=input.nextLine();
        int length = s.length()-1;
        for(int i=0;i<length/2;i++){
            if(s.charAt(i)==s.charAt(length-i)){
                status=true;
            }
            else{
                status=false;
            }
        }
        if(status==true){
            System.out.println("Entered string is a palindrome");
        }
        else{
            System.out.println("Entered string is not a palindrome");
        }
    }   
}