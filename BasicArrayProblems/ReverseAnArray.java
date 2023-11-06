// Java program to reverse an array.

package BasicArrayProblems;
public class ReverseAnArray
{
    public static void helper(int[] arr)
    {
        int start=0;
        int end=arr.length-1;
        int temp;
        while(start<end)
        {
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        for(int res:arr)
        {
            System.out.print(res+" ");
        }
    }
    public static void main(String[] args)
    {
        int[] arr={1,2,3};
        helper(arr);
    }
}