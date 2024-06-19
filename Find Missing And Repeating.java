// Find Missing And Repeating 

Given an unsorted array arr of size n of positive integers. One number 'A' from set {1, 2,....,N} is missing and one number 'B' occurs twice in array. Find these two numbers.
Your task is to complete the function findTwoElement() which takes the array of integers arr and n as parameters and returns an array of integers of size 2 denoting the answer (The first index contains B and second index contains A)

Examples

Input: n = 2 arr[] = {2, 2}
Output: 2 1
Explanation: Repeating number is 2 and smallest positive missing number is 1.
Input: n = 3 arr[] = {1, 3, 3} 
Output: 3 2
Explanation: Repeating number is 3 and smallest positive missing number is 2.
Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1)

  class Solve {
    int[] findTwoElement(int arr[], int n) {
        // code here
        int ans[] = new int[2];
        
        for(int i=0; i<n; i++) {
            int val = Math.abs(arr[i]);
            
            if(arr[val-1] < 0) {
                ans[0] = val;
            } else {
                arr[val - 1] = -arr[val - 1];
            }
        }
        
        for(int i=0; i<n; i++) {
            if(arr[i] > 0) {
                ans[1] = i+1;;
                break;
            }
        }
        return ans;
    }
}
