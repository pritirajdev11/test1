package firstpackage;

public class RemoveSpaces {
    
    public static String removeLeadingTrailingSpaces(String str) 
    {
        
        
        int left = 0;
        int right = str.length() - 1;
        
       
        while (left <= right && str.charAt(left) == ' ') {
            left++;
        }
        
       
        while (left <= right && str.charAt(right) == ' ') {
            right--;
        }
        

        return str.substring(left, right + 1);
    }
    
    public static void main(String[] args) {
        String str = "  I Love India  ";
        String spaces = removeLeadingTrailingSpaces(str);
        System.out.println(spaces);
    }
}
