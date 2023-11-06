//Java program to display the Fibonacci number in an array

package BasicArrayProblems;
public class FibonacciNumberInArray
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
         int a=1;
         int b=1;
         int c=0;
         while(num>0)
         {
            c=a+b;
            a=b;
            b=c;
            if(c==num)
            return true;
            if(c>num)
            break;
         }
         return false;
    }

    public static void main(String[] args)
    {
        int[] arr={2,51,8,13,45};
        helper(arr);

    }    
}
