package learning.src;

import java.util.Arrays;

public class Shapes {
    public int computeSquareArea(int lenght){
        int area = lenght * lenght;
        return area;
    }
     public double computeCircleArea(double radius){
        double area = 3.14 * radius * radius;
        return area;
    }
    public int[] sortArray(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }
     public int[] sortingArray(int[] arr) {
        for(int i=0;i<1000000;i++){
        Arrays.sort(arr);
        }
        return arr;
    }
    
}
