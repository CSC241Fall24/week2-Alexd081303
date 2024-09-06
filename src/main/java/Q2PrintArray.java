public class Q2PrintArray 
{
    private static final int[] ARRAY = {1, 2, 3, 4, 5, 6, 7};

    public static void main(String[] args) {
        printRecursion(0);
    }

    private static void printRecursion(int i) 
    {
        if (i >= ARRAY.length) {
            return;
        }
        System.out.println(ARRAY[i]);
        printRecursion(i + 1);
    }
}
