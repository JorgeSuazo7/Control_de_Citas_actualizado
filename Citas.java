
package control_citas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


public class Citas {

    Scanner scanner =new Scanner(System.in);
                 String[] datonombre = new String[99];
                 String[] datosmascota = new String[99];
                 LocalTime horaactual = LocalTime.now();
                 public String fechaString;
                 public String hora;
                 public String minutos;
                
                 
                 
    public void cita() throws ParseException {
                
        
                int opcion1;
                System.out.println("**********MENU CITAS*********");
                System.out.println("1---Agendar Cita");
                System.out.println("2---Re-Agendar Cita");
                System.out.println("3---Cancelar cita");
                System.out.println("4---Menu Incio");
                opcion1 = scanner.nextInt();
                switch(opcion1){
                    case 1:
                
                        AgendarCita();
                 
                     break;
                    
                    case 2:
                        
                        reagendar();
                    
                    break;
            
                    case 3:
                        cancelarcita();
                        
                        break;
                        
                    case 4:
                        cita();
                        
                        break;
                    
                }
    }

            public void AgendarCita() throws ParseException{
           
            Scanner scanner = new Scanner(System.in);
            System.out.println("*******AGENDAR CITA*******");
            System.out.println("-----------------Ingrese los Datos por favor-------------------");
           
            
            System.out.println("Ingrese el nombre del cliente");
            datonombre[0] = scanner.nextLine();
            
            System.out.println("Ingrese el nombre de la mascota");
            datosmascota[0] = scanner.nextLine();
            
            System.out.println("Ingrese la fecha de la cita");
             
               System.out.print("Ingrese fecha en el siguiente formato (yyyy-mm-dd): ");
              
            String fechaString = null;
            try{
            fechaString = scanner.nextLine();
              
                  SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

                   Date fecha = sdf.parse(fechaString);

                   Calendar calendario = Calendar.getInstance();

                   calendario.setTime(fecha);
                } catch (ParseException e)
                       {
                           System.out.println("\nEL FORMATO DE FECHA INGRESADO ES INCORRECTO\n");
                           System.out.println("----------------Intentanlo de nuevo------------------");
                       }
             
              System.out.println("Ingrese la hora de la cita");
              String hora24;
              System.out.print("Escriba la hora en formato 24H:");
             
               hora24=scanner.next();
               String[] horaminutos = hora24.split(":");
               String hora = horaminutos[0];
               String minutos = horaminutos[1];
         
               
            System.out.println("-------------------------------------------------------------------------------");
            System.out.println("***********Los Datos han sido Ingresados*********\n");
                 
                 System.out.println("Nombre del Cliente   :"+" "+datonombre[0]);
                 System.out.println("Nombre de la Mascota :"+" "+datosmascota[0]);
                 System.out.println("Fecha de la Cita     :"+" "+""+fechaString);
                 System.out.println("Hora de la Cita      :"+" "+hora +":"+minutos);
                 
                    
    }

    public void reagendar() throws ParseException {
        
        Scanner scanner = new Scanner(System.in);
        
      
            System.out.println("*******REAGENDAR CITA*******");
            System.out.println("-----------------Ingrese los nuevos Datos por favor-------------------");
           
            
            System.out.println("Ingrese el nombre del cliente");
            datonombre[1] = scanner.nextLine();
            
           
            System.out.println("Ingrese el nombre de la mascota");
            datosmascota[0] = scanner.nextLine();
            
            System.out.println("Ingrese la hora de la cita");
            
               String hora24;
               {
                    int fechaString = 0;
                    String[] datosfecha = new String[fechaString];
                }
               System.out.print("Escriba la hora en formato 24H:");
               
               hora24=scanner.next();
               String[] horaminutos = hora24.split(":");
               String hora = horaminutos[0];
               String minutos = horaminutos[1];
               
              
               
               System.out.print("Ingrese fecha en el siguiente formato (yyyy-mm-dd): ");
               String fechaString;
            
               fechaString = scanner.nextLine();

                  SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

                   Date fecha = sdf.parse(fechaString);

                   Calendar calendario = Calendar.getInstance();

                   calendario.setTime(fecha);
               
                }

    public void cancelarcita() {
        
        Scanner scanner = new Scanner(System.in);
        int op1; 
         System.out.println("Desea Cancelar la cita");
         System.out.println("Ingrese 1 o 2");
         System.out.println("1---SI");
         System.out.println("2---NO");
         
         op1 = scanner.nextInt();
    
           if(op1 == 1){  
               System.out.println("La Cita ha sido Cancelada");
           }
           else
           {
               System.out.println("La cita no ha sido Cancelada");
           }
    }

    public void reportecita() {
        
        System.out.println("R---------------------REPORTES DE CITAS-------------------------");
        
        System.out.println("Nombre del Cliente   :"+" "+datonombre[0]);
                 System.out.println("Nombre de la Mascota :"+" "+datosmascota[0]);
                 System.out.println("Fecha de la Cita     :"+" "+""+fechaString);
                 System.out.println("Hora de la Cita      :"+" "+hora +":"+minutos);
                 
                 if(datonombre[0] == null&&datosmascota[0]==null&&fechaString==null)
                 {
                     System.out.println("\nNose han ingresado datos aun"); 
                 }
    }


}
        
