package Latihan;

import java.util.Scanner;

public class konversi {

    Scanner dck = new Scanner(System.in);
    private int angka;
    private String bacaan[];
    private String terbilang;
    public int a;
    static int ongko[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    static String baca[] = {"", "satu", "dua", "tiga", "empat", "lima", "enam", "tujuh", "delapan", "sembilan", "sepuluh", "sebelas"};

    public void ubah1() {
        System.out.print("masukkan angka 1-1000: ");
        int angka = dck.nextInt();
        this.angka = angka;
    }

    public void ubah() {
        System.out.print("masukkan terbilang huruf 1-1000: ");
        String hf = dck.nextLine();
        this.terbilang = hf;
    }

    public konversi() {

    }

    public void ubahdandisplay() {
        int a, b, c;
        if (angka > 11 && angka < 20) {
            a = angka % 10;
            System.out.println(baca[a] + " belas");
        } else if (angka < 12 && angka >= 0) {
            a = angka / 1;
            System.out.println(baca[a]);
        } else if (angka > 19 && angka < 100) {
            a = angka / 10;
            b = angka % 10;
            System.out.println(baca[a] + " puluh " + baca[b]);
        } else if (angka >= 200 && angka < 1000) {
            a = angka / 100;
            b = (angka / 10) - ((angka / 100) * 10);
            c = angka % 10;
            if (b == 0) {
                System.out.println(baca[a] + " ratus " + baca[c]);
            } else if (b == 1 && (c < 10 && c > 1)) {
                System.out.println(baca[a] + " ratus " + baca[c] + " belas");
            } else if (b == 1 && c == 1) {
                System.out.println(baca[a] + " ratus " + "sebelas");
            } else if (b == 1 && c == 0) {
                System.out.println(baca[a] + " ratus " + "sepuluh");
            } else {
                System.out.println(baca[a] + " ratus " + baca[b] + " puluh " + baca[c]);
            }
        } else if (angka == 100) {
            System.out.println("seratus");
        } else if (angka == 1000) {
            System.out.println("seribu");
        }

    }

    public int satuan() {
        for (int i = 0; i < baca.length; i++) {
            if (terbilang.equalsIgnoreCase(baca[i])) {
                a = ongko[i];
            }

        }
        return a;
    }

    public int belasan() {
        for (int i = 2; i < baca.length; i++) {
            if (terbilang.equalsIgnoreCase(baca[i] + " belas")) {
                a = ongko[i] + 10;
            }

        }
        return a;
    }

    public int puluh() {
        for (int i = 2; i < baca.length; i++) {
            if (terbilang.equalsIgnoreCase(baca[i] + " puluh")) {
                a = ongko[i] * 10;
            }

        }
        return a;
    }

    public int ratus() {
        for (int i = 2; i < baca.length; i++) {
            if (terbilang.equalsIgnoreCase(baca[i] + " ratus")) {
                a = ongko[i] * 100;
            }

        }
        return a;
    }

    public void display2() {
        
            
        }
            
        
    }


