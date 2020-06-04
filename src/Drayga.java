

public class Drayga extends  Beyblade{
  
    private String kutsalCanavar;
    public Drayga(String beybladeci, int donusHizi, int saldiriGucu,String kutsalCanavar) {
        super(beybladeci, donusHizi, saldiriGucu);
        this.kutsalCanavar= kutsalCanavar;
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster(); //To change body of generated methods, choose Tools | Templates.
         System.out.println(" Kutsal canavar :" + kutsalCanavar);
    }

    @Override
    public void kutsalCanavarCikar() {
      System.out.println(getBeybladeci()+" "+ kutsalCanavar+ " Kutsal Canavarı ortaya çıkarıyor"); 
    }
  
    
}
