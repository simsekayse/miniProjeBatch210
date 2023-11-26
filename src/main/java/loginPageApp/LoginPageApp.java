

package loginPageApp;

import java.util.Scanner;

/*

        Project: Bir siteye üye olma ve giriş yapma sayfası tasarlayınız.

        menü: kullanıcıya işlem seçimi için menü gösterilir.

        üye olma(register): kullanıcıdan ad-soyad, email ve şifre bilgileri alınız.
        email ve şifre birer listede tutulur.
        aynı email kabul edilmez.

        giriş(login): email ve şifre girilir.
        email bulunamazsa kayıtlı değil, üye olun uyarısı verilir.
        email ile aynı indekste kayıtlı şifre doğrulanırsa siteye giriş yapılır.

        email validation: boşluk içermemeli
        : @ içermeli
                         : gmail.com,hotmail.com veya yahoo.com ile bitmeli.
                                 : mailin kullanıcı adı kısmında(@ den önce) sadece büyük-küçük harf,rakam yada -._ sembolleri olabilir.

        password validation: boşluk içermemeli
        : en az 6 karakter olmalı
        : en az bir tane küçük harf içermeli
        : en az bir tane büyük harf içermeli
        : en az bir tane rakam içermeli
        : en az bir tane sembol içermeli
        */
public class LoginPageApp {
    public static void main(String[] args) {
        //1- tüm userlar icin ortak özellikleri bir classa tasidik.
        //2- userla ilgili işlemler icin userService Classini olusturduk.
        //7- start methodu
        start();
    }

    private static void start() {
        Scanner scan=new Scanner(System.in);
        //1)service objesi olusturalim
        UserService user=new UserService();
        int select;
        do {
            System.out.println("*******TECHPROEDUCATİON*******");
            System.out.println("1- üye ol");
            System.out.println("2- giriş yap");
            System.out.println("0- ÇIKIŞ");
            System.out.println("seciminiz : ");
            select=scan.nextInt();
            switch (select){
                case 1:
                    user.register();
                    System.out.println(user.emails);
                    System.out.println(user.passwords);
                    break;
                case 2:
                    user.login();
                    break;
                case 0:
                    System.out.println("iyi günler dileriz...");
                    break;
                default:
                    System.out.println("hatali giris tekrar deneyiniz");
                    break;
            }


        }while (select!=0);

    }
}