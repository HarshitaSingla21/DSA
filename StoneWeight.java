class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> max=new PriorityQueue<>(Collections.reverseOrder());
        for(int stone:stones){
            max.offer(stone);
        }
        while (max.size() > 1) {
            int x = max.poll();
            int y = max.poll();
            if (x != y) {
                max.offer(x - y);
            }
        }
        return max.isEmpty() ? 0 : max.poll();
    }
}