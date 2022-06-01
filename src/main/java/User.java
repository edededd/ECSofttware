public class User{
   private int dia;
   private int mes;
   private int anio;

   User(int _dia,int _mes,int _anio){
       dia=_dia;
       mes=_mes;
       anio=_anio;
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