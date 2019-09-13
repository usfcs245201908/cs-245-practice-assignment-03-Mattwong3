public class LinearSearch implements Practice03Search {

        public LinearSearch(){


        }


    public String searchName(){
        return "Linear Search ";
    }

    public int search(int [] arr, int target){
            int size = arr.length;
            int correct = 0;
            for(int i = 0;i<size;i++){
                if(arr[i]==target){
                    correct = i;
                }
            }
        return correct;
    }
}
