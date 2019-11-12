Q: Given a string, determine if a permutation of the string could form a palindrome.

A: 
  public boolean canPermutePalindrome(String s) {
          int[] table = new int[128];

          for (char c: s.toCharArray()) {
              int v = (int)c;
              table[v]++;
          }
          int oddCount = 0;
          for (int i : table) {
              if (i%2 == 1)
                  oddCount++;
          }
          return oddCount <= 1;
      }
