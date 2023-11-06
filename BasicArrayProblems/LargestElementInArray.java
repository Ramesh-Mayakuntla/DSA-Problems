//Java program to find the Largest element in array

package BasicArrayProblems;
public class LargestElementInArray
{
    static int res=0;
    public static  int helper(int[] arr)
    {
        int res=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>res)
            res=arr[i];
        }
        return res;
    }
    {
    }
    public static void main(String[] args)
    {
        int[] arr={1,561,6,2,9,5,11,987};
        System.out.println(helper(arr));
    }    
}
