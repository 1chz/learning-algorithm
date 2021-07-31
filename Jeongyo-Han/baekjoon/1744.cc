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
  vector<long long> v(n);
  for(int i=0; i < n;i++) cin >> v[i];
  sort(v.begin(), v.end());

  long long ans = 0;
  int i =0, j=n-1;

  for(; i < j; i += 2){
    if ( v[i] < 1 && v[i+1] < 1 ){
      ans += v[i] * v[i + 1];
    } else break;
  }

  for (; j> 0; j-=2){
    if ( v[j] > 1 && v[j-1] > 1){
      ans += v[j] * v[j-1];
    } else break;
  }

  for (;j>=i;j--){
    ans += v[j];
  }
  cout << ans;
}
