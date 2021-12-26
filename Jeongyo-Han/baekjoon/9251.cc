#include <iostream>
#include <algorithm>
#include <string>

using namespace std;

int main() {
    string s;
    string t;
    cin >> s >> t;

    int dp[1001][1001] = { 0, };
    for (int i=0; i<1001; i++) dp[0][i] = dp[i][0] = 0;

    for (int i=1;i<=s.size(); i++) {
        for (int j=1;j<=t.size(); j++){
            if (s[i-1] == t[j-1]) dp[i][j] = dp[i-1][j-1]+1;
            else {
                dp[i][j] = max(dp[i-1][j], dp[i][j-1]);
            }
        }
    }
    cout << dp[s.size()][t.size()];
}