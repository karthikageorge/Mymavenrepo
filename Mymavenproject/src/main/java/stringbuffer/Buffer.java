package stringbuffer;// create mutiable string object /to modify

public class Buffer {
//string buffer/builder class is used to create mutiable(modifiable) string
	//string builder is fast and string buffer is slow
	public static void main(String[] args) {
		
		//append()
		/*StringBuffer sb= new StringBuffer("hello");
		sb.append("world");
		System.out.println(sb);*/
		
		//insert() index 1 -java insert the given string with this string at the given position
		/*StringBuffer sb=new StringBuffer("hello");
		sb.insert(1,"java");
		System.out.println(sb);*/
		
		//replace() method replace the given string from the specified begin index and end index
		/*StringBuffer sb=new StringBuffer("hello");
		sb.replace(1, 3, "java");
		System.out.println(sb);*/
		
		//delete() 
		/*StringBuffer sb=new StringBuffer("hello");
		sb.delete(1,3);
		System.out.println(sb);*/
		
		//reverse()
		StringBuffer sb=new StringBuffer("hello");
		sb.reverse();
		System.out.println(sb);
		
	

	}

}
