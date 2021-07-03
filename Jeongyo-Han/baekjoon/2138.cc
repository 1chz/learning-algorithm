#include <iostream>
#include <string>
#include <algorithm>
#include <vector>

using namespace std;

int ans = 1e9;

void onOff(char &c)
{
  if ( c == '1') c = '0';
  else c= '1';
}

void go(int idx, int mx, int cnt, string& str, string& str2)
{
  if (idx == mx )
  {
    bool isSame = true;
    for (int i=0; i<mx; i++)
    {
      if (str[i] != str2[i]) 
      {
        isSame = false;
        break;
      }
    }
    if (isSame)
      ans = min(ans, cnt);
    return;
  }

  if ((idx > 0 && str[idx-1] == str2[idx-1])|| 
       idx == 0 )
    go(idx+1, mx, cnt, str, str2);

  // on off - state.
  if (idx > 0)
    onOff(str[idx-1]);
  onOff(str[idx]);
  if (idx+1 < mx)
    onOff(str[idx+1]);

  if ((idx > 0 && str[idx-1] == str2[idx-1]) ||
       idx == 0 )
    go(idx+1, mx, cnt+1, str, str2);

  // on off - state.
  if (idx > 0)
    onOff(str[idx-1]);
  onOff(str[idx]);
  if (idx+1 < mx)
    onOff(str[idx+1]);
}

int main()
{
  ios::sync_with_stdio(false);
  cin.tie(NULL);
  cout.tie(NULL);

  int n;
  cin >>n;
  string str, str2;
  cin >> str >> str2;

  go(0, str.size(), 0, str, str2);

  if (ans == 1e9) cout << -1;
  else cout << ans;
}