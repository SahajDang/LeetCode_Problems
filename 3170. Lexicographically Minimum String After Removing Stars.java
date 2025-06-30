class Pair{
    char ch;
    int idx;

    Pair(char ch, int idx){
        this.ch = ch;
        this.idx = idx;
    }
}

class Solution {
    public String clearStars(String s) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> {
            if(a.ch != b.ch) return Character.compare(a.ch, b.ch);
            else return Integer.compare(b.idx, a.idx);
        });

        pq.add(new Pair(s.charAt(0), 0));
        int[] vis = new int[s.length()];

        for(int i=1; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '*'){
                vis[i] = -1;
                Pair p = pq.poll();
                vis[p.idx] = -1;
            }else{
                pq.add(new Pair(ch, i));
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if(vis[i] != -1){
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
