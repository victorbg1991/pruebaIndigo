import java.util.Scanner;

public class EjercicioLogica {

	public static void main(String[] parametro){
		
		int t = 0;
		System.out.println("Ingrese un número entre el 1 y el 100: \n");
		Scanner entradaTeclado = new Scanner(System.in);
		t = entradaTeclado.nextInt(); 
		
		if (t>=1 && t<=100){
			int x = 0;
			while(x<t){
				int n,k;
				System.out.println("Ingrese un número entre el 1 y el 7: \n");
				Scanner entradaN = new Scanner(System.in);
				n = entradaN.nextInt();
				if(n>=1 && n<=7){
					System.out.println("Ingrese un número entre el 1 y el 1000: \n");
					Scanner entradaK = new Scanner(System.in);
					k = entradaK.nextInt();
					int[] vec;
					vec = new int[k];
					for(int i=0; i<vec.length;i++){
						System.out.print("Ingrese elementos:");
						vec[i]=entradaK.nextInt();
					}
					int prod = 1;
			        for(int f=0;f<n;f++) {
			            prod=prod*vec[f];
			        }
			        System.out.println("El Producto de los elementos es:"+prod);
					t = t - 1;
				}else{
					System.out.print("El número que ingresó no está en el rago");
				}
				
			}
		}else{
			System.out.print("El número que ingresó no está en el rago");
		}
	}
}