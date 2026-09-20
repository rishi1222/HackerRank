package Algorithm.SearchAlgorithms;
/*
* Linear Search is used rarely as Binary search and Hash Table provide significantly faster searching comparisons
*
The time complexity of above algorithm is O(n).
* */

public class LinearSearch {
    // This function returns index of element x in arr[]
    static int search(int arr[], int n, int x)
    {
        for (int i = 0; i < n; i++)
        {
            // Return the index of the element if the element
            // is found
            if (arr[i] == x)
                return i;
        }

        // return -1 if the element is not found
        return -1;
    }

    static void main(String[] args){
        int arr[] = {6,5,3,6,51,7,9,0};
        LinearSearch linearSearch = new LinearSearch();
        int n = arr.length;
        int x = 51;
        int success = linearSearch.search(arr,n,x);
    }
}
