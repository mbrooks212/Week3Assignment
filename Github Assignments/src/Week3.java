
public class Week3 {

	public static void main(String[] args) {
	
//for step 1			
		int[] ages = new int[9];
		ages[0] = 3;
		ages[1] = 9;
		ages[2] = 23;
		ages[3] = 64;
		ages[4] = 2;
		ages[5] = 8;
		ages[6] = 28;
		ages[7] = 93;
		ages[8] = 69;
		System.out.println(averageCalc(ages));
//for step 2	
		String[] names = new String[6];
		names[0] = "Sam";
		names[1] = "Tommy";
		names[2] = "Tim";
		names[3] = "Sally";
		names[4] = "Buck";
		names[5] = "Bob";
		System.out.println(averageletters(names));
//step 3 n/a
//step 4 n/a
//Step 5
		int[] nameLengths = new int[names.length];
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}
//step 6 
		int nameSum = 0;
		for (int i = 0; i < nameLengths.length; i++) {
			nameSum += nameLengths[i];
		}
		System.out.println(nameSum);
				
//for step 7
		System.out.println(multString("hello",3));
//for step 8	
		System.out.println(createfullname("John","Doe"));
//for step 9
		int[] nums = new int[5];
		nums[0] = 23;
		nums[1] = 12;
		nums[2] = 2;
		nums[3] = 9;
		nums[4] = 38;
		System.out.println(isbignumber(nums));
//for step 10
		double[] numbers = new double[6];
		numbers[0] = 18;
		numbers[1] = 190;
		numbers[2] = 1;
		numbers[3] = .003;
		numbers[4] = 188;
		numbers[5] = 164;
		System.out.println(averagedouble(numbers));
//for step 11 
		double[] dbl1 = new double[5];
		dbl1[0] = 2;
		dbl1[1] = 189;
		dbl1[2] = 34;
		dbl1[3] = 6;
		dbl1[4] = 22;
		double[] dbl2 = new double[5];
		dbl2[0] = 69;
		dbl2[1] = 57;
		dbl2[2] = 35;
		dbl2[3] = 4;
		dbl2[4] = 29;
		System.out.println(greateraverage(dbl1,dbl2));
//for step 12
		System.out.println(willBuyDrink(true,9.80));
//for step 13
		System.out.println(isNameTooLong("Clarrissa",20));
	}
//Step 1
			public static double averageCalc(int[] ages) {
				System.out.println(ages[ages.length -1] - ages[0]);
				double sum = 0;
				for(int age : ages) {
				sum += age;
				}
				return sum / ages.length;
			}
//Step 2
			public static double averageletters(String[] names) {
				double sum = 0;
				for(String name : names) {
				sum = sum + name.length();
				}
				String alldaNames = "";
				for (int i = 0; i < names.length; i++) {
					alldaNames += names[i] + " ";
				}
				System.out.println(alldaNames);
				return sum / names.length; 
			}
//Step 3: Use array[array.length -1] to access last element
			
//Step 4: Use array[0] to access first element.
			
//Step 5 see above
			
//Step 6 see above
			
//Step 7
			public static String multString(String st, int num) {
				String result = "";
				for (int a = 0; a < num; a++) {
					result += st;
				}
				return result;
			}
//Step 8
			public static String createfullname (String firstName, String lastName) {
				String fullName = firstName + " " + lastName;
						return fullName;
			}
			
//Step 9
			public static boolean isbignumber(int[] nums) {
				int sum = 0;
				for(int num : nums) {
					sum += num;
				}
				return sum>100;
			}
			
			
//Step 10
			public static double averagedouble(double[] numbers) {
				double sum = 0;
				for(double num : numbers) {
					sum += num;
				}
				return sum / numbers.length; 
			}
			
//Step 11
			public static boolean greateraverage(double[] dbl1, double[]dbl2) {
				double sum1 = 0;
				double sum2 = 0;
				for( double dbl : dbl1) {
					sum1 += dbl;
				}
				for( double dbl :dbl2) {
					sum2 += dbl;
				}
				return sum1 > sum2;
				
			}
			
			
//Step 12
			public static boolean willBuyDrink(boolean isHotOutside,double moneyInPocket) {
					return isHotOutside && moneyInPocket > 10.50;
			}
//Step 13
			public static boolean isNameTooLong(String username,int charcap) {
				return username.length() <=  charcap;
			}
//The method takes a given username, and it compares it against a specified integer,
//the integer is names "character cap" and it acts as a character cap on a username
//if it is longer than specified integer, it will print out false, otherwise true			
}			
			
			
			
			
