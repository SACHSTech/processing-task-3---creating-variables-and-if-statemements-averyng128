/**
 * A program that shows the time and a cloud in a random position and background changes colour accordingly
 * @author: A. Ng
 * 
 */

import processing.core.PApplet;

public class Sketch extends PApplet {
	


  public void settings() {
	// put your size call here
    size(400, 400);
  }


  public void setup() {
    background(210, 255, 300);
  }


  public void draw() {
	  
    //declare variables
    float floatCircleX;
    float floatCircleY;
    float floatSize;
    float floatDistance;
    int intH;
    int intM;
    int intS;
    String stringTime;
    
    // define variables, random position for circle 1 of the cloud
    floatCircleX = random(20, width - 65); 
    floatCircleY = random(20, height - 15);
    floatSize = 20;
    floatDistance = floatSize / 20 ;

    // if statement to change colour of background if cloud is in bottom left
    if (floatCircleX < width / 2 && floatCircleY > height / 2) {
      background(150, 80, 120);
    }

    // if statement to change colour of background if cloud is in bottom right
    if (floatCircleX > width / 2 && floatCircleY > height / 2) {
      background(100, 100, 150);
    }

    // if statement to change colour of background if cloud is in top left
    if (floatCircleX < width / 2 && floatCircleY < height / 2) {
      background(100, 150, 130);
    }

    // if statement to change colour of background if cloud is in top right
    if (floatCircleX > width / 2 && floatCircleY < height / 2) {
      background(185, 200, 150);
    }

    // if statement to change colour of background if cloud is in the middle
    if (floatCircleX == width / 2 || floatCircleY == height / 2) {
      background(100, 100, 100);
    }

    // draw cloud
    fill(230);
    noStroke();
    ellipse(floatCircleX, floatCircleY, floatSize, floatSize);
    ellipse(floatCircleX + floatDistance * 15, floatCircleY - floatDistance * 10, floatSize, floatSize);
    ellipse(floatCircleX + floatDistance * 12, floatCircleY + floatDistance * 10, floatSize, floatSize);
    ellipse(floatCircleX + floatDistance * 25, floatCircleY - floatDistance * 5, floatSize, floatSize);
    ellipse(floatCircleX + floatDistance * 25, floatCircleY + floatDistance * 15, floatSize, floatSize);
    ellipse(floatCircleX + floatDistance * 40, floatCircleY - floatDistance * 8, floatSize, floatSize);
    ellipse(floatCircleX + floatDistance * 40, floatCircleY + floatDistance * 12, floatSize, floatSize);
    ellipse(floatCircleX + floatDistance * 55, floatCircleY - floatDistance * 2, floatSize, floatSize);
    ellipse(floatCircleX + floatDistance * 55, floatCircleY + floatDistance * 18, floatSize, floatSize);
    ellipse(floatCircleX + floatDistance * 65, floatCircleY + floatDistance * 10, floatSize, floatSize);
    ellipse(floatCircleX + floatDistance * 33, floatCircleY + floatDistance * 8, floatSize, floatSize);
    ellipse(floatCircleX + floatDistance * 17, floatCircleY - floatDistance * 2, floatSize, floatSize);
    ellipse(floatCircleX + floatDistance * 50, floatCircleY + floatDistance * 5, floatSize, floatSize);
    noLoop();

    // define time variables
    intS = second();   
    intM = minute(); 
    intH = hour();

    // declare time 
    stringTime = intH + " : " + intM + " : " + intS;

    // turn single digit numbers into double digits
    if (intS <= 9) {
      stringTime = intH + " : " + intM + " : 0" + intS;
    }
    if (intM <= 9) {
      stringTime = intH + " : 0" + intM + " : " + intS;
    }
    if (intH <= 9) {
      stringTime = "0" + intH + " : " + intM + " : " + intS;
    }

    // print time
    fill(255);
    textSize(20);
    text(stringTime, width / 2, height / 2);
  }
  

}