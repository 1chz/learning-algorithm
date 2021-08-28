#include <iostream>
#include <algorithm>

using namespace std;
int main()
{
  ios::sync_with_stdio(false);
  cin.tie(NULL);
  cout.tie(NULL);

  string  str;
  cin >> str;
  char st = str[0];
  int cnt[2] = {0, };
  cnt[st-'0']++;
  for (int i=1; i<str.size(); i++){
    if (str[i] != st){
      cnt[str[i]-'0']++;
      st= str[i];
    }
  }
  cout << min(cnt[0], cnt[1]);
}
