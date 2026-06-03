class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);

        int count = 0, l = 0, r = people.length -1;
        while(l <= r){
            int remain = limit - people[r--];
            count++;
            if(l <= r && remain >= people[l]){
                l++;
            }
        }
        return count;
    }
}