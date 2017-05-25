public class Part3 {
	public static void main(String[] args) {
		String fileName = "dict.txt";
        In in = new In(fileName);
        String[] dictArray = in.readAllLines(); // all dictionary words are now contained in dictArray
	}
}