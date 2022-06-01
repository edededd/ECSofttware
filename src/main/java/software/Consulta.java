package software;
import  java.time.DateTimeException;
import  java.util.zip.DataFormatException;
public class Consulta {
   private int dia;
   private int mes;
   private int anio;
   private User user;

   public Consulta(int dia1,int mes1,int anio1, User user1){
       dia=dia1;
       mes=mes1;
       anio=anio1;
       user=user1;
   }
   public int getDia(){
       return dia;
   }
   public int getMes(){
    return mes;
   }
   public int getAnio(){
    return anio;
   }

   public void anteriorNacimiento(){
    int difAge = anio-user.getAnio();
    int difMes= mes - user.getMes();
    int difDia= dia - user.getDia();
    String comment = "Haz colocado mal tu fecha de nacimiento, asegurate de que no sea despues de la fecha actual";
    if(difAge<0){throw new DateTimeException(comment);}
    else if(difAge==0){
        if(difMes < 0){throw new DateTimeException(comment);}
        else if(difMes==0 && difDia<0){
            throw new DateTimeException(comment);
        }
    }
   }

   public void correctoFormato(){
       String comment ="Haz tenido un error de escritura de tu fecha de nacimiento";
       if(user.getAnio()<1000 || user.getAnio()>2022 || anio<1000 || anio>2022){
        try {
            throw new DataFormatException(comment);
        } catch (DataFormatException e) {
            e.printStackTrace();
        }
       }
       if(user.getDia()>31 || user.getAnio() < 1 || dia>31 || dia <1){
        try {
            throw new DataFormatException(comment);
        } catch (DataFormatException e) {
            e.printStackTrace();
        }
       }
       if(user.getMes()>12 || user.getMes()<1 || mes>12 || mes<1){
        try {
            throw new DataFormatException(comment);
        } catch (DataFormatException e) {
            e.printStackTrace();
        }
       }
   }

   public int isOlder(){
       int difAge = anio-user.getAnio();
       int difMes= mes - user.getMes();
       int difDia= dia - user.getDia();
       correctoFormato();
       anteriorNacimiento();
       if(difAge > 18) return 1;
       else if(difAge ==18){
            if(difMes > 0) return 1;
            else if(difMes == 0){
               if(difDia >= 0) return 1;
               else return 0;
            }
            else return 0;
       }
       else return 0;
   }
}
