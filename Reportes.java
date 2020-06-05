
package control_citas;

import java.text.ParseException;
import java.util.Scanner;


public class Reportes {
    
    public void report() throws ParseException{
        Citas report1 = new Citas();
        Diagnosticos diagnost1 = new Diagnosticos();
        MenuPrincipal objetMenu1 = new MenuPrincipal();
        Scanner scanner =new Scanner(System.in);
       
        System.out.println("---------------REPORTES------------------\n");
        System.out.println("**********MENU REPORTES**********");
                System.out.println("1---Reporte Citas");
                System.out.println("2---Reporte Diagnostico");
                System.out.println("4---Menu Incio");
                int num = scanner.nextInt();
                
                switch (num)
                {
                    case 1:
                      report1.reportecita();
                      
                      break;
                    case 2:
                       diagnost1.reporteDiagnos();
                       break;
                    case 3:
                        objetMenu1.Menu();
                }
    }
    
}
