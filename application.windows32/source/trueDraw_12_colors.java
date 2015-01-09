import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class trueDraw_12_colors extends PApplet {

public void setup(){
size(1000, 700); 
background(255, 255, 255);
stroke(153);
rect(0,0, 100, 100);
noStroke();
fill(255, 255, 255);
fill(255, 0 ,0);
rect(0, 0, 20, 20);
fill(0, 255,0);
rect(20, 0, 20, 20);
fill(0, 0, 255);
rect(40, 0, 20, 20);
fill(255,255,0);
rect(60, 0, 20, 20);
fill(255, 0, 255);
rect(0, 20, 20, 20);
fill(0, 0, 0);
rect(20, 20, 20, 20);
stroke(153);
fill(255, 255, 255);
rect(40, 20, 20, 20);
noStroke();
fill(66, 37, 24);
rect(60, 20, 20, 20);
fill(255, 165, 0);
rect(0, 40, 20, 20);
fill(153, 0, 153);
rect(20, 40, 20, 20);
fill(160, 160, 160);
rect(40, 40, 20, 20);
fill(0, 255, 255);
rect(60, 40, 20, 20);


}


/* 

Color plate

*/




public void draw() {
    
    noStroke();
    // the red box
    if(mousePressed && mouseX > 0 && mouseX < 20 && mouseY < 20 && mouseY > 0){
    
      fill(255, 0,0);
      
    }
    // the green box
    if(mousePressed && mouseX > 20 && mouseX < 40 && mouseY < 20 && mouseY > 0){
    
      fill(0, 255,0);
      
    }
    
    // the blue box
    if(mousePressed && mouseX > 40 && mouseX < 60 && mouseY < 20 && mouseY > 0){
    
      fill(0, 0,255);
      
    }
    //the yellow box
    if(mousePressed && mouseX < 80 && mouseX > 60 && mouseY < 20 && mouseY > 0){
    
      fill(255, 255, 0);
      
    }
    //new row
    // the light purple box
    if(mousePressed && mouseX > 0 && mouseX < 20 && mouseY < 40 && mouseY > 20){
    
      fill(255, 0, 255);
      
    }
    
    // the black box
    if(mousePressed && mouseX > 20 && mouseX < 40 && mouseY < 40 && mouseY > 20){
    
      fill(0, 0, 0);
      
    }
    
    // the white (eraser) box
    if(mousePressed && mouseX > 40 && mouseX < 60 && mouseY < 40 && mouseY > 20){
    
      fill(255, 255, 255);
      
    }
    
    // the brown box
    if(mousePressed && mouseX > 60 && mouseX < 80 && mouseY < 40 && mouseY > 20){
    
      fill(66, 37, 24);
      
    }
    // the orange box
    if(mousePressed && mouseX > 0 && mouseX < 20 && mouseY < 60 && mouseY > 40){
    
      fill(255, 165, 0);
      
    }
    // the purple box
    if(mousePressed && mouseX > 20 && mouseX < 40 && mouseY < 60 && mouseY > 40){
    
      fill(153, 0, 153);
      
    }
    // the gray box
    if(mousePressed && mouseX > 40 && mouseX < 60 && mouseY < 60 && mouseY > 40){
    
      fill(160, 160, 160);
      
    }
    // the aqua box
    if(mousePressed && mouseX > 60 && mouseX < 80 && mouseY < 60 && mouseY > 40){
    
      fill(0, 255, 255);
      
    }
    
  if(mousePressed && mouseX < 100 && mouseY < 100){
      
    } else {
    
      if(mouseButton==RIGHT && mousePressed) {
        rect(mouseX, mouseY, 30, 30);
        
      }
     if(mouseButton==LEFT && mousePressed) {
        ellipse(mouseX, mouseY, 30, 30);
        
      }
      /*if(keyCode == UP){
      
        background(255, 255, 255);
        stroke(153);
        rect(0,0, 100, 100);
        noStroke();
        fill(255, 255, 255);
        fill(255, 0 ,0);
        rect(0, 0, 20, 20);
        fill(0, 255,0);
        rect(20, 0, 20, 20);
        fill(0, 0, 255);
        rect(40, 0, 20, 20);
        fill(255,255,0);
        rect(60, 0, 20, 20);
        fill(255, 0, 255);
        rect(0, 20, 20, 20);
        fill(0, 0, 0);
        rect(20, 20, 20, 20);
      }
    */
    }

}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "trueDraw_12_colors" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
