#include <iostream>

using namespace std;

int main() {
    int ans = 0;
    int num;
    for(int i=0;i<5;i++) {
        cin>>num;
        ans+=(num*num);
    }
    cout<<ans%10<<endl;
    return 0;
}
