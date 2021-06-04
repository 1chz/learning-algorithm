#include <iostream>
#include <string>
#include <algorithm>
#include <vector>

using namespace std;
int face(int i)
{
    if (i==0) return 5;
    if (i==1) return 4;
    if (i==2) return 3;
    if (i==5) return 0;
    if (i==4) return 1;
    if (i==3) return 2;
    return -1;
};

int main()
{
  ios::sync_with_stdio(false);
  cin.tie(NULL);
  cout.tie(NULL);

  int n;
  cin >> n;
  vector<int> v(6);
  int mn_one = 1e9;
  int mx_one = 0;
  int sum = 0;
  for (int i=0; i<6; i++)
  {
    cin>> v[i];
    mn_one = min(mn_one, v[i]);
    mx_one = max(mx_one, v[i]);
    sum += v[i];
  }

  int mn_double = 1e9;
  for (int i=0; i<6; i++)
  {
      for (int j=0; j<6; j++)
      {
          if (i==j) continue;
          if (face(i) == j) continue;

          int cc = v[i] + v[j];
          if (cc < mn_double) mn_double = cc;
      }
  }

  int mn_triple = 1e9;
  mn_triple = min(mn_triple, v[0]+v[1]+ v[2]);
  mn_triple = min(mn_triple, v[0]+v[2]+ v[4]);
  mn_triple = min(mn_triple, v[0]+v[4]+ v[3]);
  mn_triple = min(mn_triple, v[0]+v[3]+ v[1]);
  mn_triple = min(mn_triple, v[5]+v[1]+ v[2]);
  mn_triple = min(mn_triple, v[5]+v[2]+ v[4]);
  mn_triple = min(mn_triple, v[5]+v[4]+ v[3]);
  mn_triple = min(mn_triple, v[5]+v[3]+ v[1]);
  
  long long cheap0 = mn_one;
  long long cheap1 = mn_double;
  long long cheap2 = mn_triple;

  if (n==1)
  {
    cout << sum-mx_one;
    return 0;
  }

  long long ans = 
    (n-2LL)*(n-2LL)*cheap0 + //one side cap
    4*(n-2LL)*(n-1LL)*cheap0 + //one side left,right,up,down
    4*(n-2LL)*cheap1 + //double side cap
    4*(n-1LL)*cheap1 + //double side left, right, up, down
    4*cheap2; // triple side top  

  cout << ans;
}
