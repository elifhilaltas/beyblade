

public class Beyblade {
     private String beybladeci;
    private int donusHizi;
    private int saldiriGucu;

    public Beyblade(String beybladeci, int donusHizi, int saldiriGucu) {
        this.beybladeci = beybladeci;
        this.donusHizi = donusHizi;
        this.saldiriGucu = saldiriGucu;
    }
    
    
    public void saldır(){
        
        System.out.println(getBeybladeci()+" "+ getSaldiriGucu()+ "saldırı gücü ve "+ getDonusHizi()+"hızı ile saldırıyor ");
    }

    public void kutsalCanavarCikar(){
        System.out.println("k.c yok");
        
    }
    public void bilgileriGoster(){
        System.out.println(" isim :" +getBeybladeci() + "\n hızı :" +getDonusHizi()+ "\n gücü :" +getSaldiriGucu());
    }
    
    
    /**
     * @return the beybladeci
     */
    public String getBeybladeci() {
        return beybladeci;
    }

    /**
     * @param beybladeci the beybladeci to set
     */
    public void setBeybladeci(String beybladeci) {
        this.beybladeci = beybladeci;
    }

    /**
     * @return the donusHizi
     */
    public int getDonusHizi() {
        return donusHizi;
    }

    /**
     * @param donusHizi the donusHizi to set
     */
    public void setDonusHizi(int donusHizi) {
        this.donusHizi = donusHizi;
    }

    /**
     * @return the saldiriGucu
     */
    public int getSaldiriGucu() {
        return saldiriGucu;
    }

    /**
     * @param saldiriGucu the saldiriGucu to set
     */
    public void setSaldiriGucu(int saldiriGucu) {
        this.saldiriGucu = saldiriGucu;
    }
}
