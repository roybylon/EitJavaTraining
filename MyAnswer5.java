public class MyAnswer5
{
public static void main(String[] args) 
    {
        System.out.println("repl(\"smart-tech\", 0): " + repl(" smart-tech", 0));
        System.out.println("repl(\"smart-tech\", 3): " + repl(" smart-tech", 3));
        System.out.println("repl(\"smart-tech\", 5): " + repl(" smart-tech", 5));
    }

    public static String repl(String str, int times)
    {
        String result = "";
        for (int i = 0; i < times; i++)
        {
            result += str;
        }
        return result;
    }
}