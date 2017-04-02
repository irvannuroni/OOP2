public class Mahasiswa {

public String nama; //Atribut, tipe String, jenis class public

public void kuliah() {
	System.out.println ("KULIAH");
}

public static void main (String[] args) {
	Mahasiswa irvan = new Mahasiswa(); //Deklarasi objek yang akan dibuat

	irvan.nama ="IRVANNNNNNN";
	irvan.kuliah();
}
}