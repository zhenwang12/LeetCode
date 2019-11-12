/*    We are given two strings, A and B.
*
*     A shift on A consists of taking string A and moving the leftmost character to the rightmost position. 
*     For example, if A = 'abcde', then it will be 'bcdea' after one shift on A. 
*     Return True if and only if A can become B after some number of shifts on A.
*/
    public boolean rotateString(String A, String B) {
        //if length of two strings are different, return false;
        if (A.length() != B.length())
            return false;
        
        //if two strings are identical, return true
        if (A.equals(B))
            return true;
        
        //cut string A into two parts in a rotation, x and y, so A = xy; If B is the rotation of A, then B = yx;
        //B must be the substring of xyxy -> AA.contains(B)
        String newStr = A + A;
        return newStr.contains(B);
    }
