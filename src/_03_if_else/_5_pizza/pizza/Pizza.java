package _03_if_else._5_pizza.pizza;
import processing.core.PApplet;
import processing.core.PImage;

public class Pizza extends PApplet{
	PImage olive;
	PImage mushroom;
	PImage pepperoni;
	public void draw() {
		if(mousePressed && mouseButton==LEFT) {
			image(olive,mouseX-25,mouseY-25);
		}
		if(mousePressed && mouseButton==RIGHT) {
			image(mushroom, mouseX-25,mouseY-25);
		}
		if(mousePressed && mouseButton==CENTER) {
			image(pepperoni, mouseX-25,mouseY-25);
		}
	}
	
	public static void main(String[]args) {
		Pizza vdom = new Pizza();
        //PApplet.main("_02_colors.VennDiagram.VennDiagramOfMe");
        PApplet.runSketch(new String[]{"Pizza"}, vdom);
	}
	public void settings() {
		size(600, 600);
	}
	public void setup() {
		background (255, 255, 255);
		noStroke();
		fill(170,125,0);
		ellipse(300, 300, 300, 300);
		fill(210, 150, 0);
		ellipse(300, 300, 270, 270);
		olive = loadImage("src/_03_if_else/_5_pizza/pizza/olive.png");
		mushroom = loadImage("src/_03_if_else/_5_pizza/pizza/mushroom.png");
		pepperoni = loadImage("src/_03_if_else/_5_pizza/pizza/pepperoni.png");
		olive.resize(50, 50);
		mushroom.resize(50,50);
		pepperoni.resize(50,50);
	}
	
}
