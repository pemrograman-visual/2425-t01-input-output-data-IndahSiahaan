// 12S24052 - Indah Triyuni Siahaan
// 12S24007 - Dasmauli Sormin

import java.util.*;
import java.lang.Math;

public class T01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String iSBN;
        String judul;
        String penulis;
        int tahunTerbit;
        String penerbit;
        String format;
        double harga;
        double minimumMargin;
        int stok;
        double rating;

        iSBN = input.nextLine();
        judul = input.nextLine();
        penulis = input.nextLine();
        tahunTerbit = input.nextInt();
        penerbit = input.nextLine();
        format = input.nextLine();
        harga = input.nextDouble();
        minimumMargin = input.nextDouble();
        stok = input.nextInt();
        rating = input.nextDouble();
        System.out.println(iSBN + "|" + judul + "|" + penulis + "|" + tahunTerbit + "|" + penerbit + "|" + format + "|" + harga + "|" + minimumMargin + "|" + stok + "|" + rating);
    }
}
