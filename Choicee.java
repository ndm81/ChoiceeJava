import java.awt.*;
class Choicee{
	Choicee(){
		Frame f=new Frame();
		Choice c=new Choice();
		c.setBounds(80,100,100,30);
		c.add("Ice Cream");
		c.add("Coffee");
		c.add("Cold Coffee");
		c.add("Cold Drink");
		c.add("Shake");
		f.add(c); 
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main (String[] args) {
		new Choicee();
	}
}