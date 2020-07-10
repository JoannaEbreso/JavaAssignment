import java.util.Scanner;
public class DuplicateElimination {
    public static void main(String[] args){

        int[] array = new int[5];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 10 and 100: ");
        int number = input.nextInt();

        int numOfInput=0;
        while(numOfInput<=5) {
            if (number >= 10 && number <= 100) {
                for (int counter = 0; counter < array.length; counter++) {
                        if (array[counter] == number) {
                            break;
                        }
                        if (array[counter] > 0) {
                            continue;
                        } else {
                            array[counter] = number;
                            for (int i = 0; i < array.length; i++){
                                if(array[i]>0){
                                    System.out.print(array[i] + " ");
                                }
                            }
                            System.out.println();
                            numOfInput++;
                            break;
                        }
                }
            }
            if(numOfInput==5){
                break;
            }
            System.out.println("Enter a number between 10 and 100: ");
            number = input.nextInt();
        }
        for (int counter2 = 0; counter2 < array.length; counter2++) {
            System.out.print(array[counter2] + " ");
        }

    }
}
