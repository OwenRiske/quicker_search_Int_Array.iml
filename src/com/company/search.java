package com.company;

public class search {
    public static int LinearSearch(int[] array, int num){
        for (int i = 0; i < array.length; i++) {
            if(array[i]==num){
                return i;
            }
        }

        return -1;
    }


    public static int binarySearch(int[] array, int num){
        array=sort(array);
        int low=0;
        int high=array.length-1;
        int middle=0;
        if(num==array[high]){
            return high;
        }
        if(num==array[low]){
            return low;
        }
        while(high>low){
            middle=(low+high)/2;
            if(array[middle]==num){
                return middle;
            }
            else if(num>array[middle]){
                low=middle+1;
            }
            else{
                high=middle-1;
            }
        }
        return -1;
    }




    public static int[] sort(int[] array){
        //for each element in the list
        for (int i = 0; i < array.length; i++) {
            //for each element that is equal to or less then i
            for (int j = i; j > 0 ; j--) {
                //check to see if the element and the one before it are in order
                if (array[j]<array[j-1]){
                    array=swap(array,j,j-1);
                }

            }

        }
        return array;
    }

    public static int[] swap(int[] array, int index1, int index2) {
        //preset variable
        int tempNum=array[index1];

        //set inputed variables as each other
        array[index1]=array[index2];
        array[index2]=tempNum;


        return array;
    }
}
