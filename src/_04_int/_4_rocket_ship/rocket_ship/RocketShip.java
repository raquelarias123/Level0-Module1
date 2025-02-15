package _04_int._4_rocket_ship.rocket_ship;
import processing.core.PApplet;
import processing.core.PImage;

public class RocketShip extends PApplet{
	int x = 400; 
	int y = 600; 
	

public static void main(String[]args) {
	RocketShip vdom = new RocketShip();
	PApplet.runSketch(new String[] {"RocketShip"}, vdom);
}

public void settings() {
	size(800, 800);
}

public void setup() {
	
}

public void draw() {
    background(0, 0, 40); 
    fill(random(255), 0, 0);
    ellipse(x, y + 130, 90, 90);
    fill(248, 128, 0);
    ellipse(x, y + 115, 70, 70);
    fill(255, 153, 0);
    ellipse(x, y + 95, 35, 35);
    fill(100, 100, 100);
    triangle(x, y + 10, x + 50, y + 100, x - 50, y + 100);
    
    if (mousePressed) {
    	y-=7;
    }
    else {
    	y+=7;
    }
    

}


}