package company;
import java.util.List;
import java.util.Scanner;
public class AnaSayfa {

    public static int DepartmanSayisiAl(){
        System.out.println("Departman sayisini giriniz..");// Departman sayisini alıyor.
        Scanner tara = new Scanner(System.in);
        int departmanSayisi = tara.nextInt();
        return departmanSayisi;
    }

    public static Departman PersonelBilgisiAl(Departman departman){
        Scanner tara = new Scanner(System.in);
        int PerSayisi;
        System.out.println("personel sayisini giriniz..");
        PerSayisi= tara.nextInt();
        String Perad,persoyad;
        int Peryas,perID;
        departman.personeller = new Personel[PerSayisi];
        for(int i=0;i<PerSayisi;i++){
            System.out.println(departman.getDepAd() + (i + 1) + ".personel bilgileri:");

            System.out.println(i + 1 + ".personel id  giriniz:");
            perID = tara.nextInt();
            System.out.println(i + 1 + ".personelin adini giriniz:");
            Perad = tara.next();
            System.out.println(i + 1 + ".personelin soyadini  giriniz:");
            persoyad = tara.next();
            System.out.println(i + 1 + ".personelin yasini  giriniz:");
            Peryas = tara.nextInt();

            Personel personel= new Personel(Perad,persoyad,Peryas,perID);

            personel.setDepNo( departman.getDepNo() );
            departman.personeller[i] = personel;

        }
        return departman;
    }


    public static Departman ServisBilgisiAl(Departman departman){
        Scanner tara = new Scanner(System.in);

        System.out.println("Servis sayisini giriniz..");
        int servisSayisi = tara.nextInt();

        String servisGuzergahi;

        departman.servisler = new Servis[servisSayisi];

        for(int i=0;i<servisSayisi;i++){
            System.out.println(departman.getDepAd() + (i + 1) + ".servis bilgileri:");

            System.out.println(i+1 + ".servisin guzergahini girinz:");
            servisGuzergahi = tara.next();

            Servis servis = new Servis(servisGuzergahi);

            servis.setDepNo( departman.getDepNo() );

            departman.servisler[i] = servis;

        }
        return departman;
    }

    public static Departman[] DepartmanBilgisiAl(Departman[] departmanlar){
        Scanner tara = new Scanner(System.in);

        int depNo;
        String depAd;
        for (int i = 0; i < departmanlar.length; i++) {// Departman adi ve no su alma
            System.out.println((i + 1) + ".departmanin departman Nosunu giriniz: ");
            depNo = tara.nextInt();
            System.out.println((i + 1) + ".departmanin departman Adini giriniz: ");
            depAd = tara.next();
            Departman departman = new Departman(depNo, depAd);

            //Referance veri tipi oldugu için departmanı geri dondurmedik
            departmanlar[i] =  PersonelBilgisiAl(departman);
            departmanlar[i] = ServisBilgisiAl(departman);

            departmanlar[i]= departman;
        }
        return departmanlar;
    }



    public static void Listele(Departman [] departmanlar)
    {
        for( Departman departman : departmanlar)
        {
            departman.bilgileriYazdir();
        }
    }

    public static void DepartmanaGoreArama(Departman [] departmanlar)
    {
        System.out.println("Aranacak Departman: ");
        Scanner tara = new Scanner(System.in);
        String aranacakDeger = tara.next();


        for (Departman departman : departmanlar)
        {
            if(departman.getDepAd().equals( aranacakDeger ))
            {
                departman.bilgileriYazdir();
            }
        }
        System.out.println("Aranan Departman Bulunamadı...");
    }

    public static void PersonelAdinaGoreArama(Departman [] departmanlar)
    {
        System.out.println("Aranacak Personelin Adi: ");
        Scanner tara = new Scanner(System.in);
        String aranacakDeger = tara.next();

        for (Departman departman : departmanlar)
        {
            for(Personel personel : departman.personeller)
            {
                if(personel.getPerAd().equals( aranacakDeger ))
                {
                    System.out.println(departman.getDepAd());
                    System.out.println(departman.getDepNo());

                    personel.bilgileriYAzdir();
                }
            }
        }
    }

    public static void ServisAdinaGoreArama(Departman [] departmanlar)
    {
        System.out.println("Aranacak Servis Güzergahi: ");
        Scanner tara = new Scanner(System.in);
        String aranacakDeger = tara.next();

        for (Departman departman : departmanlar)
        {
            for(Servis servis: departman.servisler)
            {
                if(servis.getServisGuzergah().equals( aranacakDeger ))
                {
                    System.out.println(departman.getDepAd());
                    System.out.println(departman.getDepNo());

                    servis.bilgileriYazdir();
                }
            }
        }
    }

    public static void EnBuyukVeEnKucukYaslariBul(Departman [] departmanlar)
    {
        Personel enGencPersonel = departmanlar[0].personeller[0];
        Personel enYasliEleman = departmanlar[0].personeller[0];

        Departman gencDepertmani = departmanlar[0];
        Departman yasliDepartmani = departmanlar[0];
        for(Departman departman : departmanlar)
        {
            for (Personel personel : departman.personeller)
            {
                if(personel.getPerYas() > enYasliEleman.getPerYas())
                {
                    enYasliEleman = personel;
                    yasliDepartmani = departman;
                }
                if(personel.getPerYas() < enGencPersonel.getPerYas())
                {
                    enGencPersonel = personel;

                }
            }
        }

        System.out.println("En Genc Personel Bilgileri : ");
        gencDepertmani.DepartmanBilgileri();
        enGencPersonel.bilgileriYAzdir();

        System.out.println("En Yasli Personel Bilgileri");
        yasliDepartmani.DepartmanBilgileri();
        enYasliEleman.bilgileriYAzdir();

    }

    public static void AnaMenu(Departman [] departmanlar)
    {
        Scanner tara = new Scanner(System.in);
        boolean kontrol = true;
        while ( kontrol == true) {
            int secim;
            System.out.println("1-TUM DEPARTMAN BILGILERINI LISTELE");
            System.out.println("2-DEPARTMAN ADINA GORE ARAMA YAP");
            System.out.println("3-PERSONEL ADINA GORE ARAMA YAP");
            System.out.println("4-SERVIS GUZERGAHINA GORE ARAMA YAP");
            System.out.println("5-YASI EN BUYUK VE EN KUCUK  PERSONEL/ PERSONELLERİ BUL");
            System.out.println("6-CIKIS");
            System.out.println("LUTFEN 1-6 ARASINDA SECIM YAPINIZ..");
            secim = tara.nextInt();
            switch (secim) {
                case 1: {
                    Listele( departmanlar );
                    break;
                }
                case 2:{
                    DepartmanaGoreArama( departmanlar );
                    break;

                }
                case 3: {
                    PersonelAdinaGoreArama( departmanlar );
                    break;
                }
                case 4:{
                    ServisAdinaGoreArama( departmanlar );
                    break;
                }
                case 5:{
                    EnBuyukVeEnKucukYaslariBul( departmanlar );
                    break;
                }
                case 6:{
                    kontrol= false;
                    break;
                }

            }

        }
    }


    public static void main(String[] args) {
        //kaç departman olacak
        int departmanSayisi = DepartmanSayisiAl();
        Departman [] departmanlar = new Departman[departmanSayisi];

        //diziyi doldurma
        departmanlar = DepartmanBilgisiAl(departmanlar);

        AnaMenu(departmanlar);

    }
}

