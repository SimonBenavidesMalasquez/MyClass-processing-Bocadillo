package mylibrary.bocadillo;

import processing.core.PApplet;

public class Funciones_Processing {

	PApplet myParent ; 
	
    public Funciones_Processing( PApplet args ) {
  	  
    	myParent = args ; 
    }


    // FUNCIONES BASICAS : 
    public void line( float x0, float y0 , float xf, float yf ) {
    	myParent.line(x0, y0, xf, yf);
    }
    
    public void rect( float x, float y , float w , float h , float redondo ) {
    	myParent.rect(x, y, w, h, redondo); 
    }
    
    public void rect( float x, float y , float w , float h , float a, float b , float c , float d ) {
    	myParent.rect(x, y, w, h, a, b, c, d);
    }
    
    public int mouseX() { 
    	return myParent.mouseX ;
    }
    
    public int mouseY() { 
    	return myParent.mouseY ;
    }
    
    public void fill( int r, int g, int b , int op ) {
    	myParent.fill( r, g, b , op );
    }
    
    public void fill( int r, int g, int b  ) {
    	myParent.fill( r, g, b );
    }
    
    public void fill( int valor ) { 
    	myParent.fill(valor);
    }
    
    public void stroke( int r, int g, int b , int op ) {
    	myParent.stroke( r, g, b, op );
    }
    
    public void stroke( int r, int g, int b ) {
    	myParent.stroke(r,g,b);
    }
    
    public void stroke( int valor ) {
    	myParent.stroke(valor);
    }
    
    public void noStroke() {
    	myParent.noStroke();
    }
    
    public void noFill() {
    	myParent.noFill();
    }
    
    public void strokeWeight( float  valor ) {
    	myParent.strokeWeight(valor);
    }
    
    public void textSize( float valor ) {
    	myParent.textSize(valor);
    }
    
    public void textAlign( int valor ) {
    	myParent.textAlign(valor);
    }
    
    public int width() {
    	return myParent.width;
    }
    
    public int height() {
    	 return myParent.height ;
    }
    
    public void text( String texto , int x, int y ) {
    	myParent.text(texto, x, y);
    }
    
	@SuppressWarnings("static-access")
	public float Map( float valor , float a, float b , float c , float d ) {
    	return myParent.map( valor , a, b , c, d ); 
    }
  
    @SuppressWarnings("static-access")
	public float Constrain( float valor , float min , float max ) {
    	
    	return myParent.constrain( valor, min, max);
    }
	
	
	
}
