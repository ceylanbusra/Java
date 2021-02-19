package quiz_son;

abstract class Calisan {
    public int id=1000;
    public String ad;
    public String soyad;
    public int yas;
    public int cs ;

    public Calisan( String ad, String soyad, int yas, int cs) {
        this.id = id;
        id=id+2;
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
        this.cs = cs;
    }

    public abstract double ZamOranıHesapla();
}

