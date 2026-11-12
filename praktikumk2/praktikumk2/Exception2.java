package praktikumk2;
public class Exception2 {
	public static void main(String[] args) {
		int x=2;
		int y=x-2;
		try {
			int z=x/y;
			System.out.println("Nilai Z = "+z);
		} catch (ArithmeticException e) {
			System.out.println("Terdapat Kesalahan : ");
			System.out.println(e.getMessage());
		}
	}
}