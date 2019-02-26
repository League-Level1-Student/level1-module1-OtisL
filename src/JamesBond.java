
public class JamesBond {
	public static void main(String[] args) {
		Vault vault = new Vault();

		int wut = findCode(vault);
		System.out.println(wut);
	}
	static int findCode(Vault v) {
		for(int i=0; i<=1000000; i++) {
			if(v.tryCode(i)) {
				return i;
			}
			
		}
		return -1;
	}
}
