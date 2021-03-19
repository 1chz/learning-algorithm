#include <iostream>

using namespace std;

int main() {
    int second, sum = 0;
    for(int i=0;i<4;i++) {
        cin>>second;
        sum+=second;
    }
    cout<<sum/60<<endl;
    cout<<sum%60<<endl;
    return 0;
}
