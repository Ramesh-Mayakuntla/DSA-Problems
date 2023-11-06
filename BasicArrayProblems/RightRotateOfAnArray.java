//Java program to Right rotate of an array of N number of times 

package BasicArrayProblems;
public class RightRotateOfAnArray
{
    public static void helper(int[] arr,int n)
    { 
        for(int i=1;i<=n;i++)
        {
            int last=arr[arr.length-1];
            for(int j=arr.length-1;j>=0;j--)
            {
                if(j-1>=0)
                {
                    arr[j]=arr[j-1];
                }
            }
            arr[0]=last;
        }
        for(int res:arr)
        {
            System.out.print(res+" ");
        }
    }
    public static void main(String[] args)
    {
        int[] arr={1,7,3,9,6};
        int n=3;
        helper(arr,n);
    }    
}
