
public class Rule30Tester {

	public static final int number = 10000;

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		Rule30 rule = new Rule30(number);

		System.out.println("RESULTS");
		System.out.println("lines: " + number);
        System.out.println("time consumed in ms: " + (System.currentTimeMillis() - startTime));
	
	}
}