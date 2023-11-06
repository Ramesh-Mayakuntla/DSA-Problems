//Java program to Left rotate an array of N number of times


package BasicArrayProblems;
public class LeftRotateAnArrayOfNtimes
{
    public static void helper(int[] arr, int k)
    {
        for(int j=1;j<=k;j++)
        {
            int first=arr[0];
            for(int i=0;i<arr.length;i++)
            {
                if(i+1<=arr.length-1)
                {
                    arr[i]=arr[i+1];
                }
            }
            arr[arr.length-1]=first;
        }
        for(int res:arr)
        {
            System.out.print(res+" ");
        }
    }
    public static void main(String[] args)
    {
        int[] arr={1,7,3,5,9};
        int k=3;
        helper(arr,k);
    }    
}
