public class SwapToNumbers {
    static void swap(int a, int b) {
        int temp = a;
        a=b;
        b = temp;
        System.out.println("Inside Swap: a=" + a + " ,b" + b);
    }
    public static void main(String[] args) {
        int x = 20;
        int y = 30;
        swap(x, y);
    }
}
