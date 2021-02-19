package quiz_son;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Anasayfa {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("isci sayisini giriniz..");
       int  isciSayisi = scan.nextInt();
        ArrayList <İsci> liste = new ArrayList(isciSayisi);

        for(int i=0;i<isciSayisi;i++){
            System.out.println(i+1+ " İscinin adi..");
            String ad= scan.next();
            System.out.println(i+1+ " İscinin soyadi..");
            String soyad= scan.next();
            System.out.println(i+1+" .iscinin yasi..");
            int yas = scan.nextInt();
            System.out.println(i+1+" .iscinin cocuk sayisi..");
            int cocukSayisi = scan.nextInt();
           İsci isci= new İsci (ad,soyad,yas,cocukSayisi);
           liste.add(isci);
         }
        İsciBilgileriniListele(liste);

        File file = new File("dosya.txt");
        if (!file.exists()) {
            file.createNewFile();
        }

        FileWriter  fileWriter = new FileWriter(file, false);
        BufferedWriter bWriter = new BufferedWriter(fileWriter);
        bWriter.write(liste.toString());
        bWriter.close();
    }

    private static void İsciBilgileriniListele( ArrayList <İsci> liste) {
        for(int i=0;i<liste.size();i++){
            System.out.println(liste.get(i).toString());
        }
    }
}
