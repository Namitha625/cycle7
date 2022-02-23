import java.util.Random;

class randomnumber extends Thread
{
    public void run()
    {
    Random obj= new Random();
    for(int i=0;i<10;i++)
    {
        int rando=obj.nextInt(100);
        System.out.println("Random integer is:"+rando);
        if(rando%2==0)
        {
            squareofnumber obj2=new squareofnumber(rando);
            obj2.start();
        }
        else 
        {
            cubeofnumber obj3= new cubeofnumber(rando);
            obj3.start();
        }
    }
    }
}
class squareofnumber extends Thread
{
    int square;
    squareofnumber(int a)
    {
        square=a*a;
        System.out.println("The square is: "+square);
    }
}
class cubeofnumber extends Thread 
{
    int cube;
    cubeofnumber(int a)
    {
        cube=a*a*a;
        System.out.println("The cube is: "+cube);
    }
}
public class h
{
    public static void main(String args[])
    {
        randomnumber obj4= new randomnumber();
        obj4.start();
    }
}