package octubre;

public class Jueves24 {

	public static variable=0;//par cualquier metodo dentro de jueves24
	public static void main(String[] args) {
		
		
		//operadores aritmeticos: realizan operaciones con valores de tipo numerico
		//El resultado es un valor de tipo numerico
		//siempre del tipo mas alto en la escala: int, long y double.
		//Los operadores son: binarios(+ , - , *, /, %) y los monarios:(- negacion, ++ incremento
		//antes o despues de una variable, --, += incre una varialbe en el valor de la derecha
		//ejemplo con *= dado a multiplico por 2 yl o guardo en a
		//   /=,  %=  a%=2, metodos para raiz potencias.... que estan en math
		// que es una clase de utilidades
		
		int a = 0;  //siempre  inicializar las variables
		int b = 0; //normalmente java nos obliga a inicializar las variables
		a = 3;     // java es lenguaje fuertemente tipado
		b = (2 * 5) + (3 /2);
		int c = b/a;   // o c= integer.parseInt("28");
		double d = 0.0; //no hace falta porner 0.0 pero vamos a ponerlo
		System.out.println("a: "+ a +"b: "+ b + "b/a= "+(b/a));
		
	
		Math.sqrt(a);
		//si lo quiero guardar en c me da error porque es real el resultado error de tipo
		c=(int)Math.sqrt(a); //fuerzas a que sea un entero (la conversion de un tipo en otro)el resultado de la raiz
		d = (int)Math.sqrt(a); //como es double lo admite
		d=a % b;     //java es secuencial
		System.out.println("a: "+ a +"b: "+ b + "b/a= "+ c );
		System.out.println("d:" + d);
		//haremos pseudocodigo
		
		//libreria math o clase math contiene metodos aritmeticos para uso general
		//es conveniente reutilizar el codigo
        long l = 0; //tambien es entero pero cambia su tamñao mas grande
        short s = 0; //entero pequeño
        s= 10000;  //si hay problema de espacio podemos utilizar los tipos
        // precedencias de los operadores
        //*,/,%,+,-
        c = 2+5*6;
        c = 2*5/6; //dpendiendo como bareme el compilador puede dar un desastre, mejor parentesis
        
        
        //operadores logicos : producen un resultado booleano o logico,true o false
        //comparadores  >,>=,<,<=,==,!=
        //las cadenas no se comparan con estos operadores
        
        String mensaje = "hola mundo";
        int n=mensaje.compareTo("hola mundo");
        //coge los caracteres con el valor en ascii y lo resta si es cero son iguales
        
        
        System.out.println(n); //si da cero son iguales
        boolean m= mensaje.equals("hola mundo"); //esta funcion devuelve false o true
        System.out.println(m);
        boolean p = c ==a; //devuelve false o true dependiendo si c es igual a a o no
        System.out.println(p);
        {
        	
        	int z=0;
        	
        }
       variable=0;//variable de clase , quienes pueden manipularlas? metodos estaticos
	
	}

}
