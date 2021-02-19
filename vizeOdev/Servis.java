package company;

public class Servis {
    private int depNo;
    private static int servisID=0;
    private String servisGuzergah;

    public Servis(){

    }
    public Servis (String servisGuzergah){
        Servis.servisID++;
        this.servisGuzergah=servisGuzergah;

    }

    public int getDepNo() {
        return depNo;
    }

    public void setDepNo(int depNo) {
        this.depNo = depNo;
    }

    public String getServisGuzergah() {
        return servisGuzergah;
    }

    public void setServisGuzergah(String servisGuzergah) {
        this.servisGuzergah = servisGuzergah;
    }

    public void bilgileriYazdir(){
        System.out.println("Departman no : "+this.depNo +" Servisin  guzergahi: "+ this.servisGuzergah );
    }
}
