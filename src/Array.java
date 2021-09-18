import java.util.Scanner;
public class Array {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Entererd Numbers are");
        int[] anInt = getInt();
        System.out.println("Five Entered numbers are");
        for (int i = 0; i < 5; i++) {
            System.out.println(anInt[i]);
        }
    }

    public static int[] getInt() {
        int[] nums = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter number" + i);
            nums[i] = scanner.nextInt();
        }
        return nums;
    }

}

/*
public class Array {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        int[] myIntegers = getIntegers(5);
         for (int i=0;i<myIntegers.length;i++){
             System.out.println("Element"+i+"typed values was"+myIntegers[i]);
         }
    }
    public static int[] getIntegers(int number){
        System.out.println("Enter"+number+"integer values");
        int[] values = new int[number];
        for (int i=0;i<values.length;i++){
            values[i]=scanner.nextInt();
        }
        return  values;
    }
}
*/