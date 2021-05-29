#include <iostream>

using namespace std;

int coin[6] = {500, 100, 50, 10, 5, 1};
int main()
{
    int n;
    cin >> n;
    n = 1000 - n;

    int ans =0;
    for (int i=0; i<6; i++)
    {
        ans += (n/coin[i]);
        n = (n%coin[i]);
    }
    cout << ans;
}
