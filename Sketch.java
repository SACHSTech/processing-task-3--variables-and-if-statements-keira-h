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

    // Variables 
    float pointX = random(0, 400);
    float pointY = random(0, 400);
    float pointWidth = random (350);
    float pointHeight = random (240);

    if (pointX <= 100 || pointY <= 100) {
      background(random(255));

      // House base
      fill(random(255), random(255), random(255));
      rect(pointX, pointY, 350, 240);

      // Window
      fill(random(255), random(255), random(255));
      rect(pointX - 275, pointY - 90, 75, 65);

      // Window glass
      fill(random(255), random(255), random(255));
      rect(pointX - 270, pointY - 85, pointWidth - 30, 25);

      fill(random(255), random(255), random(255));
      rect(pointX - 235, pointY - 85, 30, 25);

      fill(random(255), random(255), random(255));
      rect(pointX - 270, pointY - 55, 30, 25);

      fill(random(255), random(255), random(255));
      rect(pointX - 235, pointY - 55, 30, 25);

      // Door 
      fill(random(255), random(255), random(255));
      rect(pointX - 105, pointY - 100, 90, 160);

      // Door knob
      fill(random(255), random(255), random(255));
      rect(pointX - 90, pointY - 5, 20, 20);
      
    }  
    else if (pointX <= 200 || pointY <= 200) {
      background(207, 244, 250);

      // House base
      fill(random(255), random(255), random(255));
      rect(pointX, pointY, 350, 240);

      // Window
      fill(random(255), random(255), random(255));
      rect(pointX - 275, pointY - 90, 75, 65);

      // Window glass
      fill(random(255), random(255), random(255));
      rect(pointX - 270, pointY - 85, pointWidth - 30, 25);

      fill(random(255), random(255), random(255));
      rect(pointX - 235, pointY - 85, 30, 25);

      fill(random(255), random(255), random(255));
      rect(pointX - 270, pointY - 55, 30, 25);

      fill(random(255), random(255), random(255));
      rect(pointX - 235, pointY - 55, 30, 25);

      // Door 
      fill(random(255), random(255), random(255));
      rect(pointX - 105, pointY - 100, 90, 160);

      // Door knob
      fill(random(255), random(255), random(255));
      rect(pointX - 90, pointY - 5, 20, 20);
    }
    
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
  
  // Time
    int s = second(); 
    int m = minute(); 
    int h = hour();  
    //line(s, 0, s, 33);
    //line(m, 33, m, 66);
    //line(h, 66, h, 100);
  }
  
  // define other methods down here.
}