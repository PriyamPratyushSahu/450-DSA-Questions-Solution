/*Reverse a array*/

#include<stdio.h>

void display(int arr[], int n)
{
    printf("\n");
    for(int i= 0; i< n; i++)
        printf("%d ",arr[i]);
}

int main()
{
    int n,i;
    printf("Enter the size of the array: ");
    scanf("%d",&n);

    int arr[n];
    printf("\nEnter %d elements in the array:\n",n);
    for(i= 0; i< n; i++)
        scanf("%d",&arr[i]);
    printf("\nThe array in normal order:");
    display(arr,n);

    for(i= 0; i< n/2;i++)
    {
        arr[i] = arr[i] + arr[n-1 - i];
        arr[n-1 - i] = arr[i] - arr[n-1 - i];
        arr[i] = arr[i] - arr[n-1 - i];
    }

    printf("\nThe array in reverse order:");
    display(arr,n);
}