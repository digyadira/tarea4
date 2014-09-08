
public class tarea4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            String[] bengi ={"12","2","34","23","132"};
            int[] arreglo={19,12,23,4,120,123,11,2,9};
            int valor=4;
         char[] arreglo2={123,23,45,67,65,45,34,23,12};
         char valor2=67;
         String valor3="666";
         obtenerValor(arreglo,valor);
     System.out.println();
obtenerValor(bengi,valor);
     System.out.println();       
obtenerSuma(arreglo);
     System.out.println();
 obtenerPromedio(arreglo);
   System.out.println();
 existe(arreglo2,valor2);
  System.out.println();
 existe(bengi,valor3);
	}
	//Devuelve el valor almacenado en el indice posicion
	static int obtenerValor(int arreglo[], int posicion)
	{ 
            System.out.print("la posicion "+posicion+" contiene el valor :"+arreglo[posicion]);      
             return -1;
	}
	
	//Devuelve el valor almacenado en el indice posicion
	static String obtenerValor(String arreglo[], int posicion)
	{
             System.out.print("la posicion "+posicion+" contiene el valor :"+arreglo[posicion]);  
		return "";
	}
	
	//Devuelve la suma de todos los elementos del arreglo
	static int obtenerSuma(int arreglo[])
	{
            int suma=0;
           for(int i=0;i<arreglo.length;i++){
           suma=suma+arreglo[i];
           }
           System.out.println("la suma es :"+suma);
		return -1;
	}
	
	//Devuelve el promedio de todos los elementos del arreglo
	static int obtenerPromedio(int arreglo[])
	{
            int promedio=0;
            int suma=0;
            for(int i=0;i<arreglo.length;i++){
                suma=suma+arreglo[i];
            }
            promedio=suma/arreglo.length;
            System.out.print("El promedio es "+promedio);
		return -1;
	}
	
	//Devuelve true si valor esta 
	static boolean existe(char arreglo[], char valor)
	{
	for(int i=0;i<arreglo.length;i++){
            if(arreglo[i]==valor){
           System.out.print("si existe");
            }
          
        }	
            return false;
	}
		
	//Devuelve true si valor esta 
	static boolean existe(String arreglo[], String valor)
	{
            for(int i=0;i<arreglo.length;i++){
            if(arreglo[i]==valor){
           System.out.print("si existe");
            }
            }
		return false;
	}
}
