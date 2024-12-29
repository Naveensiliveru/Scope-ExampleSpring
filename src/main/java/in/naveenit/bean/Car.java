package in.naveenit.bean;

public class Car {
	
	
	 public Car( ) {
	System.out.println(" Car class constructor is excuted");
	}
	 private IEngine eng;
	 
	 public Car(IEngine eng) {
		super();
		this.eng = eng;
	}


	public void drive() {
	    int   status= eng.Start();
	     if(status>=1) {
	    	 System.out.println("journey is Started");
	    	 
	     }else {
	    	  System.out.println(" engine is trouble");
	     }
		 
	 }
	
}
