
/*

   	Alternate positive and negative numbers
	Company : Paytm, VMWare, Amazon, Microsoft, Intuit, Hotstar, PayU, FourKites, KPIT,
	CodeNation
	Love Bubbar’s SDE Sheet.
	Platform : GFG, Coding Ninjas

	Description :
	Given an unsorted array Arr of N positive and negative numbers. Your task is to
	create an array of alternate positive and negative numbers without changing the relative
	order of positive and negative numbers.
	Note: Array should start with a positive number and 0 (zero) should be considered a
	positive element.

	Example 1:
	Input:
	N = 9
	Arr[] = {9, 4, -2, -1, 5, 0, -5, -3, 2}
	Output:
	9 -2 4 -1 5 -5 0 -3 2
	Explanation :
	Positive elements : 9,4,5,0,2
	Negative elements : -2,-1,-5,-3
	As we need to maintain the relative order of
	positive elements and negative elements we will pick
	each element from the positive and negative and will
	store them. If any of the positive and negative numbers
	are completed. we will continue with the remaining signed
	elements.The output is 9,-2,4,-1,5,-5,0,-3,2.

	Example 2:
	Input:
	N = 10
	Arr[] = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8}
	Output:
	5 -5 2 -2 4 -8 7 1 8 0
	Explanation :
	Positive elements : 5,2,4,7,1,8,0
	Negative elements : -5,-2,-8
	As we need to maintain the relative order of
	positive elements and negative elements we will pick
	each element from the positive and negative and will
	store them. If any of the positive and negative numbers
	are completed. we will continue with the remaining signed
	elements.The output is 5,-5,2,-2,4,-8,7,1,8,0.

	Your Task:
	Expected Time Complexity: O(N)
	Expected Auxiliary Space: O(N)

	Constraints:
	1 ≤ N ≤ 107
	-106 ≤ Arr[i] ≤ 107

*/

class Solution {
    void rearrange(int arr[], int n) {

        ArrayList<Integer> positiveEle = new ArrayList<>();
        ArrayList<Integer> negativeEle = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            if(arr[i] >= 0) {
                positiveEle.add(arr[i]);
            } else {
                negativeEle.add(arr[i]);
            }
        }

        int k = 0;
        int l = 0;
        int m = 0;
        int o = 0;

        while(k < positiveEle.size() && l < negativeEle.size()) {
            if(o % 2 == 0) {
                arr[m++] = positiveEle.get(k++);
            } else {
                arr[m++] = negativeEle.get(l++);
            }
            o++;
        }

        while(k < positiveEle.size()) {
            arr[m++] = positiveEle.get(k++);
        }

        while(l < negativeEle.size()) {
            arr[m++] = negativeEle.get(l++);
        }
    }
}

