class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int player = 0;
        int trainer = 0;
        int max = 0;
        int match = 0;
        while(player < players.length && trainer < trainers.length){
            if(players[player] <= trainers[trainer]){
                match++;
                player++;
            }
            trainer++;
            max = Math.max(match, max);
        }
        return max;
    }
}
