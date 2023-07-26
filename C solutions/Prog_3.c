/*Find the "Kth" max and min element of an array*/

//Method 1

#include<stdio.h>

int main()
{
    int n,k,i,j;
    printf("Enter the size of the array: ");
    scanf("%d",&n);
    do
    {
        printf("\nEnter the kth value: ");
        scanf("%d",&k);
        if(k < n && k > 0)
            break;
        else
            printf("Enter a valid kth value");
    }while(1);

    int arr[n];
    printf("\nEnter %d elements in the array:\n",n);
    for(i= 0; i< n; i++)
        scanf("%d",&arr[i]);
    
    for(i= 0; i< n-1; i++)
    {
        for(j= i+1; j< n; j++)
        {
            if(arr[i] > arr[j])
            {
                arr[i] = arr[i] + arr[j];
                arr[j] = arr[i] - arr[j];
                arr[i] = arr[i] - arr[j];
            }
        }
    }

    printf("\nThe %dth max value is: %d",k,arr[n-k-1]);
    printf("\nThe %dth min value is: %d",k,arr[k-1]);
}