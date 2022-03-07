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
    size(500, 500);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    
    // Creating Varibales 
    float pointX = random(0, 400);
    float pointY = random(0, 400);
    
    if (pointX <= 100 || pointY <= 100) {
      // Creating background
      background(255, 255, 255);

      // House base
      fill(random(255), random(255), random(255));
      rect(pointX - 240, pointY - 180, 175, 120);

      // Window
      fill(random(255), random(255), random(255));
      rect(pointX - 220, pointY - 130, 38, 33);

      // Window glass
      fill(random(255), random(255), random(255));
      rect(pointX - 218, pointY - 128, 15, 13);

      fill(random(255), random(255), random(255));
      rect(pointX - 200, pointY - 128, 15, 13);

      fill(random(255), random(255), random(255));
      rect(pointX - 218, pointY - 113, 15, 13);

      fill(random(255), random(255), random(255));
      rect(pointX - 200, pointY - 113, 15, 13);

      // Door 
      fill(random(255), random(255), random(255));
      rect(pointX - 135, pointY - 140, 45, 80);

      // Door knob
      fill(random(255), random(255), random(255));
      ellipse(pointX - 127, pointY - 95, 10, 10);

      // Roof
      fill(random(255), random(255), random(255));
      triangle(pointX - 255, pointY - 180, pointX - 152, pointY - 280, pointX - 50, pointY - 180);
    }  
    
    else {
      // Creating background
      background(255, 255, 255);
      
      // House base
      fill(random(255), random(255), random(255));
      rect(pointX - 240, pointY - 180, 175, 120);

      // Window
      fill(random(255), random(255), random(255));
      rect(pointX - 220, pointY - 130, 38, 34);

      // Window glass
      fill(random(255), random(255), random(255));
      rect(pointX - 218, pointY - 128, 15, 13);

      fill(random(255), random(255), random(255));
      rect(pointX - 200, pointY - 128, 15, 13);

      fill(random(255), random(255), random(255));
      rect(pointX - 218, pointY - 113, 15, 13);

      fill(random(255), random(255), random(255));
      rect(pointX - 200, pointY - 113, 15, 13);

      // Door 
      fill(random(255), random(255), random(255));
      rect(pointX - 135, pointY - 140, 45, 80);

      // Door knob
      fill(random(255), random(255), random(255));
      ellipse(pointX - 127, pointY - 95, 10, 10);

      // Roof
      fill(random(255), random(255), random(255));
      triangle(pointX - 255, pointY - 180, pointX - 152, pointY - 280, pointX - 50, pointY - 180);
    }
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
  
  // Time variables
    int sec = second(); 
    int min = minute(); 
    int hour = hour() - 5;  
    String time = hour + ":" + min + ":" + sec; 

  // Time output
    textSize(25);
    fill(0, 0, 0);
    text(time, 200, 450);
    noLoop();
    
  }
}
