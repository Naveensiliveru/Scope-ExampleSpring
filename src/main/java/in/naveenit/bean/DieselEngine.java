package in.naveenit.bean;

public class DieselEngine  implements IEngine{
	
	public DieselEngine() {
	System.out.println("Diesel Engine   constructor is Started");
	}

	@Override
	public int Start() {
		System.out.println("    Diesel Engine Journey  is started");
	
		return 1;
	}
	 

}
