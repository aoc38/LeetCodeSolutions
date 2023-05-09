class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[] r = new int[2];
    
    //create a list and store array data
    List<Integer> list = new ArrayList<>();

    for(int i : nums){
        list.add(i);
    }
    
    for(int i = 0; i< nums.length; i++)
    {
        int ele = target - nums[i];
        if(list.contains(ele) && list.indexOf(ele)!=i){
            r[0] = i;
            r[1] = list.indexOf(ele);
        }
    }
return r;


    }
}
