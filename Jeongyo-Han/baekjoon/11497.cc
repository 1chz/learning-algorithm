#include <iostream>
#include <string>
#include <algorithm>
#include <vector>

using namespace std;
int main()
{
  ios::sync_with_stdio(false);
  cin.tie(NULL);
  cout.tie(NULL);

  int t;
  cin >> t;
  while(t--)
  {
    int n;
    cin >> n;
    vector<int> v(n), ans(n);
    for (int i=0; i<n; i++)
      cin >> v[i];

    sort(v.begin(), v.end());

    for (int i=0; i<n; i++)
    {
      if (i%2) ans[i/2]=v[i];
      else ans[n-1-(i/2)]=v[i];
    }

    int mxdiff = 0;
    for (int i=0; i<n;i++)
    {
      int value = ans[(i+1)%n] - ans[i];
      if (value<0)
        value = -value;
      if (mxdiff < value)
        mxdiff = value;
    }

    cout << mxdiff <<"\n";
  }
}
