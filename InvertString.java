import java.util.Scanner;
public class InvertString {
    public static void main(String[] args) {
        StringBuffer sbuffer = new StringBuffer();
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a string to reverse");
        sbuffer.append(input.nextLine());
        System.out.println("Reverse of entered string is "+sbuffer.reverse());
    }
}
