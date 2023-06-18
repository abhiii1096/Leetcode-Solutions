class Solution {
    public int removeDuplicates(int[] nums) {
        int [] n1 = new int[nums.length];
        int c=0; 
        int c1=0;      
        int n=0;
        
        for(int i=0;i<nums.length;i+=c){
             c=0;    
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    c+=1;
                }                 
            }
            if(c>1){
                n1[c1]=nums[i];
                c1++;
                n1[c1]=nums[i];
                if(i!=nums.length-1){
                c1++;
                }
                n+=2;               
            }
            else{
                n1[c1]=nums[i];
                 if(i!=nums.length-1){
                c1++;
                }
                n++;
            }          
        }   
      
        for(int i=0;i<nums.length;i++){
            nums[i]=n1[i];
        }
        return n;
    }
}