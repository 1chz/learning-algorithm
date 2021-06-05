#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

bool go(vector<int>& cur, vector<int>& coin, int idx, int remain)
{
    if (cur.size() == idx)
    {
        return true;
    }

    int mxCur = remain/coin[idx];
    for (int i=mxCur; i>=0; i--)
    {
        cur[idx] = i;
        if ( go(cur, coin, idx+1, remain-cur[idx]*coin[idx]) )
            return true;
    }
    return false;
}

int main()
{
    int n, k;
    cin >> n >> k;

    vector<int> coin;
    vector<int> count;

    count.resize(n);
    for (int i=0; i<n; i++)
    {
        int tmp;
        cin >> tmp;
        coin.push_back(tmp);
    }

    reverse(coin.begin(), coin.end());
    go(count, coin, 0, k);

    int ans =0;
    for (int c:count)
    {
        ans += c;
    }
    cout << ans;
}
