import java.util.Scanner;
public class Max {
    public static void main(String[] args) {
        //declaration of integer array to store user numbers
        int numbers[],numberofinegers,result;
        //Initialize Scanner Object
        Scanner input=new Scanner(System.in);
        //Taking number of integers from user
        System.out.println("Enter number of integers");
        numberofinegers=input.nextInt();
        //initialize numbers array
        numbers=new int[numberofinegers];
        //taking n numbers from user
        System.out.println("Enter "+numberofinegers+" integers");
        for(int i=0;i<numberofinegers;i++){
            numbers[i]=input.nextInt();
        }
        if(numberofinegers<=0){
            System.out.println("Number of integers should be greater than 0");
            System.exit(0);
        }
        //check which number is greatest
        result=numbers[0];
        for(int i=1;i<numbers.length;i++){
            if(numbers[i]>result){
                result=numbers[i];
            }
        }
        //print maximum
        System.out.println(result+" is maximum");
    }
}