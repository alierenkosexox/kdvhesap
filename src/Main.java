import java.util.Scanner;               //scanneri cagırma
public class Main {
    public static void main(String[] args) {

        double tutar;                                            // tutari sisteme tanitma
        double kdvYuzde1000alt = 0.18 , kdvYuzde1000ust = 0.08;     // 1000tl alt ise %18 , ust ise %8 kdv
        Scanner input = new Scanner(System.in);
        System.out.print("Mal Tutarini Giriniz : ");        // urunun tutari girilmesi icin scanner tanilama
        tutar = input.nextDouble();                     // tutar inputu
        if (tutar <=1000.0) {                            // eger tutar 1000 den kucuk esit ise
            double kdvTutar = tutar * kdvYuzde1000alt;  // tutari %18 ile carp
            double toplamfiyat;                           // toplam fiyati tanimla
            toplamfiyat = kdvTutar + tutar;              // toplam fiyat = kdv tutari * tutar
            System.out.println("KDV haric fiyat :" + tutar);        // malin kdvsiz tutarini yazdir
            System.out.println("Malin KDV tutari : " + kdvTutar);   // malin kdv ana fiyat haric tutarini yazdir
            System.out.println("Toplam Fiyat : " + toplamfiyat );   // malin fiyati + kdv tutarini yazdir
        }
        else if (tutar >1000.0) {               // eger 1000 tl üst ise %8 kdv uygula
            double kdvTutar = tutar * kdvYuzde1000ust;  // tutar * %8
            double toplamfiyat = kdvTutar + tutar;      // toplam fiyat =  %8 carp tutar + tutar
            System.out.println("KDV haric fiyat :" + tutar);
            System.out.println("Malin KDV tutari : " + kdvTutar);
            System.out.println("Toplam Fiyat : " + toplamfiyat );
        }
    }
}