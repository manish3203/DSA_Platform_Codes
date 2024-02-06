/*

	Pairs of Songs With Total Durations Divisible by 60

	Companies : Microsoft, Apple, Facebook, Amazon, Skype,Blackrock,
	Cisco,Infosys, Paypal, VMware, Walmart, Goldman Sachs,Visa,Oracle,
	Audible,De Shaw.
	Platform: Leetcode- 1010
	Fraz’s DSA sheet

	Description
	You are given a list of songs where the ith song has a duration of time[i]
	seconds.

	Return the number of pairs of songs for which their total duration in seconds
	is divisible by 60. Formally, we want the number of indices i, j such that i < j
	with (time[i] + time[j]) % 60 == 0.

	Example 1:
	Input: time = [30,20,150,100,40]
	Output: 3
	Explanation: Three pairs have a total duration divisible by 60:
	(time[0] = 30, time[2] = 150): total duration 180
	(time[1] = 20, time[3] = 100): total duration 120
	(time[1] = 20, time[4] = 40): total duration 60

	Example 2:
	Input: time = [60,60,60]
	Output: 3
	Explanaion: All three pairs have a total duration of 120, which is divisible by 60.

	Constraints:
	1 <= time.length <= 6 * 104
	1 <= time[i] <= 500

*/


class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        Map<Integer, Integer> map = new HashMap<>();
        // 1st Integer Represent time duration % 60 of song & 2nd Integer will count the no of such songs

        int count = 0;

        for(int data : time){
            if(data % 60 == 0){ // if we have something like [60,60,60]
                count += map.getOrDefault(0, 0);
            }
            else{
                count += map.getOrDefault(60 - data % 60, 0); // [30,20,150,100,40] using this example 100
                // if we take moduls of 100 with 60 we get 40, then we look for 60 - 40 which is 20. And 20 is there in "map", we update our count. And update the entry of 40 in our "map" as well
            }
            map.put(data % 60, map.getOrDefault(data % 60, 0) + 1); // [30,20,150,100,40] using this example 150
            // 150 % 60 gives 30 and as we have already encountered 1 of the 30 previously. SO, we will update our count from 0 to 1
        }
        return count;
    }
}
