import mylibrary.bocadillo.*;

Clase_Crea_Bocadillo bocadillo ;

//MyClass clase ; 

void setup() {
  
   size(400,400);
  
   bocadillo = new Clase_Crea_Bocadillo(this);

   //clase = new MyClass(this);

}

void draw() {
  
    background(0);

    bocadillo.dibuja(true, mouseX, mouseY, "prueba A");
    
    //clase.show();
}