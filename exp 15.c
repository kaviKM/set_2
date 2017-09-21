#include<stdio.h>
int main()
{
int num,m=30,n=50;
clrscr();
 printf("Print Even Numbers between the two intervals m to n:\n");

    for (num = m; num <= n; num++)
    {
    if (num % 2 == 1)
{
    printf ("%d ", num);
    }
}
return 0;
}
