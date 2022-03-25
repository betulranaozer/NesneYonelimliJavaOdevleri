package SilahSarjorAtesetme;

public class Silah {
	
	int maxMenzil;
	Sarjor sarjor;
	
	public Silah(int maxMenzil) {
		this.maxMenzil=maxMenzil;
	}
	
	public void Ates(int menzil) {
		if(sarjor == null) {
			System.out.println("Sarjorunuz yok.");
		}
		else if(menzil>maxMenzil) {
			System.out.println("Menzilden uzaða ateþ ettiniz. Hedefi ýskaladýnýz");
			sarjor.atesEt();
		}

		else {
			if(sarjor.mevcutMermi>0) {
				System.out.println("Atis basarili. Hedefi Vurdunuz");
				sarjor.atesEt();
			}
			else {
				System.out.println("Merminiz yok ates edilemez, sarjoru doldurunuz");
				sarjor.doldurma();
			}
		}
	}
}
