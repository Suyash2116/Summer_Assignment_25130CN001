#include<stdio.h>
int main()
{
    int x,n;
    int result=1;
    printf("Enter Base : ");
    scanf("%d",&x);
    printf("Enter Power : ");
    scanf("%d",&n);
    for(int i=1;i<=n;i++)
    {
        result=result*x;
    }
    printf("Answer = %d",result);
    return 0;
}