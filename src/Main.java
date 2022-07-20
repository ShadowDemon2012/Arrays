public class Main {
    public static void main(String[] args) {
        int[] firstArray = new int[3];
        firstArray[0] = 1;
        firstArray[1] = 2;
        firstArray[2] = 4;
        double[] secondArray = {1.57, 7.564, 9.986};
        char[] thirdArray = {'a', 'b', 'c', 'd', 'e', 'f', 'g' };
        for (int i = firstArray.length; i > 0; i--) {
            System.out.print(firstArray[i - 1]);
            if (i > 1) {
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }
        for (int i = secondArray.length; i > 0; i--) {
            System.out.print(secondArray[i - 1]);
            if (i > 1) {
                System.out.print(", ");
            } else System.out.println();
        }
        for (int i = thirdArray.length; i > 0; i--) {
            System.out.print(thirdArray[i - 1]);
            if (i > 1) {
                System.out.print(", ");
            } else System.out.println();
        }

    }
}





