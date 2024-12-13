import mylibrary.bocadillo.*;

Clase_Crea_Bocadillo bocadillo ;

//MyClass clase ;

PImage fondo = null ; 
String texto = "data of first example" ; 

void setup() {
  
   size(400,400);
   
   try{
     fondo = loadImage("data/img 150824.png");
   }catch( Exception e ){
   
   }
   
   bocadillo = new Clase_Crea_Bocadillo(this);
   bocadillo.setTema(4);
   //clase = new MyClass(this);

}

void draw(){
  
    background(0);
    
    tint(255,100);
    image( fondo,0,0);
    tint(255);
    
    bocadillo.dibuja(true, 150, 150, texto , "second row" ); 
    
    //clase.show();
    
    textSize(14); fill(200); textAlign(LEFT);
    text("x : " + mouseX + "    y : " + mouseY , 20 , height - 30 );
}

void keyPressed(){
  
     if( int(key) == 8 ){
         texto = "" ; 
     }else{
        texto = texto + key ;
     }
  
}