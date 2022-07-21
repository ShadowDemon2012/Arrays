public class Main {
    public static void main(String[] args) {
        int[] firstArray = new int[3];
        firstArray[0] = 1;
        firstArray[1] = 2;
        firstArray[2] = 4;
        double[] secondArray = {1.57, 7.564, 9.986};
        char[] thirdArray = {'a', 'b', 'c', 'd', 'e', 'f', 'g' };
        for (int i = 0; i < firstArray.length; i++) {
            System.out.print(firstArray[i]);
            if (i < firstArray.length - 1) {
                System.out.print(",");
            } else System.out.println();
        }
        for (int i = 0; i < secondArray.length; i++) {
            System.out.print(secondArray[i]);
            if (i < secondArray.length - 1) {
                System.out.print(",");
            } else System.out.println();
        }for (int i = 0; i < thirdArray.length; i++) {
            System.out.print(thirdArray[i]);
            if (i < thirdArray.length - 1) {
                System.out.print(",");
            } else System.out.println();
        }

    }
}





