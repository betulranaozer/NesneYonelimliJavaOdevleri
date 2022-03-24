package SilahSarjorAtesetme;

public class Sarjor {
	
	int mermiKapasite;
	int mevcutMermi; 
	
	public Sarjor (int mermiKapasite, int mevcutMermi) {
		this.mermiKapasite = mermiKapasite;
		this.mevcutMermi = mevcutMermi;
	}
	
	public void atesEt() {
		if(mevcutMermi<=0) {
			System.out.println("Mermi yok. Mermi doldurunuz.");
		}
		else {
			mevcutMermi--;
			System.out.println("Merminiz bir azaldý. Mevcut mermi : " + mevcutMermi);
		}
	}
	
	public void doldurma() {
		mevcutMermi=mermiKapasite;
		System.out.println("Sarjor dolduruldu. Mevcut mermi : " + mevcutMermi);
	}
}
