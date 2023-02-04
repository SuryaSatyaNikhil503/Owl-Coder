public class PrintingMsg
{
    static void print(int n)
    {
        if(n==5)
        {
            return;
        }
        System.out.println("Hello");
        print(n+1);
    }
    public static void main(String[] args)
    {
        print(1);
    }
}
