//Java program to Shift the Zeroe's to left side of an Array.

package BasicArrayProblems;
public class ShiftZeroesToLeft
{
    public static void helper(int[] arr)
    {
        int[] res=new int[arr.length];
        int j=arr.length-1;
        for(int i=arr.length-1;i>=0;i--)
        {
            if(arr[i]!=0)
            {
            res[j]=arr[i];
            j--;
            }
        }
        for(int a:res)
        {
            System.out.print(a+" ");
        }
    }
    public static void main(String[] args)
    {
        int[] arr={1,3,0,4,0,6};
        helper(arr);
    }    
}
