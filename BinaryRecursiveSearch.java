public class BinaryRecursiveSearch implements Practice03Search {

    public BinaryRecursiveSearch(){


    }

    public String searchName(){
        return "Binary Recursive";
    }



    private static int binary(int arr[],int target,int start,int end){
        if (start > end) {
            return -1;
        }

        int mid = (start + end) / 2;

        // core logic is same as iterative algorithm
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] < target) {
            return binary(arr, target, mid + 1, end);
        } else {
            // last possibility: a[mid] > x
            return binary(arr, target, start, mid - 1);
        }

    }
    public int search(int [] arr, int target ){
            int value = binary(arr,target,0,arr.length-1);
        return value;
    }
}
