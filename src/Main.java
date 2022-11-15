// https://app.patika.dev/
// https://app.patika.dev/thendbranch

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Ödev
            Aynı projedeki ATM işlemlerini "Switch-Case" kullanarak yapınız.
         */

        // kullanıcı girişi

        Scanner input = new Scanner(System.in);

        String name = "Patika";
        String password = "Java123";
        int girisHakki = 3;
        int bakiye = 1500;

        System.out.println("!! Patika, ATM'ye Hoşgeldiniz !!");
        System.out.println("3 Giriş Hakkınız Vardır..");
        while (girisHakki>0) {
            System.out.print("Kullanıcı Adı : ");
            String isim = input.nextLine();

            System.out.print("Şifre : ");
            String sifre = input.nextLine();
            if (isim.equals(name) && sifre.equals(password)){
               while (girisHakki>0){
                   System.out.println("!! Lütfen Yapmak İstediğiniz İşlemi Seçiniz !!");
                   System.out.println("1.) Para Yatırma\n" +
                           "2.) Para Çekme\n" +
                           "3.) Bakiye Sorgula\n" +
                           "4.) Çıkış Yap");
                   int islem = input.nextInt();
                   switch (islem){
                       case 1:
                           System.out.print("Para Yatırmaya Hoşgeldiniz\n" +
                                   "Lütfen Tutar Giriniz : ");
                           int yatir = input.nextInt();
                           bakiye += yatir;
                           System.out.println("*** Güncel Bakiyeniz *** \n" + bakiye);
                           break;
                       case 2:
                           System.out.print("Para Çekmeye Hoşgeldiniz\n" +
                                   "Lütfen Tutar Giriniz : ");
                           int cek = input.nextInt();
                           if (bakiye>=cek){
                               bakiye -= cek;
                               System.out.println("*** Güncel Bakiyeniz *** \n" + bakiye);
                           }else {
                               System.out.println("Bakiye yetersiz.");
                           }
                           break;
                       case 3:
                           System.out.print("Bakiye Sorgulamaya Hoşgeldiniz\n" +
                                   "Bakiyeniz : " + bakiye + "\n");
                           break;
                       case 4:
                           girisHakki=-1;
                           continue;
                   }
               }
            } else {
                girisHakki--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                System.out.println("Kalan Hakkınız : " + girisHakki);
            }
        }if (girisHakki == 0){
            System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
        }if (girisHakki == -1){
            System.out.println("Tekrar görüşmek üzere.");
        }


    }
}