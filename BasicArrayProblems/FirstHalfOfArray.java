// Java program to print first half of Array.

package BasicArrayProblems;

public class FirstHalfOfArray
{
    public static void helper(int[] arr)
    {
        int end=arr.length/2;
        for(int i=0;i<end;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args)
    {
        int[] arr={1,3,6,9,2};
        helper(arr);
    }    
}
