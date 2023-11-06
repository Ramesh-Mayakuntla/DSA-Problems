//Java program to print Even and Odd elements

package BasicArrayProblems;
public class EvenAndOddElements
{
    public static void helper(int[] arr)
    {
        System.out.println("Even elements are");
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
            System.out.print(arr[i]+" ");
            }
        }
        System.out.println("");
        System.out.println("Odd elements are");
          for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==1)
            {
            System.out.print(arr[i]+" ");
            }
        }
    }
    public static void main(String[] main)
    {
        int[] arr={1,5,9,2,6};
        helper(arr);
    }    
}
