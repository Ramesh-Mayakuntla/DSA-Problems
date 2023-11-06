//Java program to find the duplicate elements in an array


package BasicArrayProblems;
public class DuplicateElements
{
    public static void helper(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            int count=0;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                    arr[j]=-1;
                }
            }
            if(count>0 && arr[i]!=-1)
            {
            System.out.print(arr[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={2,9,4,7,6,2,9};
        helper(arr);
    }    
}
