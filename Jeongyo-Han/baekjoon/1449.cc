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

  int n, l;
  cin >> n >> l;

  vector<bool> v(1000);
  for (int i=0; i<n; i++)
  {
    int tmp;
    cin >> tmp;
    v[tmp-1]=true;
  }

  int ans =0;
  for (int i=0; i<1000; i++)
  {
    if (v[i])
    {
      ans++;
      for (int k=0;k<l && k+i<1000; k++)
        v[k+i]=false;
    }
  }
  cout << ans;

}
