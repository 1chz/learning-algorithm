#include <iostream>

using namespace std;

int toDecimal(char hex) {
    if(hex >= '0' && hex <= '9') return hex-'0';
    else if(hex == 'A') return 10;
    else if(hex == 'B') return 11;
    else if(hex == 'C') return 12;
    else if(hex == 'D') return 13;
    else if(hex == 'E') return 14;
    else if(hex == 'F') return 15;
}

int pow(int base, int exp) {
    int res = 1;
    for(int i=0;i<exp;i++) res *= base;
    return res;
}

int main() {
    string hex;
    int hexSize;
    int decimal = 0;
    
    cin>>hex;
    hexSize = hex.length();
    
    for(int i=0;i<hexSize;i++) {
        decimal += (pow(16, hexSize-i-1)*toDecimal(hex[i]));    
    }
    
    cout<<decimal<<endl;
    
    return 0;
}
