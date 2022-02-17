package fundamentos;

public class ConvTipoPrimiNum {
	public static void main(String[] args) {
		
		double a = 1; // implicita
		System.out.println(a);
		
		float b = (float) 1.1234567888888; // explicita
		System.out.println(b);
		
		int c = 280;
		byte d = (byte) c; // explicita
		
		System.out.println(d);
		
		double e = 1;
		int f = (int) e;
		
		System.out.println(f);
	}

}
