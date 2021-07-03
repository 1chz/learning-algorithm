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
  
  sort(v.begin(), v.end());
  int j =1;
  long long ans = 0;
  for (int i=n-1; i>=0; i--)
  {
    int value = v[i] - (j++ - 1);
    if (value > 0)
      ans += value;
  }
  cout << ans;
}
