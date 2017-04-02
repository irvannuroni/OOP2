public class Overloading {

public static void main (String[] args) 

{
	MethodOverloading method = new MethodOverloading();
	Method.methodTampilkan("Belajar Java");
	Method.methodTampilkan("Belajar Java", "Hingga Paham");
	System.out.println (method.kembalikannilai() );
}

private void methodTampilkan(String nama) 
	{
	System.out.println(nama);
	}

private void method(String nama) 
	{
	System.out.println(nama);
	}

}


