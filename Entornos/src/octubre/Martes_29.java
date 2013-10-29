package octubre;

public class Martes_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//operadores booleanos. Operan sobre expresiones logicas
		
				boolean resultado=(2*3==5);
				System.out.println((2*3==5));//expresion logica
				System.out.println(resultado);
				
				if (!(resultado==true)){
					
					System.out.println("Son iguales");
					
					
			    }
				else {
					
					System.out.println("No son iguales");
				}
				
				//operadores especificos de valores logicos
				//No (!) es un operador monario
				//Y (&&) es un operador binario. cuando las dos son verdaderas el resultado es
				//true en cualquier otro caso es false
				
				if ((3>2)&&(2<4)){
					
					System.out.println("cierto");
					
				}else {
					
					System.out.println("false");
				}
				//O (||) es un operador binario. Cuando las dos son falsas el resultado es falso
				//en cualquier otro caso el resultado es cierto
		         if (3<2 || 2<4){
		        	 
		        	 System.out.println("cierto"); 
		        	 
		         }else{
		        	 
		        	 System.out.println("false");
		         }
		         
		         //Dados dos numeros enteros escribir el mayor de los dos
		         //declaramos las variables
		         int a=0;
		         int b=0;
		         
		         System.out.println(Math.random());
		         a=(int)(Math.random()*100+1);
		         b=(int)(Math.random()*100+1);
		         
		         if(a>b){
		        	 
		        	 System.out.println("El mayor es:"+a);
		        	 
		         }else  if(b>a){   //esto es nuevo
		        	 
		        	 System.out.println("El mayor es:"+b);
		        	 
		         }else{
		        	 
		        	 System.out.println("Son iguales:"+a);
		         }
             
		         System.out.println(a+" "+b);
	}

}
