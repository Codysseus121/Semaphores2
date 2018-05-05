	class PrinterX implements Runnable
	{
	    private int counter = 0;
	    private BinarySemaphore mutex = new BinarySemaphore(1);
	    private String printout;

	    public PrinterX (int counter, BinarySemaphore mutex, String printout)
	    {
	        this.counter=counter;
	        this.mutex = mutex;
	        this.printout = printout;
	    }

	    public void run()
	    {
	    	int index=0;
	    	while (index<counter)
	        {
	            

	            try{

	                
	            	mutex.P();
	                System.out.println(printout + " " + index);
	                index++;
	                

	            }
	            catch (InterruptedException e)
	            {}
	            finally
	            {
	                mutex.V();
	                
	            }
	        }
	    }


}
