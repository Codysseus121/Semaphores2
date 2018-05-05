
public class SemaTest {

	public static void main(String[] args) throws InterruptedException
	{
		 
		final int counter=10000;
		    String X = "X";
		    String Y = "Y";
		    BinarySemaphore mutex = new BinarySemaphore(1);		       
		    Runnable Rx = new PrinterX(counter, mutex, X);
		    Runnable Ry = new PrinterX(counter, mutex, Y);  
		    
		    Thread Tx = new Thread(Rx);
		    Thread Ty = new Thread(Ry);
		    
		    Tx.start();
		    Ty.start();
		    Ty.join();
		     for (int i=0;i<counter;i++)
		     System.out.println("Main prints Z " + i);
		    
		     

	}

}
