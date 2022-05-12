
public class MyClass{

     Clase_Crea_Bocadillo bocadito ;

     public MyClass( PApplet app ){
 
        bocadito = new Clase_Crea_Bocadillo(app);

     }

     public void show(){


        bocadito.dibuja(true, mouseX, mouseY, "prueba B ");

        



     }













}