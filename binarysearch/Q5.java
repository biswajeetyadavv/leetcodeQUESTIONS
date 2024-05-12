package binarysearch;

public class Q5 {
    public static void main(String args[]){


    }


    public static class Q1 {
        public static void main(String args[]){

            int[] array = {1,2,3,0,4};
            int sum =0 ;
            for(int i = 0;i < array.length-1;i++){
                int count = 0;
                if (array[i + 1] > array[i]) {
                    continue;

                }
                else{
                    sum = count + i;
                }


            }
            System.out.println(sum+1);



        }
    }
}