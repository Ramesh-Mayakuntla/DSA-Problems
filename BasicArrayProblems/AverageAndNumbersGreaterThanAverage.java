//Java program to find Average and numbers that are greater then average in an array.


package BasicArrayProblems;
public class AverageAndNumbersGreaterThanAverage
{
    public static void helper(int[] arr)
    {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        System.out.println(sum/arr.length);
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]>sum/arr.length)
            {
                System.out.print(arr[j]+" ");
            }
        }
    }
    public static void main(String[] args)
    {
        int[] arr={10,20,30,40,50};
        helper(arr);

    }    
}
