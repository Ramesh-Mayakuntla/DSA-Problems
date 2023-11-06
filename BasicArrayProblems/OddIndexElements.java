//Java program to print odd index elements in an array

package BasicArrayProblems;
public class OddIndexElements
{
    public static void helper(int[] arr)
    {
        for(int i=1;i<arr.length;i+=2)
        {
            System.out.print(arr[i]+" ");    
        }
    }
    public static void main(String[] args)
    {
        int[] arr={5,2,7,1,9,4,7,3,1};
        helper(arr);
    }        
}
