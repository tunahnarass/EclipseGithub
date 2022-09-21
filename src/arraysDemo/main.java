package arraysDemo;

public class main {

	public static void main(String[] args) {
		String[] esyalar = new String[4];
				esyalar[0]="->Ayakkabı";
				esyalar[1]="->Kitap";
				esyalar[2]="->Diş Fırçası";
				esyalar[3]="->Gözlük";
				System.out.println("*Gerekli eşyalar listesi");
				for(int i=0;i<esyalar.length;i++) {
					System.out.println(esyalar[i]);			
	}
				double[] fiyatlar=new double[4];
				fiyatlar[0]=699.99d;
				fiyatlar[1]=35.90d;
				fiyatlar[2]=42.99d;
				fiyatlar[3]=459.99d;
				System.out.println("*Maliyet");
				
				double total=0;
				for(int j=0;j<fiyatlar.length;j++) {
					total=total+fiyatlar[j];
					System.out.println(fiyatlar[j]);
				}
				System.out.println("Toplam ="+total+" Lira");
	 } 
}
