// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // Implement your solution here
        int result = 0;
        
        for (int element : A) {
            result ^= element;
        }
        
        return result;
    }
}
