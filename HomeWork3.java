public class HomeWork3 {
    public static void main(String[] args) {
        printColor();
	}
	public static void printColor(){
		int value = -1;
		if (value <= 0) {
            System.out.println("Krasnyy");
    }
        if (value > 0 && value <= 100) {
            System.out.println("Zheltyy");
	}
        if (value > 100) {
            System.out.println("Zelenyy");
		}		
}
}