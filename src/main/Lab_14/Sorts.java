package main.Lab_14;

public class Sorts {

    public static int[] merge(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        int aIndex = 0;
        int bIndex = 0;
        int i = 0;

        while (i < result.length) {
            result[i] = a[aIndex] < b[bIndex] ? a[aIndex++] : b[bIndex++];
            if (aIndex == a.length) {
                System.arraycopy(b, bIndex, result, ++i, b.length - bIndex);
                break;
            }
            if (bIndex == b.length) {
                System.arraycopy(a, aIndex, result, ++i, a.length - aIndex);
                break;
            }
            i++;
        }
        return result;
    }

    public int [] sortArray(int[] arrayA){
        if (arrayA == null) {
            return null;
        }

        if (arrayA.length < 2) {
            return arrayA;
        }

        int [] arrayB = new int[arrayA.length / 2];
        System.arraycopy(arrayA, 0, arrayB, 0, arrayA.length / 2);


        int [] arrayC = new int[arrayA.length - arrayA.length / 2];
        System.arraycopy(arrayA, arrayA.length / 2, arrayC, 0, arrayA.length - arrayA.length / 2);


        arrayB = sortArray(arrayB);
        arrayC = sortArray(arrayC);

        return merge(arrayB, arrayC);
    }

    public void quickSort(int[] array, int low, int high) {
        if (array.length == 0)
            return;

        if (low >= high)
            return;


        int middle = low + (high - low) / 2;
        int opora = array[middle];


        int i = low, j = high;
        while (i <= j) {
            while (array[i] < opora) {
                i++;
            }

            while (array[j] > opora) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }


        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);
    }

    public int binarySearch(int arr[], int elementToSearch) {

        int firstIndex = 0;
        int lastIndex = arr.length - 1;


        while(firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            if (arr[middleIndex] == elementToSearch) {
                return middleIndex;
            }

            else if (arr[middleIndex] < elementToSearch)
                firstIndex = middleIndex + 1;
                lastIndex = middleIndex - 1;

        }
        return -1;
    }

    public int recursiveBinarySearch(int arr[], int firstElement, int lastElement, int elementToSearch) {


        if (lastElement >= firstElement) {
            int mid = firstElement + (lastElement - firstElement) / 2;
            if (arr[mid] == elementToSearch)
                return mid;

            if (arr[mid] > elementToSearch)
                return recursiveBinarySearch(arr, firstElement, mid - 1, elementToSearch);

            return recursiveBinarySearch(arr, mid + 1, lastElement, elementToSearch);
        }

        return -1;
    }

    public int linearSearch(int arr[], int elementToSearch) {

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == elementToSearch)
                return index;
        }
        return -1;
    }

    public int recursiveLinearSearch(int arr[], int elementToSearch, int ind) {
        if(arr.length >= ind){
            return -1;
        }
        if (arr[ind] == elementToSearch) {
            return ind;
        }
        else{
            return recursiveLinearSearch(arr,elementToSearch,ind++);
        }
    }
}