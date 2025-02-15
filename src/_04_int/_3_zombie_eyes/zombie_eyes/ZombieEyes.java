package _04_int._3_zombie_eyes.zombie_eyes;
import processing.core.PApplet;
import processing.core.PImage;

public class ZombieEyes extends PApplet {
	PImage zombie;
	public void draw() { 
		if (mousePressed) {
			System.out.println("Mouse:"+mouseX+ ", " + mouseY);
		}
		fill(mouseX/2, mouseY/2,190);
		ellipse(194, 77, 90, 90);
		ellipse(277, 67, 50,50);
		fill (0);
		ellipse(194,77,20,20);
		ellipse(277,67,20,20);
	}


	public static void main(String[]args){
		ZombieEyes vdom = new ZombieEyes();
		PApplet.runSketch(new String[]{"ZombieEyes"},  vdom);
	}
	
	public void settings() { 
		size(600,600);
	}
	
	public void setup() { 
		zombie = loadImage("src/_04_int/_3_zombie_eyes/zombie_eyes/zombiejava.jpg");
		zombie.resize(600,600);
		background(zombie);
	}
	
	}