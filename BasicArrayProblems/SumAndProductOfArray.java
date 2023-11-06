//Java program to find Sum and product of array

package BasicArrayProblems;
public class SumAndProductOfArray
{
        static int sum=0;
       static  int product=1;
    public static void helper(int[] arr)
    {
        
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
            product=product*arr[i];
        }
        System.out.println("Sum of elements is "+sum);
        System.out.println("Product of elements is "+product);
    }
    public static void main(String[] args)
    {
        int[] arr={1,5,9,3,6,7};
        helper(arr);
    }    
}
