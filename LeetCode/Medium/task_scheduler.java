/*

   	Task Scheduler

	Company: PayTM, BNY Mellon, Uber, CRED, ShareChat, Facebook, Oracle
	Platform: leetcode-621, Coding Ninjas, GFG
	Fraz’s DSA Sheet

	Description :
	Given a character array of tasks, representing the tasks a CPU needs to do, where
	each letter represents a different task. Tasks could be done in any order. Each task
	is done in one unit of time. For each unit of time, the CPU could complete either
	one task or just be idle.
	However, there is a non-negative integer n that represents the cooldown period
	between two same tasks (the same letter in the array), that is that there must be at
	least n units of time between any two same tasks.
	Return the least number of units of times that the CPU will take to finish all the
	given tasks.

	Example 1:
	Input: tasks = ["A","A","A","B","B","B"], n = 2
	Output: 8
	Explanation:
	A -> B -> idle -> A -> B -> idle -> A -> B
	There is at least 2 units of time between any two same tasks.
	
	Example 2:
	Input: tasks = ["A","A","A","B","B","B"], n = 0
	Output: 6
	Explanation: On this case any permutation of size 6 would work since n = 0.
	["A","A","A","B","B","B"]
	["A","B","A","B","A","B"]
	["B","B","B","A","A","A"]
	...
	And so on.
	
	Example 3:
	Input: tasks = ["A","A","A","A","A","A","B","C","D","E","F","G"], n = 2
	Output: 16
	Explanation:
	One possible solution is
	A -> B -> C -> A -> D -> E -> A -> F -> G -> A -> idle -> idle -> A -> idle -> idle-> A

	Constraints:
	1 <= task.length <= 104
	tasks[i] is upper-case English letter.
	The integer n is in the range [0, 100].


*/


class Solution {
    public int leastInterval(char[] tasks, int n) {
        if (n == 0 || tasks.length == 1) return tasks.length;

        int[] freq = count(tasks);

        Arrays.sort(freq);
        // place task with maximum priority first
        int max = freq[25]-1;
		int spaces = max * n;

		for (int i = 24; i >= 0; i--) {
            if (freq[i] == 0) break;
			spaces -= Math.min(max, freq[i]);
		}

		/* Handle cases when spaces become negative */
		spaces = Math.max(0, spaces);

		return tasks.length + spaces;
    }

    private int[] count(char[] tasks) {
        int[] freq = new int[26];

        for (int i = 0; i < tasks.length; i++) {
            freq[tasks[i] - 'A']++;
        }

        return freq;
    }

}
