//Java program to find the sum of array elements is equal to product of array elements

package BasicArrayProblems;
public class SumEqualsProductOfArrayElements
{
    static int sum=0;
    static int product=1;
    public static boolean helper(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            product*=arr[i];
        }
        if(sum==product)
        return true;
        else
        return false;
    }
    public static void main(String[] args)
    {
        int[] arr={2,5,9,1,8};
        System.out.println(helper(arr));
    }    
}
