#include <iostream>

using namespace std;

int main() {
    int l, p, actual, guess;
    cin>>l>>p;
    actual = l*p;
    for(int i=0;i<5;i++) {
        cin>>guess;
        cout<<guess-actual<<" ";
    }
    cout<<endl;
    return 0;
}
