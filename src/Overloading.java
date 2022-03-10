
public class Overloading {  
	int a,b,c;
	float d;
	public void add()
	{
		System.out.println("Nothong have to add");
	} 
	public void add(int a,int b) {
		System.out.println("Method of addition 2 number will be execute");
	}
	public void add(int a,int b,int c) {
		System.out.println("Method 3 will execute herre");
	} 
	public void add(int a,float d) {
		System.out.println("Method 4 will call here ");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Overloading o=new Overloading();
o.add();
o.add(10,4); 
o.add(12,4,8); 
o.add(5,7.4f);
	}

}
