public class Tambah{

public static void main (String[] args) 

{
	Method method = new Method();
	Method.methodTampilkan("Tampilkan Java");
	System.out.println (method.tambahkanNilai(3, 5) );
}

private void methodTampilkan(String nama) 
	{
	System.out.println(nama);
	}

private int tambahkanNilai(int x, int y) 
	{
	return x + y;
	}

}


