package chartbar;

/**
 *
 * @author Harnish 3/30/11
 */

	import java.awt.*;
	import java.awt.geom.*; //for the class Rectangle2D
	import javax.swing.*;

	public class Main extends JFrame
	{
	   //to store the inputs, and the max among them
	   private double one, two, three, four, max;

	   // constructor prompts the users for the 4 inputs
	   public Main()
	   {
	      //set title for the window
	      super( "Bar Graph Drawing" );

	      String input = ""; //store the input values

	      // reads the first input
	      input = JOptionPane.showInputDialog(
	          "Enter first number:" );
	      //need to convert to numeric value for calculation
	      one = Double.parseDouble( input );

	      // reads the second input
	      input  = JOptionPane.showInputDialog(
	          "Enter second number:" );
	      //need to convert to numeric value for calculation
	      two = Double.parseDouble( input );

	      // reads the third input
	      input  = JOptionPane.showInputDialog(
	          "Enter third number:" );
	      //need to convert to numeric value for calculation
	      three = Double.parseDouble( input );

	      // reads the fourth input
	      input  = JOptionPane.showInputDialog(
	          "Enter fourth number:" );
	      //need to convert to numeric value for calculation
	      four = Double.parseDouble( input );

	      // find the maximum
	      max = ( one > two ? one : two );
	      max = ( max > three ? max : three );
	      max = ( max > four ? max : four );

	      // set the size of the window and let it be visible
	      setSize( 350, 450 );
	      setVisible( true );
	   }

	   // Draw bars of the chart
	   // scale each bar by the maximum value
	   // The method 'paint' will be executed right away after the constructor

	   public void paint( Graphics g )
             {
	      super.paint( g );

	      // creates a 2D object to draw
	      Graphics2D g2d = ( Graphics2D )g;

	      // set color and draw the bar for the first input
	      g2d.setColor( Color.red );
	      g2d.fill( new Rectangle2D.Double( 25, 250 - 200 *
	         one / max, 50, 200 * one / max ) );

	      // set color and draw the bar for the second input
	      g2d.setColor( Color.blue );
	      g2d.fill( new Rectangle2D.Double( 95, 250 - 200 *
                      two / max, 50, 200 * two / max ) );

	      // set color and draw the bar for the third input
	      g2d.setColor( Color.green );
	      g2d.fill( new Rectangle2D.Double( 165, 250 - 200 *
	         three / max, 50, 200 * three / max ) );

	      // set color and draw the bar for the fourth input
	      g2d.setColor( Color.yellow );
	      g2d.fill( new Rectangle2D.Double( 235, 250 - 200 *
	         four / max, 50, 200 * four / max ) );

	    // set the legends of the bar chart
	      g2d.setColor( Color.black );
	      g2d.drawString("Legend: ", 20, 280);

	      g2d.setColor( Color.red );
	      g2d.fillRect(170, 300, 50, 10);
	      g2d.setColor( Color.black );
	      g2d.drawString("First Bar: " + one, 20, 310);

	      g2d.setColor( Color.blue );
	      g2d.fillRect(170, 330, 50, 10);
	      g2d.setColor( Color.black );
	      g2d.drawString("Second Bar: " + two, 20, 340);

	      g2d.setColor( Color.green );
	      g2d.fillRect(170, 360, 50, 10);
	      g2d.setColor( Color.black );
	      g2d.drawString("Third Bar: " + three, 20, 370);

	      g2d.setColor( Color.yellow );
	      g2d.fillRect(170, 390, 50, 10);
	      g2d.setColor( Color.black );
	      g2d.drawString("Fourth Bar: " + four, 20, 400);

             }

	   public static void main( String args[] )
	   {
	      //create an object so the constructor of the class will be called
	      Main bar = new Main();
	      bar.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	      bar.setResizable(false);
             }

	}