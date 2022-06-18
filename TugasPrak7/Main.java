/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prak7;

/**
 *
 * @author ACER
 */
public class Main {

    public static void main(String[] args) {
            System.out.println("====== Pegawai Tetap ======");
            PegawaiTetap pT1 = new PegawaiTetap("BARI", "3506238490327424373785", 6400000);
            PegawaiTetap pT2 = new PegawaiTetap("LAURA", "3506233465154314873745", 4000000);
            PegawaiTetap pT3 = new PegawaiTetap("SINA", "3506236484614587373684", 5200000);
            System.out.println(pT1.toString());
            System.out.println(pT2.toString());
            System.out.println(pT3.toString());
            System.out.println("============================");
            System.out.println("");
            System.out.println("====== Pegawai Harian ======");
            PegawaiHarian pH1 = new PegawaiHarian("SINA", "3506239032742489376943", 6600, 34);
            PegawaiHarian pH2 = new PegawaiHarian("DIA", "3506233456823695358287", 5500, 37);
            PegawaiHarian pH3 = new PegawaiHarian("BOLES", "3506233456823696427593", 5000, 40);
            System.out.println(pH1.toString());
            System.out.println(pH2.toString());
            System.out.println(pH3.toString());
            System.out.println("============================");
            System.out.println("");
            System.out.println("=========== Sales ==========");
            Sales sL1 = new
                    Sales("PAMBA", "3503233443874629662846", 45, 50000);
            Sales sL2 = new
                    Sales("SULTAN", "3503233443874628592357", 50, 55000);
            Sales sL3 = new
                    Sales("DIKA", "3503233443873461883573", 40, 45000);
            System.out.println(sL1.toString());
            System.out.println(sL2.toString());
            System.out.println(sL3.toString());
            System.out.println("============================");
        }
    }