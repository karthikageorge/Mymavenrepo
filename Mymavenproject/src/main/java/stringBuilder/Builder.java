package stringBuilder;

public class Builder {

	public static void main(String[] args) {
		//append
		/*StringBuilder s1= new StringBuilder("helloo");
		s1.append("hi");
		System.out.println(s1);*/
		
		//insert
		/*StringBuilder s1= new StringBuilder("karthika");
		s1.insert(5,"george");
		System.out.println(s1);*/
		
		//replace
		/*StringBuilder s1=new StringBuilder("helloooo");
		StringBuilder s2=new StringBuilder("malayalam");
		
		s1.replace(0, 3, "p");
		s2.replace(0, 1, "p");
		System.out.println(s1);
		System.out.println(s2);*/
		
		//delete
		/*StringBuilder s1= new StringBuilder("keerthy");
		s1.delete(1,3);
		System.out.println(s1);*/
		
		//reverse
		StringBuilder s1= new StringBuilder("lolipop");
		s1.reverse();
		System.out.println(s1);
		
	}

}
