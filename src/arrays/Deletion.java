package arrays;

public class Deletion {
    public static void main(String[] args) {
        int[] arr = new int[100];
        arr[0] = 2;
        arr[1] = 4;
        arr[2] = 6;
        arr[3] = 8;
        arr[4] = 10;
        int n = 5;
        int positionToDelete = 2;
        deleteElementAtfirstIndex(arr, n);
        deleteElementAtStartOfArray(arr, n);
    }
    public static void deleteElementAtfirstIndex(int[] arr, int n) {

        for (int i = 0; i < n-1; i++) {
            System.out.println("i: "   + arr[i]);
            arr[i] = arr[i + 1];
        }
      n--;
        System.out.println("After Deletion");

    }
    public static int[] deleteElementAtStartOfArray (int[] arr, int indexToRemove) {
        if (indexToRemove < 0 || indexToRemove >= arr.length) {
            System.out.println("Invalid index. Returning original array.");
            return arr; // Or throw an exception
        }

        int[] newArray = new int[arr.length - 1];
        int newArrayIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i != indexToRemove) {
                newArray[newArrayIndex] = arr[i];
                newArrayIndex++;
            }
        }
        return newArray;
    }

    //there is bug in this code and it is not working as expected
    public  static int removeElement(int[] arr, int val){
        int valMatch = 0, pointer = 0;

        while(pointer < arr.length){
         if(val == arr[pointer]){
             pointer++;
         }else {
             arr[valMatch] = arr[pointer];
                valMatch++;
                pointer++;

         }
        }
        return valMatch;
    }

    public static int removeElement1(int[] arr, int val)   {
        int i = 0;
        for (int k = 0; k < arr.length; k++) {
            if (arr[k] != val) {
                arr[i] = arr[k];
                i++;
            }
        }
            return i;
    }
}
