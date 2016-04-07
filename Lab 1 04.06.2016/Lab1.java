//Main method


class Main {
	public static void main(String [] args) {
		
	//calling secondary methods
	wordLength();
	maxOfTwoNumbers();
	maxOfThree();
	isCharacterAVowel();
	divide152By(1);
	thirdAndFirst("billygoat","LION");
	thirdAndFirst("drEAMcaTCher","statue");
	thirdAndFirst("Times","thyme");
	
	}
	
//Word Length Method	
		public static void wordLength() {
			String newString = new String("Austin is wonderful!");
//Counts the number of characters in the string
			System.out.println(newString.length());
}

//Max of two numbers method
		public static void maxOfTwoNumbers() {
			int num1 = 10;
			int num2 = 20;
			
			if (num1 > num2){
				System.out.println(num1);
			}else if (num2 > num1){
				System.out.println(num2);
			}else{
				System.out.println("Other result");
			}
			
		}

//Max of three method
		public static void maxOfThree() {
			int num1 = 10;
			int num2 = 20;
			int num3 = 5;
			
			if (num1 > num2) {
				System.out.println(num1);
			}else if (num2 > num1) {
				System.out.println(num2);
			}else if (num3 > num1 && num3 > num2) {
				System.out.println(num3);
			}else{
				System.out.println("Other result!");
			}
		}

//Is character a vowel method
		public static void isCharacterAVowel() {
			
		char myVowel = 'g';
		
		switch(myVowel) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'y':
			System.out.println("It's a voewl!");
			break;
			default: 
			System.out.println("FALSEYYY!");
			break;
			
		} 
		
			
			
		}
		
//Is a divison method 
		public static void divide152By(int myNum) {
			
			System.out.println(152 / myNum);
			
		}
		
//Check for a certain character method 
	public static void thirdAndFirst(String string1, String string2){
		
		
		
	
		String firstLetter = "";
		firstLetter = string1.substring(2,3);
		String secondLetter = "";
		secondLetter = string2.substring(0,1);
		
		if (firstLetter.equalsIgnoreCase(secondLetter)) {
			System.out.println("It worked!");
		}else{
			System.out.println("Nope.... UGH");
		}
		
		
		
		//if ( string1.charAt(0)) ==  string2.charAt(0))) {
		//	System.out.println("They match!");
		//}else{
		//	System.out.println("They don't match!");
		//}
		
		
		//char aChar = string1.charAt(1);
		//char aChar = string2.charAt(2);
		//System.out.println( string1.charAt(1));
		//System.out.println( string2.charAt(2));
		
		
	}
		


	
}