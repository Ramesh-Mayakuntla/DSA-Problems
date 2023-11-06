//Java program to merge two arrrays into single array

package BasicArrayProblems;
public class Merge2Arrays
{
    public static void helper(int[] arr1,int[] arr2)
    {
        int[] res=new int[arr1.length+arr2.length];
        int a=0;
        for(int i=0;i<res.length;i++)
        {
            if(i<arr1.length)
            {
            res[i]=arr1[i];
            }
            else{
                res[i]=arr2[a];
                a++;
            }
        }
        for(int elements:res)
        {
            System.out.print(elements+" ");
        }
    }
    public static void main(String[] args)
    {
        int[] arr1={1,3,5};
        int[] arr2={2,4,6};
        helper(arr1,arr2);
    }    
}
