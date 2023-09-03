public class PascalsTriangle {

    public static int nCr(int r, int c){
        int res=1;
        for(int i=0;i<c-1;i++)
        {
            res = res * ((r-1) - i);
            res /= i+1;
        }
        return res;
    }
    public static void main(String[] args) {
        int r=5;
        int c=3;
        System.out.println("The answer is::"+nCr(6,4));
    }
}
