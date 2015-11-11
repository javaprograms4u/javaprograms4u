import java.util.Scanner;
class BinarySearch 
{
    public static void main(String args[])
    {
        int c,first,last,mid,n,search,array[];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of elements");
        n = in.nextInt(); 
        array = new int[n];
        System.out.println("Enter " + n + " integers in increasing order");
        for (c = 0; c < n; c++)
            array[c] = in.nextInt();
        System.out.println("Enter value to find");
        search = in.nextInt();
        first  = 0;
        last   = n - 1;
        mid = (first + last)/2;
        while( first <= last )
        {
            if ( array[mid] < search )
            first = mid + 1;    
            else if ( array[mid] == search ) 
            {
                System.out.println(search + " found at location " + (mid + 1) + ".");
                break;
            }
            else
                last = mid - 1;
            mid = (first + last)/2;
        }
        if ( first > last )
            System.out.println(search + " is not present in the list.\n");
    }
}