import processing.core.PApplet;

public class Sketch extends PApplet {
	
	/**
  * Description:
  * Write a program that utilizes your own variables to create a more dynamic drawing, draws objects in random locations, and uses if statements.
  * @author: Hosey K
  */
  
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(207, 244, 250);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {

  // Variables 
    
    
	// Drawing grass 
    fill(163, 230, 115);
    rect(width/-100, height/((float)100/89), width*(float)1.02, height/((float)20/3));
  
  // Drawing pathway
    fill(189, 189, 189);
    quad(width/(float)1.25, height, width/((float)100/77), height/((float)25/23), width/((float)100/59), height/((float)25/23), width/((float)25/14), height);
  
  // Drawing house base
    fill(242, 234, 203);
    rect(width/(float)6.25, height/((float)25/11), width/((float)10/7), height/((float)25/12)); 

  // Drawing window base
    fill(0, 0, 0);
    rect(width/4, height/((float)50/31), width/((float)20/3), height/((float)100/13)); 

  // Drawing window glass
    fill(255, 255, 255);
    rect(width/((float)50/13), height/((float)100/63), width/((float)50/3), height/20);

    fill(255, 255, 255);
    rect(width/((float)100/33), height/((float)100/63), width/((float)50/3), height/20);

    fill(255, 255, 255);
    rect(width/((float)50/13), height/((float)100/69), width/((float)50/3), height/20);

    fill(255, 255, 255);
    rect(width/((float)100/33), height/((float)100/69), width/((float)50/3), height/20);  
  
  // Drawing door 
    fill(156, 98, 17);
    rect(width/((float)100/59), height/((float)5/3), width/((float)50/9), height/(float)3.125);

  // Drawing door knob 
    fill(228, 235, 33);
    ellipse(width/((float)50/31), height/((float)100/79), width/25, height/25);

  // Drawing chimney
    fill(156, 98, 17);
    rect(width/((float)100/21), height/((float)100/13), width/((float)20/3), height/((float)100/29));
  
  // Drawing roof
    fill(156, 98, 17);
    triangle(width/((float)100/11), height/((float)100/47), width/((float)100/51), height/((float)25/3), width/((float)100/91), height/((float)100/47));  
  }
  
  // define other methods down here.
}