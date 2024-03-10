import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int cnt = 0;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < scoville.length; i++) pq.add(scoville[i]);
        
        while (pq.peek() < K) {
            if (pq.size() == 1) return -1;
            pq.add(pq.poll() + 2 * pq.poll());
            cnt++;
        }
        
        return cnt;
    }
}