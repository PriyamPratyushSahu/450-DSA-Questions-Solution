/*Find the maximum and the minimum element in are array*/

#include<stdio.h>

int main()
{
    int n,i,max,min;
    printf("Enter the size of the array: ");
    scanf("%d",&n);

    int arr[n];
    printf("\nEnter %d elements in the array:\n",n);
    for(i= 0; i< n; i++)
        scanf("%d",&arr[i]);
    max = min = arr[0];

    for(i= 1; i< n;i++)
    {
        if(max < arr[i])
            max = arr[i];
        if(min > arr[i])
            min = arr[i];
    }

    printf("\nThe maximum element in are array is %d",max);
    printf("\nThe minimum element in are array is %d",min);    
}