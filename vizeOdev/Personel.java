package company;


public class Personel {
    private int depNo;
    public int perID;
    private String perAd;
    private String perSoyad;
    private int perYas;
    public Personel() {

    }
public Personel(String perAd,String perSoyad,int perYas,int perID){
        this.perAd=perAd;
        this.perSoyad=perSoyad;
        this.perYas=perYas;
        this.perID = perID;
}

    public int getPerID() {
        return perID;
    }

    public void setPerID(int perID) {
        this.perID = perID;
    }

    public int getDepNo() {
        return depNo;
    }

    public void setDepNo(int depNo) {
        this.depNo = depNo;
    }

    public String getPerAd() {
        return perAd;
    }

    public void setPerAd(String perAd) {
        this.perAd = perAd;
    }

    public String getPerSoyad() {
        return perSoyad;
    }

    public void setPerSoyad(String perSoyad) {
        this.perSoyad = perSoyad;
    }

    public int getPerYas() {
        return perYas;
    }

    public void setPerYas(int perYas) {
        this.perYas = perYas;
    }

    public void bilgileriYAzdir(){

        System.out.println("departman no : "+this.depNo +" personel Adi: "+this.perAd+ " personel soyadi: "+this.perSoyad+" personel yas: "+this.perYas );

    }



}

