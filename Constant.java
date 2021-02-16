package orgo;



public class Constant {

	public static void main(String[] args) {
		String consonants = "bcdefghijklmnopqrstuvwxyz".toUpperCase();

		String inputString = "java";

		String retStr = "";

		inputString = inputString.toUpperCase();

		for(int i=0; i < inputString.length(); i++)
		{
		     char inputChar = inputString.charAt(i);

		     int indexOfCons = consonants.indexOf(inputChar);

		     if (indexOfCons != -1)
		     {
		           indexOfCons++;

		           // if the letter is Z, then go around to B
		           if (indexOfCons == consonants.length())
		           {
		                indexOfCons = 0;
		           }
		           retStr += consonants.charAt(indexOfCons);
		     }
		     else
		     {
		           retStr += inputChar;
		     }
		}
		System.out.println(retStr);
			}

}
