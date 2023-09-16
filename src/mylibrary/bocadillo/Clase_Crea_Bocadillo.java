package mylibrary.bocadillo;

import processing.core.*;

// INICIO : 12-may-2022

public class Clase_Crea_Bocadillo {
	
	// myParent is a reference to the parent sketch
	PApplet p;

        int      x0 = 0 ;  
        int      y0 = 0 ;   
        int offSetY = - 22 ;
        int width_Box = 0 ;
    
        int tema = 1 ; 
    
	  public Clase_Crea_Bocadillo(PApplet theParent) {
		
		    p = theParent;
		
	  }
	
        public void dibuja( boolean enable, int x , int y  , String in_texto ){
    
            if( enable == true ){ 
    
                 // CONTIENE TEXTO : 
                 if( in_texto.equals("") == false ){
    
                      x0 = x  ;
                      y0 = y + offSetY ;
    
                      cuadro( in_texto , x0, y0 );
                      
                      // TEXTO
                      p.textAlign(p.CENTER); p.textSize(14.0f); p.fill(250);
                      p.text( in_texto , x0  , y0 + offSetY + 18 );
    
                 }
            }
    
        }
    
    
      public void cuadro( String texto, int x , int y ){
           
           // Asigna tamaño texto : para hacer minimo 5 
           p.textSize(14.0f);
           width_Box =(int) p.textWidth(texto) + 20 ; //    asigna_longitud_text( texto );

           // Sombra cuadro 
           sombra_cuadro( x, y, width_Box , 25 , tema );

           // Cuadro main
           main_cuadro( x, y, width_Box , 25 , tema );

           // Triangulito
           triangulo( x - (int)(width_Box*0.5f), y , width_Box , 25 , tema );

           //stroke(0,110,175); fill(25);     // azul
           //stroke(224,139,2); fill(25);     // amarillo dark
           //stroke(255,215,0); fill(25);     // amarillo
           
      }
    
      public void sombra_cuadro( int x, int  y , int w , int h , int tema ){                            

          x = (int)( x - w*0.5 );

          // El número -2 , 4 , se uso para agrandar cuadro y hacer la sombra


          switch( tema ){

              case 1 : p.noStroke(); p.fill(60);  break ;
              case 2 : p.noStroke(); p.fill(60);  break ;
              case 3 : p.noStroke(); p.fill(60);  break ;
             
              default :  p.noStroke(); p.fill(60); 
          }

          p.strokeWeight(1.0f); 
          p.rect( x - 2 , y - 2 + offSetY , w + 4 , h + 4 , 8 );
          p.strokeWeight(1.0f); 
       
      }

      public void main_cuadro( int x, int  y , int w , int h , int tema ){                              
       
          x = (int)( x - w*0.5 );
          
          // TEMA 
          switch( tema ){

              case 1 : p.stroke(255,215,0); p.fill(25);  break ;
              case 2 : p.stroke(0,150,220); p.fill(35);  break ;
              case 3 : p.stroke(120,120,120); p.fill(25);  break ;
             
              default :  p.stroke(255,215,0); p.fill(25);  
          }
  
          p.strokeWeight(1.5f);
          p.rect( x , y + offSetY , w , h , 8 );
          p.strokeWeight(1.0f); 

      }
      
      public void triangulo( int x, int  y , int w , int h , int tema ){


          // TEMA 
          switch( tema ){

              case 1 : p.noStroke(); p.fill(255,215,0);  break ;
              case 2 : p.noStroke(); p.fill(0,150,220);  break ;
              case 3 : p.noStroke(); p.fill(120,120,120);  break ;
             
              default : p.noStroke(); p.fill(255,215,0); 
          }

          // Triangulito 
          p.beginShape();
          p.vertex( x + w*0.5f - 10 , y + h + offSetY );
          p.vertex( x + w*0.5f + 10 , y + h + offSetY );
          p.vertex( x + w*0.5f      , y + h + 10 + offSetY );

          p.vertex( x + w*0.5f - 10 , y + h + offSetY );
          p.endShape();

      }

      public int getWidthMediun(){
          return (int)(width_Box*0.5);
      }
     
      public int getY0(){
          return ( y0 + offSetY ) ;
      }
      
      public void setTema( int inTema ) {
    	  tema = inTema ;
      }
	

}














