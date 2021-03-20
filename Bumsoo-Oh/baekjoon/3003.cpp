#include <iostream>

using namespace std;

int main() {
    int shouldbe[] = {1, 1, 2, 2, 2, 8};
    int input;
    
    for(int i=0;i<6;i++) {
        cin>>input;
        cout<<shouldbe[i]-input<<" ";
    }
    cout<<endl;
    return 0;
}
