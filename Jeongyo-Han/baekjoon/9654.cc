#include <iostream>

using namespace std;
int main()
{
  ios::sync_with_stdio(false);
  cin.tie(NULL);
  cout.tie(NULL);

  string s;
  s = "SHIP NAME      CLASS          DEPLOYMENT IN SERVICE\n";
  s+= "N2 Bomber      Heavy Fighter  Limited    21        \n";       
  s+= "J-Type 327     Light Combat   Unlimited  1         \n";         
  s+= "NX Cruiser     Medium Fighter Limited    18        \n";        
  s+= "N1 Starfighter Medium Fighter Unlimited  25        \n";       
  s+= "Royal Cruiser  Light Combat   Limited    4         ";  
  cout << s;

}
