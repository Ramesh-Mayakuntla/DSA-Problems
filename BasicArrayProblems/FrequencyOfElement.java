//Java program to print frequency of each element in an array.

package BasicArrayProblems;
public class FrequencyOfElement
{
    public static void helper(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            int count=1;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                    arr[j]=-1;
                }
            }
            if(arr[i]!=-1)
            {
                System.out.println(arr[i]+"------->"+count);
            }
        }
    }
    public static void main(String[] args)
    {
        int[] arr={1,4,7,9,0,2,5,7,0,8};
        helper(arr);
    }    
}
