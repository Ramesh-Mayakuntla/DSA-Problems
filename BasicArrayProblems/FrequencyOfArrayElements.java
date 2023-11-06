//Java program to find the frequency of elements in an array.

package BasicArrayProblems;
public class FrequencyOfArrayElements
{
    public static int helper(int[] arr,int x)
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==x)
            count++;
        }
        return count;
    }
    public static void main(String[] args)
    {
        int[] arr={1,7,2,9,4,6,8,7,9,2,4,4,4,4,4,4};
        int x=4;
        System.out.println(helper(arr,x));    
    }    
}
