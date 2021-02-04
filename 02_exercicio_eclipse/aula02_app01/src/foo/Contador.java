package foo;

public class Contador {
	//ao definir a variavel como static, ela passa a ser uma variavel 
	//da classe, ou seja, todas as instancias/objetos criados para ela
	// teram o mesmo valor
	private static int count;
	
	public static int getCount() {
		return count++;
	}
	
}
