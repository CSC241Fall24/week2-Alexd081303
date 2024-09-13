public class Q4ReverseString 
{
    public static String reverse(String s) 
    {
        if (s.length() <= 1)
        {
            return s;
        }
        
        return reverse(s.substring(1)) + s.charAt(0);
    }

    public static void main(String[] args) 
    {
        String test = "test string";
        System.out.println("Original: " + test);
        System.out.println("Reversed: " + reverse(test));
    }
}
