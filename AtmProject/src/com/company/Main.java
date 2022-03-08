package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String userName, password;
        int right = 3, select, balance = 2000;
        Scanner input = new Scanner(System.in);
        while (right > 0) {
            System.out.print("Kullanıcı adı giriniz: ");
            userName = input.next();
            System.out.print("Şifre giriniz: ");
            password = input.next();
            if (userName.equals("dilan") && password.equals("ergin")) {
                System.out.println("Sisteme giriş yapıldı.");
                System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz:\n 1) Hesaba para yatırma\n " +
                        "2) Hesaptan para çekme \n 3) Bakiye sorgulama \n 4) Çıkış");
                select = input.nextInt();

                switch (select) {
                    case 1:
                        System.out.print("Yatırmak istediğiniz tutarı giriniz: ");
                        int price = input.nextInt();
                        balance += price;
                        System.out.println("İşlem tamamlandı.");
                        break;
                    case 2:
                        System.out.print("Hesaptan çekmek istediğiniz tutarı giriniz:");
                        int price2 = input.nextInt();
                        if (price2 > balance) {
                            System.out.println("Bakiye yetersiz.");
                        } else {
                            System.out.println("İşlem tamamlandı.");
                            balance -= price2;
                        }
                        break;
                    case 3:
                        System.out.println("Güncel bakiyeniz: " + balance);
                        break;
                    case 4:
                        System.out.println("Sistemden çıkış yapıldı.");
                        break;

                }

            } else {
                System.out.println("Kullanıcı adı ya da parola hatalı.Lütfen tekrar deneyiniz!");
                right--;
                System.out.println("Kalan hakkınız: " + right);
            }
            if (right == 0) {
                System.out.println("Hesabınız bloke edilmiştir.");
            }
        }


    }
}



