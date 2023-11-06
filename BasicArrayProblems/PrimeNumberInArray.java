//Java program to print the prime numbers in array.

package BasicArrayProblems;
public class PrimeNumberInArray
{
    public static void helper(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(helper2(arr[i])==true)
            {
                System.out.print(arr[i]+" ");
            }
        }
    }
    public static boolean helper2(int num)
    {
        if(num==1)
        return false;
        if(num==2 || num==3)
        return true;
        if(num%2==0 || num%3==0)
        return false;
        for(int i=5;i<Math.sqrt(num);i=i+2)
        {
            if(num%i==0)
            return false;
        }
        return true;
    }
        public static void main(String[] args)
        {
            int[] arr={2,6,7,9};
            helper(arr);
        }
}
