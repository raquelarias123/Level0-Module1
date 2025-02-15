package _05_for_loops._4_banana_split.banana_split;
import processing.core.PApplet;

public class BananaSplit extends PApplet {

public static void main(String[]args) {
	BananaSplit vdom = new BananaSplit();
	PApplet.runSketch(new String[] {"BananaSplit"}, vdom);
}

public void settings() {
	size(100,100);
	
}

public void setup() {
	
}

public void draw() {
	for(int icecream=0; icecream<3; icecream++) {
		text("icecream", 50,50+icecream*5);
	}
	text("banana", 50,3*5+50);
	
}

}