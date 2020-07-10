public class Array {
    public static void main(String[] args) {


        int[][] scores = {{10, 15, 20}, {20, 21, 25, 28, 15}, {17, 10,}, {30, 24, 21}, {23, 22, 10, 20}};

        for (int row = 0; row < scores.length; row++) {
            for (int column = 0; column < scores[row].length; column++) {
                System.out.print(scores[row][column] + " ");
            }
            System.out.println();
        }
    }
}
