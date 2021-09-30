
import java.util.Scanner;

public class PilaABC {
    
    public static void main(String args[]){
       
        Scanner sc= new Scanner (System.in);
            
        int opt=0;
        
        System.out.println("Tamaño de la pilas: ");

        int tam = sc.nextInt();
        
        int a=tam, b=tam;
        
            int [ ] pilaA=new int [a];

            int [ ] pilaB=new int [b];
        
            int[ ] pilaC=new int [a+b];
            
            int reset[];

        do {
            System.out.println("\n1. Llenar pila A y pila B\n"
            +"2. Mostrar Pila A y B\n"
            +"3. Vaciar pila A y B\n"
            +"4. Unir pila A y pila B en pila C\n"
            +"5. Mostrar pila C\n"
            +"6. Salir\n");
            
            opt = sc.nextInt();

            switch (opt){
                
            case 1:
                
                System.out.println("\nValores agregados");
                
                    for (int i=0; i<tam; i++) {
                        pilaA[i]=(int) (Math.random()*100);
                    }
            
                    for (int i=0; i<tam; i++) {
                        pilaB[i]=(int) (Math.random()*(200-100+1)+100);
                    }
            break;

            case 2:
                
                System.out.println("\nPila A");
                
                    for (int i=a-1; i>=0; i--){
                        System.out.println(" " + pilaA[i]);
                    }

                    System.out.println("\nPila B");
                    
                        for(int i=b-1; i>=0; i--) {
                            System.out.println(" " + pilaB[i]);
                        }
            break;
            
            case 3:
                int res=0;

                pilaA = new int[res];
                System.out.println("\nValue of array: "+pilaA.length);
                pilaB = new int[res];
                System.out.println("\nValue of array: "+pilaB.length);
                if(pilaA.length==0 && pilaB.length==0){
                    System.out.println("\nPilas vacias");
                } else {
                    System.out.println("\nPila con contenido");
                }
            break;
            
            case 4:
                
                System.out.println("\nSuma de pilas terminada");
                int longA=pilaA.length;
                int longB=pilaB.length;
                if (longA==longB){
              
                    for(int i=0; i<longA;  i++){
                      for(int j=0; j<longB;  j++){ 
                        
                        pilaC[0]=pilaA[i]+pilaB[j];
                    }
                }
             } 
                
            break;

            case 5:
                 
                int longa=pilaA.length;
                int longb=pilaB.length;
                
                System.out.println("\nPila C\n");
                        
                if (longa==longb){
              
                    for(int i=0; i<longa;  i++){
                      for(int j=0; j<longb; j++){ 
                        
                        pilaC[0]=pilaA[i]+pilaB[j];
                        
                        System.out.println(pilaC[0]);
                        
                        i++;
                    }
                }
             } 
            
            break;
                 
            case 6:
            
                System.exit(0);
   }
       }while (opt!=6);
    
    }
 
}