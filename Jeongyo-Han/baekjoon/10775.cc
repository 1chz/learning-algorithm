#include <iostream>

using namespace std;

int p[100001];
int ufind(int o){
  if (p[o] == o) return o;
  return p[o]=ufind(p[o]);
}
int main()
{
  ios::sync_with_stdio(false);
  cin.tie(NULL);
  cout.tie(NULL);

  int g, P;
  cin >> g >> P;
  for (int i=0; i<100001; i++) p[i]=i;

  int ans=0;
  for (int i=0; i<P; i++){
    int t;
    cin >> t;

    int u = ufind(t);
    int v = ufind(u-1);
    cout << u <<"\n";
    if ( u == 0) {
      break;
    }
    p[u]=v;
    ans++;
  }
  cout << ans;
}
