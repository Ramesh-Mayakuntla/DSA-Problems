//Java program to display the palindrome numbers in array

package BasicArrayProblems;
public class PalindromeElementsInArray
{
    public static void helper(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(helper2(arr[i]))
            {
                System.out.print(arr[i]+" ");
            }
        }
    }
    public static boolean helper2(int num)
    {
        int temp1=num;
        int rem=0;
        int res=0;
        while(temp1>0)
        {
            rem=temp1%10;
            res=res*10+rem;
            temp1=temp1/10;
        }
        if(res==num)
        return true;
        else
        return false;
    }
    public static void main(String[] args)
    {
        int[] arr={121,23456,141,465,222};
        helper(arr);
    }    
}
