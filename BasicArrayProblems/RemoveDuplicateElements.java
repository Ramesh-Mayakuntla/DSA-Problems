//Java program to remove duplicate elements in array

package BasicArrayProblems;
public class RemoveDuplicateElements
{
    public static void helper(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    arr[j]=-1;
                }
            }
            if(arr[i]!=-1)
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args)
    {
        int[] arr={1,5,9,1,3,6,9,3};
        helper(arr);

    }    
}
