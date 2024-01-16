
/*

	Find the smallest and second smallest element in an array
	Company: Amazon, Goldman Sachs
	Platform: GFG

	Description:
	Given an array of integers, your task is to find the smallest and second smallest
	element in the array. If smallest and second smallest do not exist, print -1.

	Example 1:
	Input :
	5
	2 4 3 5 6
	Output :
	2 3
	Explanation:
	2 and 3 are respectively the smallest
	and second smallest elements in the array.

	Example 2:
	Input :
	6
	1 2 1 3 6 7
	Output :
	1 2
	Explanation:
	1 and 2 are respectively the smallest
	and second smallest elements in the array.

	Expected Time Complexity: O(N)
	Expected Auxiliary Space: O(1)

	Constraints:
	1<=N<=105
	1<=A[i]<=105

*/

class Compute {
    
	public long[] minAnd2ndMin(long a[], long n) {

		long[] b = new long[2];
     		HashSet<Long> hs = new HashSet<>();

     		for(long data : a) {

         		hs.add(data);
     		}

     		long[] arr = new long[hs.size()];

        	int index = 0;

        	for(long data : hs) {

            		arr[index++] = data;
        	}

        	Arrays.sort(arr);

        	if(arr.length > 1) {

            		b[0] = arr[0];
            		b[1] = arr[1];
        	}else {

            		b[0] = -1;
            		b[1] = -1;
        	}

        	return b;
	}
}

