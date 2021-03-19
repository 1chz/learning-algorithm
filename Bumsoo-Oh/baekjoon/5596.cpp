#include <iostream>

using namespace std;

int main() {
    int sum, num, mmax = -1;
    
    for(int i=0;i<2;i++) {
        sum = 0;
        for(int j=0;j<4;j++) {
            cin>>num;
            sum += num;
        }
        mmax = max(mmax, sum);
    }
    
    cout<<mmax<<endl;
    return 0;
}