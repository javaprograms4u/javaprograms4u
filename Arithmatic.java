import java.util.Scanner;
public class Arithmatic {
    public static void main(String[] args) {
        int no1,no2,result,ch;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter 1st Number");
        no1=input.nextInt();
        System.out.println("Enter 2nd Number");
        no2=input.nextInt();
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        ch=input.nextInt();
        switch(ch){
            case 1:System.out.println(no1+" + "+no2+" = "+(no1+no2));
                break;
            case 2:System.out.println(no1+" - "+no2+" = "+(no1-no2));
                break;
            case 3:System.out.println(no1+" * "+no2+" = "+(no1*no2));
                break;
            case 4:System.out.println(no1+" / "+no2+" = "+(no1/no2));
                break;
            default:System.out.println("Something went wrong");
                break;
        }
    }
}