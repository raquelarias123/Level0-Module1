package _03_if_else._4_tasty_tomato.tasty_tomato.images;
import processing.core.PApplet;

public class TastyTomato extends PApplet{

	public void draw() {
		background(255, 255, 255);
		noStroke();
		fill(150, 0, 0);
		ellipse (350,250, 200, 200);
		ellipse (275,250, 200, 200);
		fill(0,150,0);
		rect(305,145, 10, 30);
		fill(255, 255, 255);
		if (mousePressed) {
		ellipse(175, 250, 50, 50);
		}
}
	public static void main(String []args) {
		 TastyTomato vdom = new TastyTomato();
	        //PApplet.main("_02_colors.VennDiagram.VennDiagramOfMe");
	        PApplet.runSketch(new String[]{"Venn Diagram of Me"}, vdom);
	}
	public void settings() { 
		size(600, 600);
	}
	public void setup( ) { }
}