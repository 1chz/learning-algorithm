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

  int t;
  cin >> t;
  while(t--)
  {
    string str;
    cin >> str;

    int buff0 = 0, buff1 = 0;
    for (int i=0; i<str.size()/2; i++)
    {
      int start = i + buff0;
      int end = str.size() -1 -i;

      if (str[start] == str[end] ) continue;
      buff0++;
      if (buff0 > 1) break;
      if (str[start+buff0] == str[end]) continue;
      else { 
        buff0 = 2;
        break;
      }
    }

    for (int i=0; i<str.size()/2; i++)
    {
      int start = i;
      int end = str.size() -1 -i - buff1;

      if (str[start] == str[end] ) continue;
      buff1++;
      if (buff1 > 1) break;
      if (str[start] == str[end-buff1]) continue;
      else { 
        buff1=2;
        break;
      }
    }

    if (min(buff0,buff1) >= 2) cout << "2\n";
    else cout << min(buff0,buff1) <<"\n";
  }
}
