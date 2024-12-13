package mylibrary.bocadillo;

import processing.core.*;

// INICIO : 12-may-2022

public class Clase_Crea_Bocadillo {
	
	    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
	    PApplet p ;

      int        x0 =    0 ;  
      int        y0 =    0 ;   
      int   offSetY = - 22 ;
      int width_Box =    0 ;
    
      int      tema = 1 ; 

      String texto_secundary = "data ts" ; 
      int          dy_text_B = 0 ; 

	    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
      public Clase_Crea_Bocadillo(PApplet theParent){                                          
		
		      p = theParent;

	    }
	
      // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
      // MODO 1 :                                ( conservar esta funcion, se usa para otros tools ) 
      public void dibuja( boolean enable, int x , int y  , String in_texto ){                   
    
            if( enable == true ){ 
    
                 // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
                 // CONTIENE TEXTO : 
                 if( in_texto.equals("") == false ){
    
                      // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
                      // POSICION 
                      x0 = x ; 
                      y0 = y + offSetY ;

                      // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
                      // DESPLAZA FILA 1 MAS ARRIBA , PARA PONER FILA 2 ABAJO 
                      dy_text_B = 0 ; 

                      // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
                      // CUADRO 
                      cuadro( in_texto ); // , x0, y0 );
                      
                      // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
                      // TEXTO
                      p.textAlign(p.CENTER); p.textSize(14.0f); p.fill(255);
                      p.text( in_texto , x0  , y0 + offSetY + 18 );
    
                 }
            }
    
      } 

      // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
      // MODO 2 : 
      public void dibuja( boolean enable, int x , int y  , String in_texto , String texto_fila_2 ){                   
    
            if( enable == true ){ 
    
                 // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
                 // CONTIENE TEXTO : 
                 if( in_texto.equals("") == false ){ 
    
                      // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
                      // POSICION 
                      x0 = x ; 
                      y0 = y + offSetY ;

                      // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
                      // SEGUNDA FILA 
                      segunda_fila_texto( texto_fila_2 );

                      // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
                      // CUADRO 
                      cuadro( in_texto ); // , x0, y0 );
                      
                      // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
                      // TEXTO
                      p.textAlign(p.CENTER); p.textSize(14.0f); p.fill(255);
                      p.text( in_texto , x0  , y0 + offSetY + 18 + dy_text_B );

    
                 }
            }
    
      } 

      // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
      // tema de segunda fila 
      private void segunda_fila_texto( String texto_secundary ){
 

                      // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
                      // DESPLAZA FILA 1 MAS ARRIBA , PARA PONER FILA 2 ABAJO 
                      this.texto_secundary = texto_secundary.trim() ; 

                      if( texto_secundary.length() > 0 ){ 
                        dy_text_B = - 23 ; 
                      }else{
                        dy_text_B = 0 ; 
                      }

                      // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
                      // DESPLAZA FILA 1 MAS ARRIBA , PARA PONER FILA 2 ABAJO 
                      this.texto_secundary = texto_secundary.trim() ; 

                      if( texto_secundary.length() > 0 ){ 
                        dy_text_B = - 25 ; 
                      }else{
                        dy_text_B = 0 ; 
                      }
    
                      // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
                      // TEXTO FILA 2 ACTIVADO : 
                      if( dy_text_B != 0 ){

                            // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
                            // Asigna tamaño texto : para hacer minimo 5 
                            p.textSize(14.0f);
                            int ancho_text_b =(int) p.textWidth( texto_secundary ) + 20 ; 

                            p.strokeWeight(1.5f); p.stroke(20); p.fill(30,100); p.stroke(100) ; p.fill(110);
                            p.rect( x0 - ancho_text_b*0.5f , y0 + offSetY , ancho_text_b , 25 , 4 );
                            p.strokeWeight(1.0f); 

                            p.textAlign(p.CENTER); p.textSize(14.0f); p.fill(255); 
                            p.text( texto_secundary , x0  , y0 + offSetY + 18 );

                      }

      }
    
      // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
      public void cuadro( String texto ){ //, int x , int y ){                                        
            
           // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
           // Asigna tamaño texto : para hacer minimo 5 
           p.textSize(14.0f);
           width_Box =(int) p.textWidth(texto) + 20 ; 

           // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
           // Triangulito
           triangulo     ( x0 - (int)(width_Box*0.5f), y0 , width_Box , 25 , tema );
           
           // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
           // Sombra cuadro 
           //sombra_cuadro ( x0, y0 + dy_text_B , width_Box , 25 , tema );

           // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
           // Cuadro main
           main_cuadro   ( x0, y0 + dy_text_B , width_Box , 25 , tema ); 
  
      }
    
      // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
      public void sombra_cuadro( int x, int  y , int w , int h , int tema ){                    

          // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
          x = (int)( x - w*0.5 );

          // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
          // GROSOR 
          p.strokeWeight(1.0f); p.noStroke(); p.fill(60); 

          // El número -2 , 4 , se uso para agrandar cuadro y hacer la sombra
          // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
          switch( tema ){

              case 1 : p.noStroke(); p.fill(60);  break ;
              case 2 : p.noStroke(); p.fill(60);  break ;
              case 3 : p.noStroke(); p.fill(60);  break ;

          }
          
          // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
          // GROSOR DE BORDE Y CUADRO 
          p.rect( x - 2 , y - 2 + offSetY , w + 4 , h + 4 , 8 );
          p.strokeWeight(1.0f); 
       
      }

      // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
      public void main_cuadro( int x, int  y , int w , int h , int tema ){                      
       
          // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
          // POSICION X 
          x = (int)( x - w*0.5 );

          // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
          // DEFAULT 
          p.strokeWeight(1.5f); p.stroke(255,215,0); p.fill(25);  

          // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
          // TEMA :                                      ( STROKE + FILL )  
          switch( tema ){

              case 1 : p.strokeWeight(1.5f);   p.stroke(255,215,0);     p.fill(25);         break ;
              case 2 : p.strokeWeight(1.5f);   p.stroke(0,150,220);     p.fill(35);         break ;
              case 3 : p.strokeWeight(1.5f);   p.stroke(120,120,120);   p.fill(25);         break ;
              case 4 : p.strokeWeight(1.5f);   p.stroke(80);            p.fill(10,170,85);  break ;
              case 5 : p.strokeWeight(1.5f);   p.stroke(80);            p.fill(220,140,0);  break ;

          }
          
          // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
          // GROSOR DE BORDE Y CUADRO 
          p.rect( x , y + offSetY , w , h , 8 );
          p.strokeWeight(1.0f); 

      }
      
      // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
      public void triangulo( int x, int  y , int w , int h , int tema ){                        


          // TEMA 
          /*switch( tema ){

              case 1 : p.noStroke(); p.fill(255,215,0);  break ;
              case 2 : p.noStroke(); p.fill(0,150,220);  break ;
              case 3 : p.noStroke(); p.fill(120,120,120);  break ;
             
              default : p.noStroke(); p.fill(255,215,0); 
          }*/
          
          p.noStroke(); p.fill(120,120,120);

          // Triangulito 
          p.beginShape();
          p.vertex( x + w*0.5f - 10 , y + h + offSetY );
          p.vertex( x + w*0.5f + 10 , y + h + offSetY );
          p.vertex( x + w*0.5f      , y + h + 10 + offSetY );

          p.vertex( x + w*0.5f - 10 , y + h + offSetY );
          p.endShape();

      }
     
      // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
      public int getWidthMediun(){                                                              
         
          return (int)(width_Box*0.5);
      
      }
     
      // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
      public int getY0(){                                                                       
       
          return ( y0 + offSetY ) ;
   
      }
      
      // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
      public void setTema( int inTema ){                                                        
    
    	  tema = inTema ;
     
      }
	   
      public void setTextSecondary( String texto_secundary ){

          this.texto_secundary = texto_secundary ; 

      }

}














