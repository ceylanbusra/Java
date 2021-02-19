package quiz_son;

public class İsci extends Calisan implements Maas{
    public String gorev;

    public İsci(String ad, String soyad, int yas, int cs) {
        super(ad, soyad, yas, cs);
        this.gorev=gorev;
        gorev="İsci";
    }



    @Override
    public double ZamOranıHesapla() {
        double Zam = cs*100 + ((double)yas*2/3);
     return Zam;
    }

    @Override
    public double MaasHesapla() {
          double maas =ZamOranıHesapla()+3000;
        return maas;
    }

    @Override
    public String toString() {
        return "İsci bilgileri -->" + '\n' +
                "id=" + id + '\n' +
                ", ad='" + ad + '\n' +
                ", soyad='" + soyad + '\n' +
                ", yas=" + yas +'\n' +
                ", cs=" + cs +'\n' +
                ", gorev='" + gorev + '\n' +
                "maas Bilgisi:"+MaasHesapla()+'\n' +
                "Zam  Bilgisi:"+ZamOranıHesapla()+'\n'
                ;
    }
}
