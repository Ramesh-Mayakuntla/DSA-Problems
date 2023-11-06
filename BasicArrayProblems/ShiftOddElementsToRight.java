//Java program to Shit the odd elements to right side of an Array

package BasicArrayProblems;
public class ShiftOddElementsToRight
{
    public static void helper(int[] arr)
    {
        int[] res=new int[arr.length];
        int x=arr.length-1;
        int y=0;
        for(int i=arr.length-1;i>=0;i--)
        {
            if(arr[i]%2==1)
            {
                res[x]=arr[i];
                x--;
            }
            else{
                res[y]=arr[i];
                y++;
            }
        }
        for(int result:res)
        {
            System.out.print(result+" ");
        }
    }
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,5,6,7};
        helper(arr);    
    }    
}
