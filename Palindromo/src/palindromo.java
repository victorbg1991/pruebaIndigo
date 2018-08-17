import java.util.Scanner;
public class palindromo {
	
	int numero;
	int faltante;
	int numeroInvertido;
	int restante;
	
	public void numeroPalindromo() {	
	
		Scanner num=new Scanner(System.in);
		
		System.out.println("\n Digite un numero:\n");
        numero=num.nextInt();
		
        if(numero>=101101 && numero<1000000){
        boolean b = false;
        while(b!=true){
		faltante=numero;
		numeroInvertido=0;
		restante=0;
		
		while(faltante!=0) {
       
	    restante=faltante%10;
        numeroInvertido=numeroInvertido*10+restante;
        faltante=faltante/10;
		
		}
		
	    if(numeroInvertido==numero){
		int x=100;
		int prod = 0;
		int mod = 1;
		for(int i=100;i<999;i++){
			mod=numero%i;
			prod=numero/i;
			if(mod==0 && prod<=999){
				b=true;
				int mul=numero/prod;
				System.out.print(numero+"\n");
				System.out.print(mul+" X ");
				System.out.print(prod);
				break;
			}else{
				
				b=false;
			}
		}
        System.out.println("\n \n" +numero);
        
		}else{
			
		b=false;
		
		}
	    numero--;
        }
        }else{
        	System.out.print("Ingrese un número menor de 6 digitos");
        }
		
		}
	
	public static void main(String args []) {
		
		palindromo palindromo=new palindromo();
		palindromo.numeroPalindromo();
		
	}

}