import java.util.Scanner; 

public class NumeroAlCuboHYCM{

static Scanner sc = new Scanner(System.in);

static void algoritmoRegalos(){
  //Definir Variables
  int cantidad=0;
  int numero=0;
  double resultado=Math.pow(numero,3);
  //Datos de entrada
  System.out.println("Ingrese el total del numeros:");  
  cantidad=sc.nextInt();

  System.out.println("Ingrese el numero:");  
  numero=sc.nextInt();



  //Proceso
  if(cantidad>0 && numero>0){
    
  }
  //Datos de salida
  System.out.println("Ud.: "+resultado);
}

public static void main(String[] args) {
algoritmoRegalos();
}
}