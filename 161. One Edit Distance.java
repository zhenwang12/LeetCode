/*      Given two strings s and t, determine if they are both one edit distance apart.
*
*       Note: 
*
*       There are 3 possiblities to satisify one edit distance apart:
*
*               1.Insert a character into s to get t
*               2. Delete a character from s to get t
*               3. Replace a character of s to get t
*/

public boolean isOneEditDistance(String s, String t) {
        //If two strings are identical, return false
        if (s.equals(t))
            return false;
        
        //If the diff of two strings length are greater than 1, return false
        if (Math.abs(s.length() - t.length()) > 1)
            return false;
        
        String s1 = s.length() > t.length() ? s : t; //longer one
        String s2 = s.length() > t.length() ? t : s; //shorter one
        boolean diff = false;
        int index1 = 0, index2 = 0;
        
        while(index1 < s1.length() && index2 < s2.length()) {
            if (s1.charAt(index1) != s2.charAt(index2)){
                //make sure this is the first difference found
                if (diff)
                    return false;
                diff = true;
                
                //same length, so on replacement, move the shorter pointer
                if (s1.length() == s2.length()) {
                    index2++;
                }
            } else {
                //If matching, move the shorter pointer
                index2++;
            }
                
            //Always move the longer pointer
            index1++;
        }
        return true;   
    }
