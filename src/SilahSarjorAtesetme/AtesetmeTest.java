package SilahSarjorAtesetme;

public class AtesetmeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Sarjor Takili Olamayan Silah");
		Silah atis = new Silah(300);
		atis.Ates(75);
		
		System.out.println("");
		
		System.out.println("Sarjor Takili Silah");
		Silah atis2 = new Silah(100); //Menzili belirler
		atis2.sarjor = new Sarjor(35,3); //maxMermi say�s�n� ve mevcutMermi say�s�n� belirler
		
		atis2.Ates(85);
		atis2.Ates(110);
		atis2.Ates(20);
		atis2.Ates(24);
		atis2.Ates(36);
	}

}
