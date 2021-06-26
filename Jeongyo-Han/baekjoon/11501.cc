#include <iostream>
#include <string>
#include <algorithm>
#include <vector>
#include <queue>

using namespace std;
int main()
{
  ios::sync_with_stdio(false);
  cin.tie(NULL);
  cout.tie(NULL);

  int t;
  cin >> t;
  while( t-- )
  {
    int n;
    cin >> n;

    priority_queue<pair<int, int> > v;
    vector<int> v2(n);

    for (int i=0; i<n; i++)
    {
      cin >> v2[i];
      v.push(make_pair(v2[i], i));
    }

    int start = 0;
    long long ans = 0;
    do
    {
      pair<int,int> cur = v.top();
      v.pop();
      int mx = cur.first;
      int j = cur.second;

      if (start > j) 
        continue;

      long long tmp = 0;
      for (int i=start; i<j; i++)
      {
        tmp += mx-v2[i];
      }

      ans += tmp;
      start = j + 1;
    } while( !v.empty() );

    cout << ans <<"\n";
  }
}
 