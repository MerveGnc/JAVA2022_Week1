package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		int number = 1;
		// System.out.println(remainder);
		boolean isPrime = true;
		if(number<1) {
			System.out.println("Geçersiz Sayı");
		}
		if(number==1) {
			System.out.println("Sayı Asal Değildir");
			return;
		}

		for (int i = 2; i < number; i++) {
			int remainder = number % i;
			if (remainder == 0) {
				isPrime = false;
			}
		}
		if (isPrime) {
			System.out.println("Sayı Asaldır!");
		} else {
			System.out.println("Sayı Asal Değildir!");
		}

	}

}
