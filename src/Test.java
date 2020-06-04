
import java.util.Scanner;


public class Test {
    
    public static void main(String[] args) {
        System.out.println(" Hoşgeldiniz . Çıkıi için q ya basınız");
        
        Scanner scanner= new Scanner(System.in);
        
        while (true) {            
             System.out.println("Hangi Beyblade Dranza / Drayga ?");
             String islem = scanner.nextLine();
             if (islem.equals("q")) {
                 System.out.println("Çıkılıyor");
                 break; 
            }
             
             else {
                 BeybladeFabrikasi fabrika = new BeybladeFabrikasi();
                 Beyblade beyblade = fabrika.beybladeUret(islem);
                 
                 if ( beyblade== null) {
                     System.out.println("GEçerli değil");
                 } else {
                     
                     beyblade.bilgileriGoster();
                     beyblade.saldır();
                     beyblade.kutsalCanavarCikar();
                 }
             }
        }
        
    }
      
}
