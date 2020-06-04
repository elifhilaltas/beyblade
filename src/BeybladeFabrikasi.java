

public class BeybladeFabrikasi {
  
    public Beyblade beybladeUret(String beybladeTuru){
        if ("Dranza".equals(beybladeTuru)) {
            
            return  new Dranza("Kai", 400 , 600, "kırmızı anka");
            
        }
        else if ( "Drayga".equals(beybladeTuru)){
             return  new Drayga("Rei", 400 , 600, "beyaz kaplan");
            
        }
        else {
            return null;
        }
    }
}
