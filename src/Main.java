public class Main {
    public static void main(String[] args) {
        //test case 1
        int [] arr1 = {1, 2, 3, 4, 5};
        int n1 = 5; // size of the array
        int k1 = 2; //number of iterations
        rotateArray(n1, k1, arr1);  //calling rotateArray method
        printArray("Test Case 1: ", arr1);  //calling printArray method


        int [] arr2 = {4, 5, 6, 7, 8};
        int n2 = 5;
        int k2 = 4;
        rotateArray(n2, k2, arr2);
        printArray("Test Case 2: ", arr2);

    }

    public static void rotateArray(int n, int k, int [] arr) {
        //the outer loop runs k times, representing the number of rotations
        for (int i = 0; i < k; i++) {
            //extracts the rightmost element of the array and stores it in the variable rightmost
            int rightmost = arr[n - 1];
            //inner loop iterates from the last index (n - 1) to the second index (1)
            for (int j = n -1; j > 0; j--) {
                //shifts each element to the right
                arr[j] = arr[j - 1];
            }
            //after shifting the elements to the right, the rightmost element
            //(stored in rightmost) is inserted at the beginning of the array
            arr[0] = rightmost;
        }
    }

    public static void printArray(String testCase, int [] arr) {
        System.out.print(testCase + "Output: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

    }


}