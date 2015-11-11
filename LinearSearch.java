import java.util.*;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number of elements");
        int noofelements,elements[],find,position=0;
        noofelements=input.nextInt();
        elements=new int[noofelements];
        System.out.println("Enter "+noofelements+" Integers");
        for(int i=0;i<elements.length;i++){
            elements[i]=input.nextInt();
        }
        System.out.println("Enter value to find");
        find=input.nextInt();
        for(int i=0;i<elements.length;i++){
            if(find==elements[i]){
                position=i+1;
                System.out.println("Element found at position "+position);
                System.exit(0);
            }
        }
        if(position==0){
            System.out.println("Searched element not found");
        }
    }
}