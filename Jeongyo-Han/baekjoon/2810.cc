#include <iostream>

using namespace std;

int main()
{
    int n;
    cin >> n;
    string str;
    cin >> str;

    int couple = 0;
    int ans =0;
    for (int i =0; i<n; i++)
    {
        if ('S' == str[i]) ans++;
        else couple++, ans++;
    }
    if(couple>0)
        ans -= (couple/2-1);
    cout  << ans;

}
