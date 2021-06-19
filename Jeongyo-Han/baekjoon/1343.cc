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

  string str;
  cin >> str;

  bool res = true;
  for (unsigned int i=0; i<str.size(); i++)
  {
    if (str[i] =='.') continue;
    if (i+3 < str.size() &&
        str[i+1]=='X' && 
        str[i+2]=='X' && 
        str[i+3]=='X')
    {
      str[i]=str[i+1]=str[i+2]=str[i+3]='A';
      i+=3;
    } 
    else if (i+1< str.size() &&
            str[i+1]=='X')
    {
      str[i]=str[i+1]='B';
      i+=1;
    }
    else res = false;
  }
  if (res) cout << str;
  else cout << "-1";
}
