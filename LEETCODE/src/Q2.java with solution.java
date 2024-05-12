Q2 https://leetcode.com/problems/sort-colors/
    Intuition
Step1. Understood the question. check the sample input and output given. and they have asked us to arrange the colours in nothing but assending order. 
    So, we will use sorting method to solve it.

Approach
Step2. choose a sorting method which you feel this would be the less time cosuming means good with time complexity. So, I have choosed Bubble sort.


public class Q2 {
    public static void main(String[] args){
        
            
        }
    public void sortColors(int[] arr) {
        int n = arr.length;
        for(int i = 0;i<n-1;i++){
            for(int j = i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    int temp= arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }

    }
