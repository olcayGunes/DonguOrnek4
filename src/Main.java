import java.util.Scanner;

public class Main {

    public static long faktoriyel(int sayi) {
        long i = 1, fak = 1;
        while (i <= sayi) {
            fak *= i;
            i++;
        }
        return fak;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int elemanSayisi, altKumeElemanSayisi;
        long result;

        System.out.print("Küme Eleman Sayısı: ");
        elemanSayisi = input.nextInt();

        System.out.print("Alt Küme Eleman Sayısı: ");
        altKumeElemanSayisi = input.nextInt();

        result = (faktoriyel(elemanSayisi)) / (faktoriyel(altKumeElemanSayisi) * faktoriyel((elemanSayisi - altKumeElemanSayisi)));

        System.out.println(elemanSayisi + " Elemanlı Bir Kümenin " + altKumeElemanSayisi + " Elemanlı Alt Küme Sayısı: " + result);
    }
}
