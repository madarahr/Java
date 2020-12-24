

public class getValuePi {
	
	public static void main(String[] args) {
		
		//create a class instance
		getValuePi d = new getValuePi();
		
		//call the method
		double num = d.getPi();
		System.out.println(num);
		
	}
	
	//create the method
	public double getPi() {
		return Math.PI;
	}

}
