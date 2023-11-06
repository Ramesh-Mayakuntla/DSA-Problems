//Java program to find the Smallest element in Array

package BasicArrayProblems;
public class SmallestElementInArray
{
    public static int helper(int[] arr)
    {
        int min=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args)
    {
        int[] arr={3,6,9,5,33,0,88,8,1};
        System.out.print(helper(arr));
    }    
}
