// Question Reverse a String

//   Input:
// s = Geeks
// Output: skeeG


  class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        // Reverse the string str
        StringBuilder sb = new StringBuilder();
        int n = str.length();
        for(int i=0; i<n; i++){
            sb.append(str.charAt(n-1-i));
        }
        return sb.toString();
    }
}
