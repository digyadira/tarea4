
public class Circulo {
	//Declaramos el radio que se nos pide
	double radio;
	Circulo(double radio)
	{
		this.radio = radio;
	}
	double getRadio()
	// Aqui devolvemos el radio con el return 
	{
		return radio;
	}
	
	void setRadio(double radio)
	// Declaramos el radio con la funcion matematica de PI
	{
		this.radio = Math.PI;
	}

	double getPerimetro()
	// Usamos el return
	// Una vez ya usado el return multiplicamos PI*radio
	{
		return 2*Math.PI*radio;
	}
	
	double getArea()
	// Usaremos otra vez el return
	// YA usado el return se realiza la multiplicacion
	{
		return Math.PI*Math.pow(radio,2);
	}
}
