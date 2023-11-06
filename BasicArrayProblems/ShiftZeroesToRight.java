//Java program to Shift zeroes to right side of an Array

package BasicArrayProblems;
public class ShiftZeroesToRight 
{
    public static void helper(int[] arr)
    {
        int[] res=new int[arr.length];
        int j=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                res[j]=arr[i];
                j++;
            }
        }
        for(int a:res)
        {
            System.out.print(a+" ");
        }
    }
    public static void main(String[]args)
    {
        int[] arr={1,6,0,2,0,6,0,2,8};
        helper(arr);
    }    
}
