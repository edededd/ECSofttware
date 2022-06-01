package software;
public class User{
   private int dia;
   private int mes;
   private int anio;

   public User(int dia1,int mes1,int anio1){
       dia=dia1;
       mes=mes1;
       anio=anio1;
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

}