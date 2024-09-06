public class Q1WeirdFunction 
{
    public static int fRecursive(int n) 
    {
        if (n <= 1) {
            return 1;
        }
        return fRecursive(n - 1) + fRecursive(n - 2);
    }

    public static int fIterative(int n) {
        int a = 1;
        int b = 1;
        for (int i = 2; i <= n; i++) 
        {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }
}
