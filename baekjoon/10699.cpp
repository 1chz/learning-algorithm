#include <iostream>
#include <ctime>

using namespace std;

int main() {
    time_t now = time(0);
    tm* tm_now = localtime(&now);
    char buf[100];
    strftime(buf, 100, "%Y-%m-%d", tm_now);
    cout<<buf<<endl;
    return 0;
}
