

public class ProblemSet4 {
	
	public static void main(String[] args) {
		ProblemSet4 ps4 = new ProblemSet4();
		ps4.surroundMe("abc", "<<>>");
		ps4.endsMeet("basl", 3);
		ps4.middleMan("programming");
		ps4.doubleVision("qwerty");
		ps4.centered("programming", "ram");
		ps4.upOrDown(12.2, 'c');
		ps4.countMe("these are just some sample words", 'e');
		ps4.isNotEqual("is not is not");
		ps4.triplets("abbbcccc");
		ps4.addMe("a123b456c789", true);
	}
	public String surroundMe(String in, String out) {
		int lengthIn = in.length();
		int lengthOut = out.length();
		if (in.equals(null) || out.equals(null)) {
			return null;
		}
		else if (lengthIn != 3) {
			return null;
		}
		else if (lengthOut != 4) {
			return null;
		}
		else {
		String outFirst = out.substring(0, 2);
		String outLast = out.substring(2,4);
		String lastString = outFirst + in + outLast;
		return (lastString);
		
		}
	}
	
	public String endsMeet(String input, int n) {
		int length = input.length();
		if (input == null || n > length || length < 1 || length > 10) {
			return null;
		}
		else {
			String first = input.substring(0, n);
			String last = input.substring(length-n, length);
			String lastString = first + last;
			return lastString;
		}
	}
	public String middleMan(String input) {
		int length = input.length();
		if (input == null || length % 2 != 1) {
			return null;
		}
		else {
			int middle = length / 2;
			String lastString = input.substring(middle-1, middle+2); 
			return lastString;
		}
	}
	public String doubleVision(String input) {
		int length = input.length();
		String lastString = "";
		if (input == null) {
			return null;
		}
		else {
			for (int i = 0; i < length; i++) {
				lastString = lastString + input.charAt(i);
				lastString = lastString + input.charAt(i);
			}
			return lastString;
		}
	}
	public boolean centered(String input, String target) {
		int lengthInput = input.length();
		int lengthTarget = target.length();
		boolean end;
		if (input == null || target == null) {
			return false;
		}
		else if (lengthTarget != 3){
			return false;
		}
		else {
			int middle = lengthInput / 2;
			String check = input.substring(middle-1, middle+2);
			if (check.equals(target)) {
				end = true;
			}
			else {
				end = false;
			}
			return end;
		}
	}
	public int upOrDown(double input, char operation) {
		int check = 2;
		if (operation == 'r' ) {
			check = (int)Math.round(input);
		}
		else if (operation == 'f'){
			check = (int)Math.floor(input);
		}
		else if (operation == 'c') {
			check = (int)(input + 1);
		}
		else {
			return -1;
		}
		return check;
	}
	public int countMe(String text, char target) {
		int lengthText = text.length();
		int count = 0;
		if (text == null || !Character.isLetter(target) ) {
			return -1;
		}
		else {
			for (int i = 0; i < lengthText; i++) {
				if (target == text.charAt(i) && text.charAt(i+1) == ' ' || target == text.charAt(i) && i == lengthText) {
					count += 1;
				}
			}
			return count;
		}
		
	}
	public boolean isNotEqual(String input) {
		int inputLength = input.length();
		if (input == null) {
			return false;
		}
		else { 
		
		String isCheck;
		int isCount = 0;
		String notCheck;
		int notCount = 0;
		for (int i = 0; i < inputLength; i++) {
			if (i < (inputLength - 1)) {
				isCheck = input.substring(i, i+2);
				if (isCheck.equals("is") ) {
					isCount += 1;
				}
			}
		}
		for (int i = 0; i < inputLength; i++) {
			if (i < (inputLength - 2)) {
				notCheck = input.substring(i, i+3);
				if (notCheck.equals("not")) {
					notCount += 1;
				}
			}
		}
		if (isCount == notCount) {
			return true;
		}
		else {
			return false;
		}
	}
	}
	public int triplets(String input) {
		int inputLength = input.length();
		boolean whitespaceCheck = false;
		boolean letterCheck = false;
		char first = 'a';
		char second = 'b';
		char third = 'c';
		int tripletCount = 0;
		for (int i = 0; i < inputLength; i++) {
			if (input.charAt(i) == ' ') {
				whitespaceCheck = true;
			}
		}
		for (int g = 0; g < inputLength; g++) {
			if (Character.isDigit(input.charAt(g)) == true) {
				letterCheck = true;
			}
		}
		if (input == null || whitespaceCheck == true || letterCheck == true) {
			return -1;
		}
		for (int h = 0; h < inputLength; h++) {
			if (h+2 < inputLength) {
				first = input.charAt(h);
				second = input.charAt(h+1);
				third = input.charAt(h+2);
				if (first == second && second == third ) {
					tripletCount += 1;
				}
			}
		}
		return tripletCount;
	}
	public int addMe(String input, boolean add) {
		char jeff = ' ';
		int numberStart = 0;
		int numberEnd = 1;
		String number = null;
		int sum = 0;
		int numberReal = 0;
		boolean whitespaceCheck = false;
		int digit = 0;
		int inputLength = input.length();
		for (int i = 0; i < inputLength; i++) {
			if (input.charAt(i) == ' ') {
				whitespaceCheck = true;
			}
		}
		if (input == null || whitespaceCheck == true) {
			return -1;
		}
		if (add == true) {
			for (int g = 0; g < inputLength; g++) {
				if (Character.isDigit(input.charAt(g)) == true) {
					jeff = input.charAt(g);
					digit = jeff - '0';
					sum += digit;
				}
			}
		}
		else {
			for (int h = 0; h <inputLength; h++) {
				if (Character.isDigit(input.charAt(h)) == true) {
					numberStart = h;
					for (int j = h; j<inputLength; j++) {
						if(Character.isLetter(input.charAt(j)) == true && j < inputLength-1) {
							numberEnd = j;
							break;
						}
						else if (j == inputLength-1 && Character.isDigit(input.charAt(inputLength-1)) == true) {
							numberEnd = inputLength;
							break;
						}
					}
					number = input.substring(numberStart, numberEnd);
					numberReal = Integer.parseInt(number);
					sum += numberReal;
					h = numberEnd;
				}
			}
			
		}
		return sum;
		
}
}
