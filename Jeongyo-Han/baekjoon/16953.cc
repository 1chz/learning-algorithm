#include <iostream>
#include <string>
#include <algorithm>
#include <queue>
#include <map>
#include <vector>

using namespace std;
int main()
{
  ios::sync_with_stdio(false);
  cin.tie(NULL);
  cout.tie(NULL);

  queue<long long> q;
  map<long long, int> d;
  long long a, b;
  cin >> a >> b;

  d[a] = 1;
  q.push(a);
  while(!q.empty())
  {
    long long cur = q.front();
    q.pop();

    if (cur*2<=b && d.find(cur*2) == d.end())
    {
      d[cur*2] = d[cur]+1;
      q.push(cur*2);
    }

    if (cur*10+1<=b && d.find(cur*10 +1) == d.end())
    {
      d[cur*10+1] = d[cur]+1;
      q.push(cur*10+1);
    }
  }

  if (d.find(b) == d.end())
    cout << -1;
  else cout << d[b];
}
