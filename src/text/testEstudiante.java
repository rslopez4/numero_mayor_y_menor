
package text;



    
    import dominio.Estudiante;
import java.util.Scanner;
import static text.testEstudiante.notaAlta;
public class testEstudiante {

     static Scanner datos = new Scanner(System.in);
    private static int nota;
    public static void main(String[] args) {
        int nroHombres,ne;      
        System.out.println("Cuantos estudiantes desea ingresar");
        int n= datos.nextInt();
        Estudiante [] estudiantes = new Estudiante[n];
        llenaEstudiante(estudiantes);
        System.out.println("Listado de Estudiantes acendente");
        //llamar al metodo para ordenar
        for(Estudiante nota:estudiantes){
             
            System.out.println(nota);
            
        }
        nroHombres=porcentajegenero(estudiantes); 
        System.out.println("El % de hombres X encima del promedio :"+porcentajePromedio(estudiantes, nroHombres, 'm'));
        System.out.println("El % de mujeres X encima del promedio :"+porcentajePromedio(estudiantes, nroHombres, 'f'));
        ne = notaAlta(estudiantes);
        System.out.println("El estudiante con la mas alta nota es :"+
                estudiantes[ne].getNombre());
        
    }
    public static void llenaEstudiante(Estudiante est[]){
        String nombre;
        char sexo;
        double nota;
        for(int i=0;i<est.length;i++){
            datos.nextLine();
            System.out.println("Estudiante No "+(i+1));
            System.out.print("Nombre: ");
            nombre = datos.nextLine();
            System.out.println("Sexo: <<m>><<f>> ");
            sexo = datos.next().charAt(0);
            System.out.print("Nota : ");
            nota = datos.nextDouble();
            est[i] = new Estudiante(nombre,sexo,nota);            
        }
    }
    public  static int  porcentajegenero(Estudiante est[]){
        int cuentahombres=0,cuentamujeres=0;
        double porc;
        for(int i=0;i<est.length;i++){
            if(est[i].getSexo()=='m'){
                cuentahombres++;
            }
        }
        cuentamujeres = est.length-cuentahombres;
        System.out.println("Porcentaje hombres ="+(cuentahombres*100/est.length));
        System.out.println("Porcentaje mujeres ="+(cuentamujeres*100/est.length));
        porc = cuentahombres*100/est.length;
        return cuentahombres;
    }
    public static double porcentajePromedio(Estudiante est[],int homb,char sex){
        int muj = est.length-homb;
        int cuenta=0;
        double promedio=0,porch,porcm;
        for(int i=0;i<est.length;i++){
            promedio+=est[i].getNota();
        }
        promedio=promedio/est.length;
        
        for(int i=0;i<est.length;i++){
            if(est[i].getNota()>promedio && est[i].getSexo()==sex){
                cuenta++;
            }
        }        
        porch = homb*100/est.length;
        porcm = muj*100/est.length;
        if(sex=='m' && homb>0){
            porch = cuenta * porch/homb;
            return porch;
        }
        else if(muj>0){
            porcm = cuenta * porcm/muj;
            return porcm;
           }
        else{
            return 0;
        }
    }
    public static int notaAlta(Estudiante est[]){
        
        double mayor;
        double  menor = 0;
        int indice=0;
        mayor = est[0].getNota();
        for(int i=1;i<est.length;i++){
            if(est[i].getNota()> mayor){
                mayor = est[i].getNota();
                indice = i;     
            }
            else  {
            if(est[i].getNota () < menor){
                menor =  est[i].getNota();
                 indice = i;  
     }  
        }
         System.out.println("la nota mayor valor es: "+mayor);
        System.out.println("la nota menor es : "+menor);
        
        return 0;
     
    }
//     public static int mayorMenor(Estudiante est[] , double alto ,double bajo ){
//       
//         double array [] = new double [nota];
//         for(int i=1;i<array.length;i++){
//            if(array[i] > alto){
//                alto =  (double) array[i];
//            }
//         if(array[i] < bajo){
//                bajo  =  (double) array[i];
//     }
//              System.out.println("El mayor valor es: "+alto);
//        System.out.println("El menor valor es: "+bajo);
//         
//         return 0;
//         }
     }
}

