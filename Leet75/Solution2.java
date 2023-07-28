class Solution2 {
    public boolean PredictTheWinner(int[] nums) {
        int flag = 0; // 0 being player1 1 being player2
        int i = 0;  // start pointer
        int k = nums.length - 1; // end pointer
        int p1 = 0; //player1 score
        int p2 = 0; //player2 score

        while( i != k)
        {
            if(flag == 0){
                //p1 += Math.max(nums[i],nums[k]);
                if(nums[i+1]+nums[k] < nums[i]+nums[k-1])
                {   
                    if(nums[i]+nums[k] > nums[i] + nums[k-1])
                    {
                        if(nums[i] > nums[k]){
                            p1 += nums[i];
                            i++;
                        }
                        else
                        {
                            p1 += nums[k];
                            k--;
                        }
                    }
                    else
                    {
                        p1 += nums[i];
                        i++;
                       
                    }
                }
                else
                {
                    if(nums[i]+nums[k] > nums[i+1] + nums[k])
                    {
                        if(nums[i] > nums[k]){
                            p1 += nums[i];
                            i++;
                          
                        }
                        else
                        {
                            p1 += nums[k];
                            k--;
                            
                        }
                    }
                    else
                    {
                        p1 += nums[k];
                        k--;
                        
                    }
                }
                flag = 1;
            }
            else
            {
                if(nums[i+1]+nums[k] < nums[i]+nums[k-1])
                {   
                    if(nums[i]+nums[k] > nums[i] + nums[k-1])
                    {
                        if(nums[i] > nums[k]){
                            p2 += nums[i];
                            i++;
                        }
                        else
                        {
                            p2 += nums[k];
                            k--;
                        }
                    }
                    else
                    {
                        p2 += nums[i];
                        i++;
                       
                    }
                }
                else
                {
                    if(nums[i]+nums[k] > nums[i+1] + nums[k])
                    {
                        if(nums[i] > nums[k]){
                            p2 += nums[i];
                            i++;
                          
                        }
                        else
                        {
                            p2 += nums[k];
                            k--;
                            
                        }
                    }
                    else
                    {
                        p2 += nums[k];
                        k--;
                        
                    }
                }
                flag = 0;
            }
        }

        if(flag == 0){
            p1 += nums[i];
        }
        else{
            p2 += nums[k];
        }

        if(p1 >= p2){
            return true;
        }
        else
        {
            return false;
        }
    }
}