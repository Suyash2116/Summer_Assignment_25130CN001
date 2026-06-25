public class CommonCharacters 
{
    public static void main(String[] args) 
    {
        String s1 = "hello";
        String s2 = "world";
        System.out.print("Common Characters: ");
        for (int i = 0; i < s1.length(); i++) 
        {
            char ch = s1.charAt(i);
            if (s2.indexOf(ch) != -1) 
            {
                System.out.print(ch + " ");
            }
        }
    }
}