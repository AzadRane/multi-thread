import java.io.*;
import java.lang.*;
public class multiThread1 
{
    public static void main(String[] args) throws Exception
    {
        Runnable a1 = new alpharev();
        Thread t1 = new Thread(a1);
        Runnable p = new prime();
        Thread t2 = new Thread(p);
        Runnable a2 = new alpha();
        Thread t3 = new Thread(a2);
        System.out.println("\n\nLast 15 alphabets in reverse order:");
        t1.start();
        t1.sleep(10000);
        System.out.println("\n\nFirst 10 prime numbers:");
        t2.start();
        t2.sleep(10000);
        System.out.println("First 15 alphabets:");
        t3.start();
      
      
    }
}

class alpharev implements Runnable
{
    public void run()
    {
		for(char i='Z';i>='L';i--)
        {
            System.out.print(" "+i);
        }
    }
}

class prime implements Runnable
{
    public void run()
    {
		int count,i=1,c;
		for(count = 2; count <= 10; i++)
		    {
		        for(c = 2; c < i; c++)
		        {
		            if(i%c == 0)
		                break;
		        }

		        if(c == i)
		        {
		            System.out.println(i);
		            count++;
		        }

    }
    }
}
class alpha implements Runnable
{
    public void run()
    {
		for(char i='A';i<='O';i++)
		{
		            System.out.print(" "+i);
        }
    }
}
