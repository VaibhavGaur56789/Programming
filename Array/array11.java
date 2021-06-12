//Count pairs with given sum

import java.io.*;
import java.util.*;

class GFG {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int k = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            int ans = new Solution().getPairsCount(arr, n, k);
            System.out.println(ans);
        }
    }
}

class Solution {
    int getPairsCount(int[] arr, int n, int k) {
        int count = 0;
        HashMap<Integer, Integer> m = new HashMap<>();

        for(int i=0; i<n; i++) {
            if(arr[i] < k) {
                int element = k-arr[i];
                if(m.containsKey(element)) {
                    count = count + m.get(element);
                }
                if(m.get(arr[i]) == null)
                {
                    m.put(arr[i], 0);
                }
                m.put(arr[i], m.get(arr[i])+1);
            }
        }
        return count;

    }
}


