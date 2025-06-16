public class BinarySearch {
    public static int binartSearch(int[] arr, int n, int left, int right) {
        // int step=0;
        // int left=0;
        // int right = arr.length-1;
        if(left<=right){
            int mid=(left+right)/2;
            // step++;
            if(arr[mid]==n){
                // System.out.println("Steps taken by binary: " + step);
                return mid;  
            }
            else if(arr[mid]<n){
                return binartSearch(arr, n, mid+1, right);
            }
            else{
                return binartSearch(arr, n, left, mid-1);
            }
        }
        // while(left<=right){
        //     step++;
        //     int mid=(left+right)/2;
        //     if(arr[mid]==n){
        //         System.out.println("Steps taken by binary: " + step);
        //         return mid;  
        //     }
        //     else if(arr[mid]<n){
        //         left=mid+1;
        //     }
        //     else
        //     {
        //         right=mid-1;
        //     }
        // }
        //  System.out.println("Steps taken by binary: " + step);
        return -1;
    }
     public static int linearSearch(int[] arr, int target) {
        int step=0;
        for (int i = 0; i < arr.length; i++) {
            step++;
            if (arr[i] == target) {
                System.out.println("Steps taken: " + step);
                return i; // Return the index of the found element
            }
        }
        System.out.println("Steps taken: " + step);
        return -1; // Return -1 if the element is not found
    }

    public static void main(String[] args){
        int[] num=new int[1000];
        int target=900;
        int result = binartSearch(num, target,0 , num.length-1);
        //int result2 = linearSearch(num, target);
         if(result != -1){
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }
    
}
