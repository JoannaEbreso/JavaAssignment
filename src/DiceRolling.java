import java.util.Random;
public class DiceRolling {
    public static void main(String[] args){
        int[] sumArray = {2,3,4,5,6,7,8,9,10,11,12};
        int[] frequency = new int[sumArray.length];

        Random rand = new Random();
        for(int diceRoll=1; diceRoll<=36000000; diceRoll++) {
            int dice1 = 1 + rand.nextInt(6);
            int dice2 = 1 + rand.nextInt(6);
            int sum = dice1 + dice2;

            for(int counter=0;counter<sumArray.length; counter++){
                if(sumArray[counter] == sum){
                    frequency[counter]++;
                }
            }
        }
        System.out.printf("%s %10s%n","SUM","FREQUENCY");
        for(int i=0;i<frequency.length; i++){
            System.out.printf("%2d %10d%n",sumArray[i],frequency[i]);
        }
    }
}
