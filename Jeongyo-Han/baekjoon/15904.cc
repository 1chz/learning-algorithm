#include <iostream>
#include <string>

using namespace std;
int main()
{
  ios::sync_with_stdio(false);
  cin.tie(NULL);
  cout.tie(NULL);

  string str;
  getline(cin, str);

  bool ans = false;
  int j = 0;

  for (int i=0; i<str.size(); i++)
  {
	if (j==0)
	{
	  if (str[i] == 'U') j++;
	}
	else if ( j==1)
	{
	  if (str[i] == 'C') j++;
	}
	else if ( j==2)
	{
	  if (str[i] == 'P') j++;
	}
	else if (j==3)
	{
	  if (str[i] == 'C') j++;
	}
	if (j==4) 
	  ans = true;
  }
 
  if (ans)
	cout << "I love UCPC";
  else
	cout << "I hate UCPC";
}
