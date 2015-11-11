import java.util.Scanner;
public class Maxof2 {
    public static void main(String[] args) {
        int no1,no2;
        //taking input from user through commandline
        Scanner input=new Scanner(System.in);
        System.out.println("Enter 1st Number");
        no1=input.nextInt();
        System.out.println("Enter 2nd Number");
        no2=input.nextInt();
        //check which number is maximum
        if(no1>no2){
            System.out.println(no1+" is greater than "+no2);
        }
        else if(no2>no1){
            System.out.println(no2+" is greater than "+no1);
        }
        else{
            System.out.println("Both are equal");
        }
    }   
}
