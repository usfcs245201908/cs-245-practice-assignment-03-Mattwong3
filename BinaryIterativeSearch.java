public class BinaryIterativeSearch implements Practice03Search {

        public BinaryIterativeSearch(){


        }



    public String searchName(){
        return "Binary Iterative";
    }

    public int search(int [] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            }

            if (target > arr[mid]) {
                start = mid + 1;
            }

            if (target == arr[mid]) {
                return mid;
            }
        }
        return -1;

    }
}


