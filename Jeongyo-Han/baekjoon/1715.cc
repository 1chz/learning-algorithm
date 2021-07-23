#include <bits/stdc++.h>

using namespace std;
int main()
{
  ios::sync_with_stdio(false);
  cin.tie(NULL);
  cout.tie(NULL);

  priority_queue<int> pq;
  int n;
  cin >> n;
  for (int i=0; i<n; i++){
    int tmp;
    cin >> tmp;
    tmp = -tmp;
    pq.push(tmp);
  }

  int ans =0;
  while(!pq.empty()){
    int p = pq.top();
    pq.pop();
    if (pq.empty()) {
      cout << ans;
      break;
    }
    int q = pq.top();
    pq.pop();
    ans += -(p+q);
    pq.push(p+q);
  }
}
