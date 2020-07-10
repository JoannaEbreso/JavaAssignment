import java.sql.SQLOutput;

public class BarChart {
    public static void main(String[]args){
        int[] marks = {12,19,15,29,25};
        int[] frequency = {3,1,7,2,5};
        for(int i=0; i<frequency.length;i++){
            int numberOfTimesToPrint = frequency[i];
            System.out.print(marks[i] + ": ");
            for(int j = 0; j<numberOfTimesToPrint; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
