#include <iostream>

using namespace std;


int main() {
    unsigned char cho, joong, jong;
    scanf("%c%c%c", &cho,&joong,&jong);
    int input = 0;
    input += ((int)cho & ((1<<4)-1))<<12;
    input += (((int)joong &((1<<6)-1))>>2)<<8;
    input += ((((((int)joong &((1<<6)-1)))&3)<<2)|((((int)jong&((1<<7)-1))&48))>>4)<<4;
    input += ((int)jong&((1<<4)-1));
    cout<<input-44031<<endl;
    return 0;
}
