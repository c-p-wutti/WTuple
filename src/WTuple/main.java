package WTuple;

public class main {

	public static void main(String[] args) {
		WTuple<String> t1 = new WTuple<>("Classifier", "Object");
		WTuple<String> t2 = new WTuple<>("Classifier", "second Object");
		
		/*
		System.out.println(t1.toString());
		System.out.println(t1.getClassifier());
		System.out.println(t1.getObject());
		t1.setClassifier("asdf");
		t1.setObject("asdf2");
		System.out.println(t1.getClassifier());
		System.out.println(t1.getObject());
		*/
		
		System.out.println(t1.compareTo(t2));
	}

}
