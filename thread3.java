class odd extends Thread 
{
    public void run()
    {
        System.out.println("Even numbers are: ");
        for(int i=0;i<=100;i++)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
        }
    }
}
class even extends Thread
{
    public void run()
    {
        System.out.println("Odd numbers are: ");
        for(int i=0;i<100;i++)
        {
            if(i%2!=0)
            {
                System.out.println(i);
            }
        }
    }
}
public class three
{
    public static void main(String args[])
    {
        odd obj1= new odd();
        obj1.start();
        even obj2= new even();
        obj2.start();
    }
}