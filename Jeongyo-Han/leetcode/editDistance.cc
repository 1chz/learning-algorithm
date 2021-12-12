class Solution {
public:
    int minDistance(string word1, string word2) {
        int d[501][501];
        
        int s1 = word1.size();
        int s2 = word2.size();
        for (int i=0; i<501; i++) d[0][i] = d[i][0] = i;
            
        for (int i=1; i<=s1; i++) {
            for (int j=1; j<=s2; j++) {
                int dd = 1;
                if (word1[i-1] == word2[j-1]) {
                    dd = 0;
                }
                d[i][j] = min(min(d[i-1][j]+1, d[i][j-1]+1), d[i-1][j-1]+dd);
            }
        }
        if (s1 == 0 || s2 == 0) return max(s1, s2);
        
        return d[s1][s2];
    }
};

