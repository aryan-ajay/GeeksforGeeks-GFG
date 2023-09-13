Largest number possible
  Given two numbers 'N' and 'S' , find the largest number that can be formed with 'N' digits and whose sum of digits should be equals to 'S'. Return -1 if it is not possible.

// Example 1:
// Input: N = 2, S = 9
// Output: 90
// Explaination: It is the biggest number 
// with sum of digits equals to 9.
// Example 2:
// Input: N = 3, S = 20
// Output: 992
// Explaination: It is the biggest number 
// with sum of digits equals to 20.

  class Solution{
    static String findLargest(int N, int S){
        // code here
        if(S>9*N || (N!=1 && S==0)) {
            return "-1";
        }
        
        int a = S/9;
        int b = S%9;
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<a; i++) {
            sb.append(9);
        }
        if(a<N) {
            sb.append(b);
            for(int i=0; i<N-a-1; i++) {
                sb.append(0);
            }
        }
        return sb.toString();
    }
}
