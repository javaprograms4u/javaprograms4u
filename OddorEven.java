import java.util.Scanner;
public class OddorEven {
    public static void main(String[] args) {
        int number;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number");
        number=input.nextInt();
        if(number%2==0){
            System.out.println(number+" is even");
        }
        else{
            System.out.println(number+" is odd");
        }
    }
}
