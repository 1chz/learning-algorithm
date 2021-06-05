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

  priority_queue<long long> pq;
  int n, m;
  cin >> n >> m;
  int tmp;
  for (int i=0; i<n; i++)
  {
    cin >> tmp;
    pq.push(-tmp);
  }

  while(m--)
  {
    long long a = pq.top();
    pq.pop();
    a = -a;
    long long b = pq.top();
    pq.pop();
    b= -b;
    long long c = a+b;
    pq.push(-c);
    pq.push(-c);
  }
  long long ans = 0;
  while(!pq.empty())
  {
    long long tt=0;
    tt=pq.top();
    pq.pop();
    ans += tt;
    cout << tt << "\n";
  }
  cout << -ans;
}
