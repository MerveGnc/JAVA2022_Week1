package sesliMiSessizMİ;

public class Main {

	public static void main(String[] args) {
		char harf='I';
		boolean isVowel=false;
		
		if(harf=='A'||harf=='E'||harf=='O'||harf=='Ö'||harf=='U'||harf=='Ü'||harf=='I'||harf=='İ') {
			isVowel=true;
		}
		
		if(isVowel) {
			System.out.println("Sesli Harftir!");
		}else {
			System.out.println("Sessiz Harftir!");
		}
		

	}

}
