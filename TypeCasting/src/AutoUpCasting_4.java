
public class AutoUpCasting_4 {

	public static void main(String[] args) {
		float i = 127.00f;
		/* Here we are getting error because 
		*we are loosing data while conversion
		*we cannot do up casting here
		*After we add to cast it will be converted explicit data
		*/
		int j = (int)i;
		// int j = i;  //  this is not right way to express CE will happen
		System.out.println(j);

	}

}
