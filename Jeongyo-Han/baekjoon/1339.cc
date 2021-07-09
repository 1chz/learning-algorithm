#include <iostream>
#include <string>
#include <algorithm>
#include <vector>
#include <map>
#include <set>

using namespace std;

int main()
{
  ios::sync_with_stdio(false);
  cin.tie(NULL);
  cout.tie(NULL);

  int n;
  cin >> n;

  long long al[26] = {0, };

  while(n--)
  {
    string str;
    cin >> str;
    reverse(str.begin(), str.end());
    long long base = 1;
    for (int i=0 ;i<str.size(); i++)
    {
      int idx = str[i]-'A';
      al[idx] += base;
      base *= 10;
    }
  }

  long long ans= 0;
  int aloc[26] = {0, };
  int cnt = 9;

  /*
  for (int i=0; i< 26; i++)
    if (al[i]) cout << (char)(i+'A') << ": " << al[i] <<"\n";
  */
  while(true)
  {
    int idx = -1;
    long long mx = 0;
    for (int i=0; i<26; i++)
    {
      if (mx < al[i])
      {
        idx  = i;
        mx = al[i];
      }
    }
    
    if (idx == -1) 
    {
      for (int i=0; i<26; i++)
        ans += aloc[i] * (-al[i]);

      break;
    }

    aloc[idx] = cnt--;
    al[idx] = -al[idx];
    //cout << (char)(idx +'A') << " : " << aloc[idx] <<".\n";
  }

  cout<< ans;
}

// ACDEB
//   GCF
// 98754
// 00683

// 98653
// 00784