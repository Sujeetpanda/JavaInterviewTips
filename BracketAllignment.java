public class BracketAllignment {
	public static void main(String[] args) {
		String str = "{{{{{{{{()}}}}}}}}((()";
		System.out.println(isValidString(str));
	}
	
	private static boolean isValidString(String str) {
		int noOfCurly = 0;
		int noOfPara = 0;
		
		for(int i = 0; noOfCurly >= 0 && noOfPara >= 0 && i < str.toCharArray().length; i++) {
			if(str.toCharArray()[0] == '}' || str.toCharArray()[0] == ')' 
					|| str.toCharArray()[str.toCharArray().length - 1] == '{' 
					|| str.toCharArray()[str.toCharArray().length - 1] == '(') {
				return false;
			}
			if(str.toCharArray()[i] == '{') {
				noOfCurly += 1;
			} else if (str.toCharArray()[i] == '}') {
				noOfCurly -= 1;
			} else if(str.toCharArray()[i] == '(') {
				noOfPara += 1;
			} else if(str.toCharArray()[i] == ')') {
				noOfPara -= 1;
			}
		}
		
		return (noOfCurly == 0 && noOfPara == 0);
	}
}
