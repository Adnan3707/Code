import java.util.Scanner;

public class ArrProb {
    private int num;

    public void setNum(int num) {
        this.num = num;
    }

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter five number");
        ArrProb.inpArr();
        int[] arrSor =sorArr();
        ArrProb.pri(arrSor);
    }

    public static int[] inpArr() {
        System.out.println("Enter Array");
        int[] ary = new int[5];
        for (int i = 0; i < 5; i++) {
            ary[i] = scanner.nextInt();
        }
        return ary;
    }

    public static int[] sorArr() {
        int[] srt = inpArr();
        for (int y = 0; y < srt.length; y++) {
            for (int i = 0; i < srt.length - 1; i++) {
                if (srt[i] < srt[i + 1]) {
                    int temp;
                    temp = srt[i];
                    srt[i] = srt[i + 1];
                    srt[i + 1] = temp;
                }
            }
        }
        return srt;
    }
    public static void pri(int[] x){
        for (int i=0;i<x.length;i++){
           System.out.println("Array is :-"+x[i]);
        }
    }
}