//Java program to print Unique elements in an array

package BasicArrayProblems;
public class UniqueElements
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
            if(count==0 && arr[i]!=-1)
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={1,4,8,0,1,5,9,0};
        helper(arr);

    }    
}
