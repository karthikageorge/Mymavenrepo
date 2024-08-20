package mavenproject;

public class String_Program {
	

	public static void main(String[] args) {
		//String literal methods.....
		
		//LENGTH METHOD
		//String a1="hello world";
		//System.out.println(a1.length());
		
		//CONTAINS METHOD
		/*String c1="java is very simple";
		System.out.println(c1.contains("java is"));
        System.out.println(c1.contains("Java is"));
        System.out.println(c1.contains("python"));*/
		
		//IS EMPTY METHOD
		/*String s1="";
		String s2="hello world";
		System.out.println(s1.isEmpty());
		System.out.println(s2.isEmpty());*/
		
		//EQUALS
		/*String s1="java";
		String s2="Java";
		String s3="Python";
		String s4="Python";
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s3.equals(s4));*/
		
		//EQUAL IGNORECASE --only content will check
		/*String s1="java";
		String s2="Java";
		String s3="Python";
		String s4="Python";
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s2.equalsIgnoreCase(s3));
		System.out.println(s3.equalsIgnoreCase(s4));*/
		
		//TOLOWER CASE
		/*String s1="Java is a programming language";
		System.out.println(s1.toLowerCase());*/
		
		/*String s1="Java is a programming language";
		System.out.println(s1.toUpperCase());*/
		
		//replace 
		/*String s1="Java is simple";
		//System.out.println(s1.replace('i', 'q'));
		System.out.println(s1.replace("Java", "Python"));*/
		
		//trim remove/eliminate white space
		/*String s1=" word ";
		System.out.println(s1.trim());*/
		
		//startsWith(),endsWith()
		/*String s1="java is powerfull";
		System.out.println(s1.startsWith("jav"));
		System.out.println(s1.startsWith("JA"));
		System.out.println(s1.startsWith("is"));*/
		
		String s1="java is powerfull";
		System.out.println(s1.endsWith("full"));
		System.out.println(s1.endsWith("q"));
		
	}

}
