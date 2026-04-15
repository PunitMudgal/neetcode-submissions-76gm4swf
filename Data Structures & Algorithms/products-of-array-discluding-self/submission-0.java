class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefixProd = new int[n];
        int[] postfixProd = new int[n];

        prefixProd[0] = 1;
        postfixProd[n-1] = 1;

        //prefix product except self index i
        for(int i = 1; i < n; i++){
            prefixProd[i] = nums[i-1] * prefixProd[i-1];
        }

        // postfix produt except self index i
        for(int j = n-2; j >= 0; j--){
            postfixProd[j] = nums[j+1] * postfixProd[j+1];
        }

        for(int k=0; k<n; k++){
            nums[k] = prefixProd[k]*postfixProd[k];
        }
        return nums;
    }
}  
