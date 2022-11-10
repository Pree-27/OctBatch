package JavaAsignments;

public class AsignmentOnConstructorAndThisKeyword {
	public AsignmentOnConstructorAndThisKeyword() {
		this(1,2,3,4);
		System.out.println("Default Constructor");
	}
	
	public AsignmentOnConstructorAndThisKeyword(int a) {
		this();
		System.out.println("One Parameterised Constructor");
	}
	
	public AsignmentOnConstructorAndThisKeyword(int a,int b) {
		this(1,2,3);
		System.out.println("Two Parameterised Constructor");
	}
	
	public AsignmentOnConstructorAndThisKeyword(int a,int b,int c) {
		this(2);
		System.out.println("Three Parameterised Constructor");
	}

    public AsignmentOnConstructorAndThisKeyword(int a,int b,int c,int d) 
    {
    
    	
		System.out.println("Four parameterized constructor");
		
	
	}

public static void main(String[] args) {
	AsignmentOnConstructorAndThisKeyword a= new AsignmentOnConstructorAndThisKeyword(22,23);
}



}
