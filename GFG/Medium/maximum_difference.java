/*

	Maximum Difference

	Company: Microsoft
	Platform: GFG
	Love Bubbar’s DSA sheet

	Description
	Given array A[] of integers, the task is to complete the function findMaxDiff which finds
	the maximum absolute difference between nearest left and right smaller element of every
	element in array.If the element is the leftmost element, nearest smaller element on left side is
	considered as 0. Similarly if the element is the rightmost elements, smaller element on right side
	is considered as 0.

	Examples:
	
	Input : arr[] = {2, 1, 8}
	Output : 1
	Left smaller LS[] {0, 0, 1}
	Right smaller RS[] {1, 0, 0}
	Maximum Diff of abs(LS[i] - RS[i]) = 1
	
	Input : arr[] = {2, 4, 8, 7, 7, 9, 3}
	Output : 4
	Left smaller LS[] = {0, 2, 4, 4, 4, 7, 2}
	Right smaller RS[] = {0, 3, 7, 3, 3, 3, 0}
	Maximum Diff of abs(LS[i] - RS[i]) = 7 - 3 = 4
	
	Input : arr[] = {5, 1, 9, 2, 5, 1, 7}
	Output : 1

	Input:
	The first line of input contains an integer T denoting the no of test cases. Then T test
	cases follow .Each test case contains an integer N denoting the size of the array A. In
	the next line are N space separated values of the array A.
	Output:
	For each test case output will be in a new line denoting the the maximum absolute
	difference between nearest left and right smaller element of every element in array.

	Constraints:
	1<=T<=100
	1<=N<=100
	1<=A[ ]<=100

	Example(To be used only for expected output) :
	Input:
	2
	3
	2 1 8
	7
	2 4 8 7 7 9 3
	Output
	1
	4

*/


class Solution
{
    int findMaxDiff(int a[], int n)
    {
	int ls[]=new int[n],ans=0;
	Stack<Integer> st=new Stack<>();
	for(int i=0;i<n;i++){
	    while(!st.isEmpty() && st.peek()>=a[i]) st.pop();
	    if(st.isEmpty()) ls[i]=0;
	    else ls[i]=st.peek();
	    st.push(a[i]);
	}
	st.clear();
	for(int i=n-1;i>=0;i--){
	    while(!st.isEmpty() && st.peek()>=a[i]) st.pop();
	    int x=0;
	    if(!st.isEmpty()) x=st.peek();
	    ans=Math.max(ans,Math.abs(ls[i]-x));
	    st.push(a[i]);
	}
	return ans;
    }
}
