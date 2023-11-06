//Java program of printing even index elements in an array

package BasicArrayProblems;
public class EvenIndexElements
{
    public static void helper(int[] arr)
    {
        for(int i=0;i<arr.length;i+=2)
        {
            System.out.print(arr[i]+" ");    
        }
    }
    public static void main(String[] args)
    {
        int[] arr={1,6,9,3,0,2};
        helper(arr);
    }    
}
