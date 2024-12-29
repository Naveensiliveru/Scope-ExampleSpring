package in.naveenit.bean;

public class PetrolEngine implements  IEngine {
	
	 public PetrolEngine() {
	System.out.println("petrolEngine Constructor is Excuted");
	}

	@Override
	public int Start() {
		System.out.println("  petrol Engine Journey is Started");
		return 1;
	}

}
