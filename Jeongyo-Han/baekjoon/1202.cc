#include <iostream>
#include <vector>
#include <algorithm>
#include <queue>

using namespace std;

struct Product{
  int w, v;
  Product(int w, int v) : w(w), v(v) {}
  Product(){}
  bool operator<(const Product& o)const {
    return w < o.w;
  }
};

int main()
{
  ios::sync_with_stdio(false);
  cin.tie(NULL);
  cout.tie(NULL);

  int n, m;
  cin >> n >> m;
  vector<Product> v(n);
  vector<int> w(m);
  for (int i=0; i< n; i++) 
    cin>> v[i].w >> v[i].v;

  for (int i=0; i<m; i++)
    cin >> w[i];

  sort(v.begin(), v.end());
  sort(w.begin(), w.end());

  priority_queue<int> pq;
  int j =0;
  long long ans = 0;
  for (int i=0; i<m; i++){
    while(j<n && v[j].w <= w[i]){
      pq.push(v[j].v);
      j++;
    }

    if (!pq.empty()){
      ans += pq.top();
      pq.pop();
    }
  }

  cout << ans;
}