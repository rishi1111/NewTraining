
public class StringDemo {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = new String("Hello");
		String s3 = "Hello";

		System.out.println(s1 == s2);
		System.out.println(s1 == s3);

		s1 = s1 + "World";
		//HelloWorld

		System.out.println(s1.length());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s2 == s3); // compares reference

		System.out.println(s2.equals(s3)); // compares actual values of string

		System.out.println(s1.indexOf('l'));
		System.out.println(s1.lastIndexOf('l'));

		System.out.println(s1.substring(3));
		System.out.println(s1.substring(3, 7));
		
		System.out.println(s1.charAt(5));
		
		System.out.println(s1.substring(3));



	}
}
