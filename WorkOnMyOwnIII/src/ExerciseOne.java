
public class ExerciseOne {
	public static void main(String[] args) {
		
	//create a class instance
	ExerciseOne s = new ExerciseOne();
		
	//call your method here
	int a = 1;
	int b = 2;
	int c = 3;
	int d = 4;
	
	System.out.println(s.square(a, b, c, d));

	}
	
	//create your first method here
	public double[] square(int a, int b, int c, int d) {
		
		double[] result = {a*a, b*b, c*c, d*d};
		
		return result;
	}

}
