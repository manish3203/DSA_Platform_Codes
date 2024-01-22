
/*

   	Element with left side smaller and right side greater
	Company: Zoho, Amazon, OYO Rooms, Intuit
	Platform: GFG

	Description :
	Given an unsorted array of size N. Find the first element in the array such that all
	of its left elements are smaller and all right elements are greater than it.
	Note: Left and right side elements can be equal to required elements. And extreme
	elements cannot be required.

	Example 1:
	Input:
	N = 4
	A[] = {4, 2, 5, 7}
	Output:
	5
	Explanation:
	Elements on left of 5 are smaller than 5
	and on right of it are greater than 5.

	Example 2:
	Input:
	N = 3
	A[] = {11, 9, 12}
	Output:
	-1

	Expected Time Complexity: O(N)
	Expected Auxiliary Space: O(N)

	Constraints:
	3 <= N <= 106
	1 <= A[i] <= 106

*/

class Compute {
    public int findElement(int arr[], int n){
        
        int greater[] = new int[n];
        int smaller[] = new int[n];
        int greaterEle = arr[0];
        int smallerEle = arr[n-1];
        int data = -1;
        
        for(int i=0; i<n; i++) {
            
            if(arr[i] > greaterEle) {
                
                greaterEle = arr[i];
            }
            greater[i] = greaterEle;
        }
        
        for(int j=n-1; j>=0; j--) {
            
            if(arr[j] < smallerEle) {
                
                smallerEle = arr[j];
            }
            smaller[j] = smallerEle;
        }
        
        for(int i=0; i<n; i++) {
            
            if(i!=0 && i!=arr.length-1) {
                
                if(greater[i] == smaller[i]) {
                    
                    data = greater[i];
                    break;
                }
            }
        }
        return data;
    }
}
