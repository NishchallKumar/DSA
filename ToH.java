public class ToH{
    public static void towerOfHanoi(int n, String src, String dest, String helper){
        if(n==1){
            return;
        }
        towerOfHanoi(n-1, src, helper, dest);
        System.out.println("Transfer Disk "+n+" from "+src+" to "+dest);
        towerOfHanoi(n-1, helper, dest, src);
    }
    public static void main(String[] args){
        int n = 3;
        towerOfHanoi(n, "S", "D", "H");
    }
}