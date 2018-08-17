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
			
        System.out.println("\n \n" +numero);
        b=true;
        
		}else{
       
		b=false;
		}
	    numero--;
        }
		
		}
	
	public static void main(String args []) {
		
		palindromo palindromo=new palindromo();
		palindromo.numeroPalindromo();
		
	}

}