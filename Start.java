public class Start{
	public static void main(String[] args){
		Brandon brandon = new Brandon();
		Christian christian = new Christian();
		System.out.println("Brandon and Christian are having a conversation");
		System.out.println("-----------------------------------------------");
		speak(christian.name,christian.message);
		speak(brandon.name,brandon.message);
		System.out.println("Brandon and Christian nod with respect, and then part ways");
	}

	public static void speak(String name,String message){
		System.out.printf("%s: $s",name,message);
	}
}