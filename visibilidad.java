import package2.Padre;

class MiClase
{
	static int estatica;
	protected static final int m_final = 10;
}
public class visibilidad {

	public static void main(String[] args) 
	{
		MiClase c = new MiClase();
		c.estatica = 20;
		
		
		MiClase c2 = new MiClase();
		c2.estatica = 200;
		
		System.out.println(c.estatica);
		System.out.println(c2.estatica);
	}

}
