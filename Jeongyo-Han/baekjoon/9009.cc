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

  vector<int> v;
  int f1=1, f2=2;
  v.push_back(f1);
  v.push_back(f2);
  while (f1+f2<=1e9)
  {
    v.push_back(f1+f2);
    int tmp = f1;
    f1 = f2;
    f2 = tmp+f2;
  }
  reverse(v.begin(), v.end());

  while(t--)
  {
    vector<int> ans;
    int n;
    cin >> n;

    int tmp = 0;
    for (int i=0; i<v.size(); i++)
    {
      if (tmp + v[i] > n) continue;
      tmp += v[i];
      ans.push_back(v[i]);
      if (tmp == n) break;
    }
    sort(ans.begin(), ans.end());

    for(int i: ans)
      cout << i << " ";
    cout << "\n";
  }

}
