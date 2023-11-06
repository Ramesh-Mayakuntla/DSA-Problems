//Java program to Shift even elements to Left side of an array.

package BasicArrayProblems;
public class ShiftEvenelementsToRight
{
    public static void helper(int[] arr)
    {
        int[] res=new int[arr.length];
        int x=0;
        int y=arr.length-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                res[x]=arr[i];
                x++;
            }
            else{
                res[y]=arr[i];
                y--;
            }
        }
            
        for(int result:res)
        {
            System.out.print(result+" ");
        }
    }
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,5,6,7,8};
        helper(arr);
    }    
}
