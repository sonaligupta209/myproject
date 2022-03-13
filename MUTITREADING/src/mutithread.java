
public class mutithread extends Thread 
{
	
public void run() 
{
	int i=0;
	while(i<=5000) 
	{
		System.out.println("thread is running");
		i++;
	}
	if(i==5000)
	{
		i=0;
    
    }
}


public static void main (String[] args) {
	mutithread d=new mutithread();
	Thread t1=new Thread(d);
	Thread t2=new Thread(d);
	
	t1.start();
	t2.start();
	
}
}