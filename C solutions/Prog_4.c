/*Given an array which consists of only 0, 1 and 2. Sort the array without using any sorting algo*/

#include<stdio.h>

int main()
{
    int n,i,p0,p1,p2;
    printf("Enter the size of the array: ");
    scanf("%d",&n);

    int arr[n];
    printf("\nEnter %d elements in the array only 0,1,2:\n",n);
    for(i= 0; i< n; i++)
    {
        do
        {
            scanf("%d",&arr[i]);
            if(arr[i] == 0 || arr[i]== 1 || arr[i]== 2)
                break;
            else 
            prinf("Enter only 0,1 or 2\n");
        } while (1);
        
        
        
    }
    
    
}