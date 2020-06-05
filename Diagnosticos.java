
package control_citas;

import java.text.ParseException;
import java.util.Scanner;


public class Diagnosticos {
    
    
        String[] NombreCliente = new String[10];
        String[] NombreMascota = new String[10];
        String[] Diagnost = new String[100];
    
    public void Diagnostico() throws ParseException {
        MenuPrincipal menu =new MenuPrincipal();
        
        Scanner Entrada = new Scanner(System.in);
        
        
        System.out.println("**********MENU DIAGNOSTICO*********");
                System.out.println("1---Registrar Diagnostico");
                System.out.println("2---Modificar Diagnostico");
                System.out.println("3---Eliminar Diagnostico");
                System.out.println("4---Menu Incio");
                int opcion1 = Entrada.nextInt();
                
                switch (opcion1){
                    case 1:
                        Registrar();
                        
                        break;
                        
                    case 2:
                        ModificarDiagnostico();
                        
                        break;
                        
                    case 3:
                        EliminarDiagnostico();
                        
                        break;
                        
                    case 4:
                        menu.Menu();
                        break;
                    case 5:
                        reporteDiagnos();
              
                }
    }    
        public void Registrar() {
        
        Scanner scanner =new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del cliente");
            NombreCliente[0] = scanner.nextLine();
            
            System.out.println("Ingrese el nombre de la mascota");
            NombreMascota[0] = scanner.nextLine();
            
            System.out.println("Ingrese el Diagnostico");
            Diagnost[0] = scanner.nextLine();
    }    

    public void ModificarDiagnostico() {
        
        Scanner scanner =new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del cliente");
            NombreCliente[0] = scanner.nextLine();
            
            System.out.println("Ingrese el nombre de la mascota");
            NombreMascota[0] = scanner.nextLine();
            
            System.out.println("Ingrese el Diagnostico");
            Diagnost[0] = scanner.nextLine();
        
    }

    public void EliminarDiagnostico() {
    
        Scanner scanner =new Scanner(System.in);
        System.out.println("Desea Eliminar el Diagnostico");
        System.out.println("----Escriba 1 o 2----");
        System.out.println("1------SI");
        System.out.println("2------NO");
        try {
        int op2 = scanner.nextInt();
        
        
        if(op2 == 1){
            System.out.println("Se ha Eliminado con exito");
        }
        else
        {
            System.out.println("El Dignostico nose ha eliminado");    
        }
        }
        catch (Exception e)
        {
            System.out.println("opcion incorrecta, intentelo de nuevo elija 1 para si y 2 para no");
        }
    }

    public void reporteDiagnos() {
        
        System.out.println("--------REPORTE DE DIAGNOSTICOS-----------");
        
        System.out.println("Nombre del Cliente   :"+""+NombreCliente[0]);
        System.out.println("Nombre de la Mascota :"+""+NombreMascota[0]);
        System.out.println("El Diagnostico es    :"+""+Diagnost[0]);
        
        if(NombreCliente==null&&NombreMascota==null&&Diagnost==null)
        {
            System.out.println("Nose han ingresado datos aun");
        }
    }

}

