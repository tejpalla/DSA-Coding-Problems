//{ Driver Code Starts
//Initial Template for Java

import java.util.*;

public class GFG 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while (t-- > 0) 
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0;i < n;i++)
            {
                arr[i] = sc.nextInt();
            }
            
            Solution sol = new Solution();
            System.out.println(sol.findOnce(arr, n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution 
{
    int findOnce(int arr[], int n)
    {
        // Complete this function
        int i = 0;
        
        if(n == 1)
        {
            return arr[0];
        }
        if(arr[n-1] != arr[n-2])
        {
            return arr[n-1];
        }
        
        for(i=0;i< n-1;i++)
        {
            if(arr[i] == arr[i+1])
            {
                continue;
            }
            else
            {
                if(i == 0)
                {
                    return arr[i];
                }
                if(arr[i] != arr[i-1])
                {
                    return arr[i];
                }
                else
                {
                    continue;
                }
            }
        }
        
        return 0;
    }
}