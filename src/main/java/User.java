public class User{
   private int dia;
   private int mes;
   private int año;

   User(int dia_,int mes_,int año_){
       dia=dia_;
       mes=mes_;
       año=año_;
   }
   public int getDia(){
       return dia;
   }
   public int getMes(){
    return mes;
   }
   public int getAño(){
    return año;
   }

}