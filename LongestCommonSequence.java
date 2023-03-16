package firstpackage;
public class LongestCommonSequence {
	    public static String findLongestCommonSequence(String s1, String s2) {
	        String result = "";
	        int[][] matrix = new int[s1.length()+1][s2.length()+1];
	        for (int i = 0; i < s1.length(); i++) {
	            for (int j = 0; j < s2.length(); j++) {
	                if (s1.charAt(i) == s2.charAt(j)) {
	                    matrix[i+1][j+1] = matrix[i][j] + 1;
	                    if (matrix[i+1][j+1] > result.length()) {
	                        result = s1.substring(i-matrix[i+1][j+1]+1, i+1);
	                    }
	                }
	            }
	        }
	        return result;
	    }
	    
	    public static void main(String[] args) {
	        String s1 = "abcdefghik";
	        String s2 = "aecfghikcs";
	        System.out.println("Longest Common subString is:"+findLongestCommonSequence(s1, s2));
	    }
	}
