#include<stdio.h>
int main()
{
  //Type your code here
  int a;
  scanf("%d",&a);
  int c = a%10;
  int b = a/10;
  
  printf("%d",c+b);
  return 0;
}