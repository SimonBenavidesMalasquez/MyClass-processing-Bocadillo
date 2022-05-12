package mylibrary.bocadillo;

import processing.core.*;


public class Clase_Crea_Bocadillo {
	
	// myParent is a reference to the parent sketch
	PApplet myParent;

    int x0 = 0 ;    int off_Set_x =    0 ;   
    int y0 = 0 ;    int off_Set_y = - 22 ;

    int ancho = 0 ;

    int off_Set_y_texto =  18 ;

    String   texto_main = "none" ;
    
    Funciones_Processing p ;

	public Clase_Crea_Bocadillo(PApplet theParent) {
		
		// Initialize : 
		myParent = theParent;
		
		p = new Funciones_Processing( myParent );
		
        // MENSAJE LIBRERIA 
        System.out.println("Load Library Simon : Clase Bocadillo Jumper / 12-may-2022 / 0-02" );
		
	}
	
    public void dibuja( boolean enable, int x , int y  , String in_texto ){

        if( enable == true ){ 

             // CONTIENE TEXTO : 
             if( in_texto.equals("") == false ){

                  texto_main = in_texto ;

                  set_position( x, y );

                  dibuja_cuadro_ON( x0, y0 );

                  texto_cuadro();
         
             // TEXTO = ""    ( vacio )
             }else{

                  texto_main = "Falta nombrar Net, Clic derecho" ; 

                  set_position( x, y ); 

                  dibuja_cuadro_OFF( x0, y0 ); 

                  texto_cuadro(); 

             }

        }

    }
    

    public void texto_cuadro(){

           p.textAlign(myParent.CENTER); p.textSize(14.0f); p.fill(250);
           p.text( texto_main , x0 + off_Set_x , y0 + off_Set_y + off_Set_y_texto );

    }
    
    public void dibuja_cuadro_ON( int x , int y ){
           
            // Asigna tamaño texto : para hacer minimo 5 
           int longitud_texto = asigna_longitud_text( texto_main );

           // Ancho cuadro
           ancho = (int)(longitud_texto*9.0) ;

           // Sombra cuadro 
           sombra_cuadro( x, y, ancho , 25 );

           // Cuadro main
           main_cuadro( x, y, ancho , 25 );


           //stroke(0,110,175); fill(25);     // azul
           //stroke(224,139,2); fill(25);     // amarillo dark
           //stroke(255,215,0); fill(25);     // amarillo
           
    }
    
    public void dibuja_cuadro_OFF( int x , int y ){
        
        // Asigna tamaño texto : para hacer minimo 5 
       int longitud_texto = asigna_longitud_text( texto_main );

       // Ancho cuadro
       ancho = (int)(longitud_texto*9.0) ;

       // Sombra cuadro 
       sombra_cuadro( x, y, ancho , 25 );


       x = (int)( x - ancho*0.5 );

       p.strokeWeight(1.5f);
       p.stroke(200,20,20); p.fill(100,10,10); 
       p.rect( x + off_Set_x, y + off_Set_y , ancho , 25 , 8 );
       p.strokeWeight(1.0f); 


       // Triangulito
       dibuja_triangulito( x, y , ancho , 25 , "red");

       //stroke(0,110,175); fill(25);     // azul
       //stroke(224,139,2); fill(25);     // amarillo dark
       //stroke(255,215,0); fill(25);     // amarillo
       
     }
    
      public void sombra_cuadro( int x, int  y , int w , int h ){

        x = (int)( x - w*0.5 );

        // El número -2 , 4 , se uso para agrandar cuadro y hacer la sombra
        p.strokeWeight(1.0f); 
        p.noStroke(); p.fill(60);
        p.rect( x - 2 + off_Set_x, y - 2 + off_Set_y , w + 4 , h + 4 , 8 );
        p.strokeWeight(1.0f); 
       
      }

      public void main_cuadro( int x, int  y , int w , int h ){
       
          x = (int)( x - w*0.5 );

          p.strokeWeight(1.5f);
          p.stroke(255,215,0); p.fill(25); 
          p.rect( x + off_Set_x, y + off_Set_y , w , h , 8 );
          p.strokeWeight(1.0f); 

          // Triangulito
          dibuja_triangulito( x, y , w , h , "yellow");

      }
      
      public void dibuja_triangulito( int x, int  y , int w , int h , String colorcito ){

          if( colorcito.equals("yellow") == true ){
        	  p.noStroke(); p.fill(255,215,0);
          }else if( colorcito.equals("red") == true ){
        	  p.noStroke(); p.fill( 200,20,20 );
          }


          myParent.beginShape();
          myParent.vertex( x + w*0.5f - 10 + off_Set_x, y + h + off_Set_y);
          myParent.vertex( x + w*0.5f + 10 + off_Set_x, y + h + off_Set_y);
          myParent.vertex( x + w*0.5f + off_Set_x, y + h  + 10 + off_Set_y);

          myParent.vertex( x + w*0.5f - 10 + off_Set_x, y + h + off_Set_y);
          myParent.endShape();

      }

      public int asigna_longitud_text( String in_texto ){
         
          int longitud_texto = 0 ;

          if( in_texto.length() <= 10 ){
              longitud_texto = 10 ;
          }else if( in_texto.length() > 10 ){
              longitud_texto = in_texto.length() ;
          }

          return longitud_texto ;
   
      }
      
      // --------------------------------------------------------------------
      //                         ABSTRACCIÓN 

      public void set_position( int x, int y ){

      	  x0 = x + off_Set_x ;
      	  y0 = y + off_Set_y ;

      }

      public int getWidthMediun(){
          return (int)(ancho*0.5);
      }
     
      public int getY0(){
          return (y0 + off_Set_y ) ;
      }
	

}














