package firstpackage;

public class RemoveSpaces {
    
    public static String removeLeadingTrailingSpaces(String str) 
    {
        
        // Initialize left and right pointers to track leading and trailing spaces
        int left = 0;
        int right = str.length() - 1;
        
        // Traverse from left to right and increment left pointer until non-space character is found
        while (left <= right && str.charAt(left) == ' ') {
            left++;
        }
        
        // Traverse from right to left and decrement right pointer until non-space character is found
        while (left <= right && str.charAt(right) == ' ') {
            right--;
        }
        
        // Return substring between left and right pointers (i.e. string with leading and trailing spaces removed)
        return str.substring(left, right + 1);
    }
    
    public static void main(String[] args) {
        String str = "  I Love India  ";
        String trimmedStr = removeLeadingTrailingSpaces(str);
        System.out.println(trimmedStr);
    }
}