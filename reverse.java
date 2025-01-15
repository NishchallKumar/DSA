class reverse{
    public static void reverseArr(int [] arr, int ft, int lt){
        while(ft<lt){
            int temp = arr[ft];
            arr[ft] = arr[lt];
            arr[lt] = temp;
            ft++;
            lt--;
        }
    }
    public static void main(String[] args){
        int arr[] = {10,20,30,40,50,60,70};
        reverseArr(arr,2,5);
        reverseArr(arr,3,6);
        for(int i : arr){
            System.out.println(i);
        }
    }
}