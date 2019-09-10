#include <stdio.h>
int main()
{
    int arr[100]; // Declares an array of size 100
    int size;          // Total number of elements in array
    int i, j, k;       // Loop control variables

    /* Input size of the array */
    scanf("%d", &size);

    for(i=0; i<size; i++)
    {
        scanf("%d", &arr[i]);
    }


    /*
     * Find duplicate elements in array
     */
    for(i=0; i<size; i++)
    {
        for(j=i+1; j<size; j++)
        {
            /* If any duplicate found */
            if(arr[i] == arr[j])
            {
                /* Delete the current duplicate element */
                for(k=j; k<size; k++)
                {
                    arr[k] = arr[k + 1];
                }

                /* Decrement size after removing duplicate element */
                size--;

                /* If shifting of elements occur then don't increment j */
                j--;
            }
        }
    }

    for(i=0; i<size; i++)
    {
        printf("%d ", arr[i]);
    }

    return 0;
}