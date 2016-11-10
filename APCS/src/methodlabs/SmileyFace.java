package methodlabs;

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class SmileyFace extends Canvas
{
   public SmileyFace()    //constructor - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      smileyFace(window);
   }

   public void smileyFace( Graphics window )
   {
      window.setColor(Color.BLUE);
      window.drawString("SMILEY FACE LAB ", 35, 35);

      window.setColor(Color.YELLOW);
      window.fillOval( 210, 100, 400, 400 );
      
      window.setColor(Color.RED);
      window.fillOval( 250, 290, 45, 45 );
		
      window.setColor(Color.RED);
      window.fillOval( 525, 290, 45, 45 );
      
      window.setColor(Color.BLACK);
      window.fillOval( 450, 200, 60, 60 );
      
      window.setColor(Color.BLACK);
      window.fillOval( 300, 200, 60, 60 );
      
      window.setColor(Color.BLACK);
      window.drawArc( 320, 360, 180, 60, 180, 180);
      

      

   }
}