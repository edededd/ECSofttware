package software;
import  java.time.DateTimeException;
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
    if(difAge<0 || (difAge==0 && difMes <0) || (difAge==0 && difMes==0 && difDia<0)){throw new DateTimeException(comment);}
    }

   public void correctoFormato(){
       String comment ="Haz tenido un error de escritura de tu fecha de nacimiento";
       // if(user.getAnio()<1000 || user.getAnio()>2022 || anio<1000 || anio>2022) throw new DateTimeException(comment);
       if(user.getAnio()<1000) throw new DateTimeException(comment);
       if(user.getAnio()>2022) throw new DateTimeException(comment);
       /*if(anio<1000) throw new DateTimeException(comment);
       if(anio>2022) throw new DateTimeException(comment);
       if(user.getDia()>31) throw new DateTimeException(comment);
       if(user.getDia()<1) throw new DateTimeException(comment);
       if(dia>31) throw new DateTimeException(comment);
       if(dia<1) throw new DateTimeException(comment);
       if(user.getMes()>12) throw new DateTimeException(comment);
       if(user.getMes()<1) throw new DateTimeException(comment);
       if(mes>12) throw new DateTimeException(comment);
       if(mes<1) throw new DateTimeException(comment);*/
       //return;
       // if(user.getDia()>31 || user.getDia() < 1 || dia>31 || dia <1) throw new DateTimeException(comment);
       // if(user.getMes()>12 || user.getMes()<1 || mes>12 || mes<1) throw new DateTimeException(comment);
   }

   public int isOlder(){
       int difAge = anio-user.getAnio();
       int difMes= mes - user.getMes();
       int difDia= dia - user.getDia();
       correctoFormato();
       anteriorNacimiento();
       if(difAge > 18 || (difAge==18 && difMes>0) || (difAge==18 && difMes==0 && difDia>=0)) return 1;
       return 0;
   }
}
