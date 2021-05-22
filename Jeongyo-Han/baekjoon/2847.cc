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

  int n;
  cin >> n;
  vector<int> v(n);
  for (int i=0; i<n; i++)
    cin >> v[i];

  int ans=0;
  for (int i=n-1; i>0; i--)
  {
    if (v[i] <= v[i-1])
    {
      ans += v[i-1]-v[i]+1;
      v[i-1] = v[i]-1;
    }
  }
  cout << ans;

}
