class reverse{

    public static void rev(int[] arr){
        int e = arr.length-1;
        int s = 0;
        while(s<e){
            int t = arr[s];
            arr[s] = arr[e];
            arr[e] = t;
            s++;
            e--;
        }
        System.out.println("This is reversed Array:");
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.err.println();
    }

    public static void max(int[] arr){
        int ans = 0;
        for(int i : arr){
            if (i>ans){
                ans = i;
            }
        }
        System.out.println(ans);
    }

    public static void min(int[] arr){
        int ans = 0;
        for(int i : arr){
            if (i<ans){
                ans = i;
            }
        }
        System.out.println(ans);
    }
    
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,0};
        System.out.println("This is original Array:");
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.err.println();
        rev(arr);
        System.out.println("This is maximum of Array:");
        max(arr);
        System.out.println("This is minimum of Array:");
        min(arr);
    }
}