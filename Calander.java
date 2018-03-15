
public class Calander {

	public static void main(String[]args) {


		String month[] = {"January", "Febuary", "March", "April", "May", "June", "July", "Augest", "September", "October", "November", "Decmber"};
		int date[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String day[] = {"Monday", "Tuseday", "Wensday", "Thursday", "Friday", "Saturday", "Sunday"};
		
		int d = 0; //weekday => day[]

		for (int i = 2018; i < 2101; i++) {
			System.out.println("        " + i); //prints year
			//add leap year

			for (int j = 0; j < month.length; j++) {
				System.out.println("        "  + month[j]  ); // prints month
				for(int x = 1; x <= date[j];  x++) { 	//prints day	
					if (d == 7) {
						d=0;
						if(i % 100 == 0) {
							date[1] = 28;
						}
						else if (i % 4 == 0 || i % 400 == 0) {
							date[1] = 29;
						}
						else {
							date[1] = 28;
						}
					}	
					System.out.println(x + "                      " + day[d]);
					d++;
				}
			}
		}
	}}



