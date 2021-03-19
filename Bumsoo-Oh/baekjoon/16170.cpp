#include <iostream>
#include <ctime>

using namespace std;

int main() {
    time_t now = time(0);
    
    tm* utctime = gmtime(&now);
    char buf[100];
    strftime(buf, 100, "%Y", utctime);
    cout<<buf<<endl;
    strftime(buf, 100, "%m", utctime);
    cout<<buf<<endl;
    strftime(buf, 100, "%d", utctime);
    cout<<buf<<endl;
    return 0;
}
