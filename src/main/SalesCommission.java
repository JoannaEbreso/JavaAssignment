
import java.util.Scanner;
public class SalesCommission {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [] counter = new int [9];
		System.out.println("Enter salary: ");
		int salary = input.nextInt();
		int newSalary =0;

		while(salary >= 200) {
			newSalary = salary / 100;

			switch(newSalary){
			case 2:
				counter[0]++;
				break;
			case 3:
				counter[1]++;
				break;
			case 4:
				counter[2]++;
				break;
			case 5:
				counter[3]++;
				break;
			case 6:
				counter[4]++;
				break;
			case 7:
				counter[5]++;
				break;
			case 8:
				counter[6]++;
				break;
			case 9:
				counter[7]++;
				break;
			case 10:
			default:
				counter[8]++;
				break;
			}

			System.out.println("Enter salary: ");
			salary = input.nextInt();
		}

		int rangeStarter =1;
		for(int i=0; i<counter.length; i++){
			if(i>=(counter.length)-1) {
				System.out.printf("$%d and over: ", (rangeStarter * 100)+100);
			}
			else{
				System.out.printf("$%d - $%d: ", (rangeStarter * 100)+100, (rangeStarter * 100) + 199);
			}
			System.out.print(counter[i]);
			rangeStarter++;
			System.out.println();
		}
	}

}
