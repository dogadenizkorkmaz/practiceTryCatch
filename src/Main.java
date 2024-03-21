import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        int[] array = {3, 6, 9, 12, 5, 8, 7, 15, 18, 21};//define array
        Scanner ind = new Scanner(System.in);
        //noinspection InfiniteLoopStatement
        while (true) {//tr: "infinity döngü denetlenmesin"
            System.out.println("Indeks numarasını girin : ");
            int index = ind.nextInt();
            try {
                int element = getElement(array, index);
                System.out.println("Dizinin " + index + ". indeksindeki eleman: " + element);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Hata: Belirtilen indeks dizi boyutunun dışındadır!");
            }
        }
    }
    public static int getElement(int[] dizi, int indeks) throws ArrayIndexOutOfBoundsException {

        if (indeks < 0 || indeks >= dizi.length) { //index control
            throw new ArrayIndexOutOfBoundsException();// If the index is outside the array
        }
        return dizi[indeks];// if the index is valid;
    }
}