// MO’s Algorithm (Query Square Root Decomposition)

We are given an array and a set of query ranges, we are required to find the sum of every query range.

Example: 

Input:  arr[]   = {1, 1, 2, 1, 3, 4, 5, 2, 8};
        query[] = [0, 4], [1, 3] [2, 4]
Output: Sum of arr[] elements in range [0, 4] is 8
        Sum of arr[] elements in range [1, 3] is 4  
        Sum of arr[] elements in range [2, 4] is 6


// Code
import java.util.*;

// Class to represent a query range 
class Query {
    int L;
    int R;
    Query(int L, int R) {
        this.L = L;
        this.R = R;
    }
}
public class Ajay {
    // Prints sum of all query ranges. m is number of queries
    public static void printSum(int arr[], int n, ArrayList<Query> q, int m) {

        for(int i=0; i<m; i++) {

            // Left and right boundaries of current range
            int L = q.get(i).L;
            int R = q.get(i).R;

            int sum = 0;
            for(int j=L; j<=R;  j++) {
                sum += arr[j];
            }

            System.out.println("Sum of [ "+ L+ ", "+ R+" ] is: "+sum);
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 1, 3, 4, 5, 2, 8};
        int n = arr.length;

        ArrayList<Query> q = new ArrayList<Query>();
        q.add(new Query(0, 4));
        q.add(new Query(1, 3));
        q.add(new Query(2, 4));

        int m = q.size();

        printSum(arr, n, q, m)  ;
    }
}
