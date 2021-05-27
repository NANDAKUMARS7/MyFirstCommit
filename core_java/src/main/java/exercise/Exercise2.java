package exercise;
// Button for street lights like red , green and yellow
import java.awt.*;
public class Exercise2 {

	public static void main(String[] args) {
		Frame f=new Frame("Button Example");  
	    Button a=new Button("RED");  
	     a.setBounds(50,100,80,30);  
	    f.add(a); 
	    f.setSize(400,400);  
	    f.setLayout(null);  
	    f.setVisible(true); 
	    
	    Frame y=new Frame("Button Example");
	    Button b=new Button("Yellow");
	    b.setBounds(50,100,80,30);  
	    y.add(b); 
	    y.setSize(400,400);  
	    y.setLayout(null);  
	    y.setVisible(true); 
	    
	    Frame g=new Frame("Button Example");
	    Button c=new Button("Green");
	    c.setBounds(50,100,80,30);  
	    g.add(c); 
	    g.setSize(400,400);  
	    g.setLayout(null);  
	    g.setVisible(true); 
	}

}
