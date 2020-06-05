
package control_citas;

import java.text.ParseException;
import java.time.LocalTime;
import java.util.Scanner;


public class MenuPrincipal {
    
   Citas objetocita = new Citas();
   Diagnosticos objetodiag = new Diagnosticos();
   Reportes report1 = new Reportes();
    
    public void Menu() throws ParseException{
    
    Scanner Entrada = new Scanner(System.in);
        
        
        int opcion = 0;
        System.out.println("------------------MENU PRINCIPAL------------------");
        System.out.println("Seleccioe una Categoria");
        
        
            System.out.println("1---Citas");
            System.out.println("2---Diagnosticos");
            System.out.println("3---Reportes");
            System.out.println("4-- Salir");
            opcion = Entrada.nextInt();
            
            switch (opcion){
                case 1:
                    objetocita.cita();
                    break;
                case 2:
                    objetodiag.Diagnostico();
                    break;
                case 3:
                    report1.report();
                case 4:
                     System.exit(0);
                
            }

    }
}