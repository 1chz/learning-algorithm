#include <stdio.h>

int main(){
  int a, b, v, now=0;
  scanf("%d %d %d", &a, &b, &v);
  v-=a;
  int day = v/(a-b)+(v%(a-b)?1:0);

  printf("%d\n", day+1);
}

