package company;

import java.util.Scanner;

public class Departman {
    private int depNo=0;
    private   String depAd;
    public  Personel[] personeller;
    public  Servis[] servisler;
// SET GET methodları

    public int getDepNo() {
        return depNo;
    }

    public void setDepNo(int depNo) {
        this.depNo = depNo;
    }

    public String getDepAd() {
        return depAd;
    }

    public void setDepAd(String depAd) {
        this.depAd = depAd;
    }

    public Personel[] getPersoneller() {
        return personeller;
    }

    public void setPersoneller(Personel[] personeller) {
        this.personeller = personeller;
    }

    public Servis[] getServisler() {
        return servisler;
    }

    public void setServisler(Servis[] servisler) {
        this.servisler = servisler;
    }

    public Departman(int depNo, String depAd){
        this.depNo=depNo;
        this.depAd=depAd;
    }

    public void DepartmanBilgileri()
    {
        System.out.println(+this.depNo+"  ");
        System.out.println(this.depAd+"  ");
    }

    public void bilgileriYazdir(){

        DepartmanBilgileri();

        System.out.println(" Personel Bilgileri : ");
        PersonelBilgileriniGoster();

        System.out.println("  Servis Bilgileri : ");
        ServisBilgileriniGoser();
    }

    private void PersonelBilgileriniGoster()
    {
        for (Personel personel : this.personeller)
        {
            personel.bilgileriYAzdir();
        }
    }
    private void ServisBilgileriniGoser()
    {
        for (Servis servis : this.servisler)
        {
            servis.bilgileriYazdir();
        }
    }





}
