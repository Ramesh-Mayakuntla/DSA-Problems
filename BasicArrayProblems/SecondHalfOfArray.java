//Java program to print Second Half of an Array


package BasicArrayProblems;
public class SecondHalfOfArray
{
    public static void helper(int[] arr)
    {
        for(int i=arr.length/2;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args)
    {
        int[] arr={3,5,7,9,2,1};
        helper(arr);
    }    
}
