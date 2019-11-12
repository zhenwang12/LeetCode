/* Q: Given a string, determine if a permutation of the string could form a palindrome. 
*
*/
    public boolean canPermutePalindrome(String s) {
        //Assuming input is an ASCII string
        int[] table = new int[128];
        
        //Count how many times each character appears
        for (char c : s.toCharArray()) {
            int v = (int) c;
            table[v]++;
        }
        
        //To form a palindrome, string can have at most one charater that is odd.
        int oddCount = 0;
        for (int i : table) {
            if (i % 2 == 1)
                oddCount++;
        }
     
        return oddCount <= 1;
    }
