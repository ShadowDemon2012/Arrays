public class Main {
    public static void main(String[] args) {
        int[] firstArray = new int[3];
        firstArray[0] = 1;
        firstArray[1] = 4;
        firstArray[2] = 9;
        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] % 2 != 0) {
                System.out.print(firstArray[i] + 1);
            } else System.out.print(firstArray[i]);
            if (i < firstArray.length - 1) {
                System.out.print(",");
            } else System.out.println();
        }
    }
}








