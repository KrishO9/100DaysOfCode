class Solution {
     public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int score =0;
        int i =0;
        int j = tokens.length -1;
        int max = 0;

    while(i<=j)
    {
        if(power>=tokens[i]){
            power = power-tokens[i++];
            score++;
            max = Math.max(score, max);
            System.out.println(max);
        }
        else if(score>=1){
            power = power+tokens[j--];
            score--;
            System.out.println(score);
        }
        else{
            break;
        }
    }
    return max;
    }
}