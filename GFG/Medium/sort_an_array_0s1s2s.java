/*

	Sort an array of 0s, 1s and 2s
	
	Company: Paytm, Flipkart, Morgan Stanley, Amazon, Microsoft, OYO Rooms,
	Samsung, Snapdeal, Hike, MakeMyTrip, Ola Cabs, Walmart, MAQ Software,
	Adobe, Yatra.com, SAP Labs, Qualcomm
	
	Platform: GFG
	Striver’s and Love Babbar’s DSA sheet.

	Description:
	Given an array nums with n objects colored red, white, or blue, sort them
	in-place so that objects of the same color are adjacent, with the colors in
	the order red, white, and blue.
	We will use the integers 0, 1, and 2 to represent the color red, white, and
	blue, respectively.
	You must solve this problem without using the library's sort function.
	
	Example 1:
	Input: nums = [2,0,2,1,1,0]
	Output: [0,0,1,1,2,2]

	Example 2:
	Input: nums = [2,0,1]
	Output: [0,1,2]

	Constraints:
	n == nums.length
	1 <= n <= 300
	nums[i] is either 0, 1, or 2.

*/

class Solution
{
    public static void sort012(int a[], int n)
    {

        int zeroCounter = 0;
        int oneCounter = 0;
        int twoCounter = 0;

        for(int i=0; i<n; i++) {

            if(a[i] == 0)

                zeroCounter++;
            else if(a[i] == 1)

                oneCounter++;

            else

                twoCounter++;
        }

        int j = 0;
        for(int i=0; i<zeroCounter; i++) {

            a[j++] = 0;
        }

        for(int i=0; i<oneCounter; i++) {

            a[j++] = 1;
        }
        for(int i=0; i<twoCounter; i++) {

            a[j++] = 2;
        }
    }
}
