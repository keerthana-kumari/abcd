
public class AutUpCasting_3 {

	public static void main(String[] args) {
		long i = 12700;
		/* Here we are getting error because  we are loosing data while conversion we cannot do up casting here After we add caste it will be converted explicit data*/
				byte j = (byte) i;   // this is right way to express
			//	byte j = i;        this is not right way to express CE will happen
				System.out.println(j); // added comment

	}

}
