import java.util.Arrays;

class ArrayManipulation {
    public static void main(String[] args) {

        //Declaration & Initialization
        int[] arr = {5, 2, 9, 1, 7};
        System.out.println("Original Array: " + Arrays.toString(arr));

        //Length of array
        System.out.println("Length: " + arr.length);

        //Access elements
        System.out.println("First element: " + arr[0]);
        System.out.println("Last element: " + arr[arr.length - 1]);

        //Traverse array (for loop)
        System.out.print("Traverse: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //Sum of elements
        int sum = 0;
        for (int x : arr) {
            sum += x;
        }
        System.out.println("Sum: " + sum);

        //Find maximum & minimum
        int max = arr[0];
        int min = arr[0];
        for (int x : arr) {
            if (x > max) max = x;
            if (x < min) min = x;
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

        //Reverse array (two pointers)
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.println("Reversed Array: " + Arrays.toString(arr));

        //Sort array
        Arrays.sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));

        //Linear Search
        int target = 7;
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Found " + target + " at index " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println(target + " not found");
        }

        //Copy array
        int[] copyArr = Arrays.copyOf(arr, arr.length);
        System.out.println("Copied Array: " + Arrays.toString(copyArr));

        //Update element
        arr[0] = 100;
        System.out.println("After Update: " + Arrays.toString(arr));

        //Check even / odd
        System.out.print("Even numbers: ");
        for (int x : arr) {
            if (x % 2 == 0) {
                System.out.print(x + " ");
            }
        }
        System.out.println();
    }
}
