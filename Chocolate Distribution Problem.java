Given an array A[ ] of positive integers of size N, where each value represents the number of chocolates in a packet. Each packet can have a variable 
  number of chocolates. There are M students, the task is to distribute chocolate packets among M students such that :
1. Each student gets exactly one packet.
2. The difference between maximum number of chocolates given to a student and minimum number of chocolates given to a student is minimum.


  Example 1:

Input:
N = 8, M = 5
A = {3, 4, 1, 9, 56, 7, 9, 12}
Output: 6
Explanation: The minimum difference between maximum chocolates and minimum chocolates is 9 - 3 = 6 by choosing following M packets :{3, 4, 9, 7, 9}.

//using arrayList
class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        Collections.sort(a);
        long res = Long.MAX_VALUE;
        
        for(int i=0; i<n-m+1; i++) {
            int minEle = a.get(i);
            int maxEle = a.get(i+m-1); //0+5-1 = 4 
            res = Math.min(res, maxEle-minEle);
        }
        return res;
    }
}

//using Array
public static int minCho(int arr[], int m) {
        Arrays.sort(arr);
        int res = Integer.MAX_VALUE;

        for(int i=0; i<arr.length-m+1; i++) {
            int minEle = arr[i];
            int maxEle = arr[i+m-1];

            res = Math.min(res, maxEle-minEle);
        }
        return res;
  }
