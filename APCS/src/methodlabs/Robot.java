package methodlabs;

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

class Robot extends Canvas
{
   public Robot()    
   {
      setSize(800,600);
      setBackground(Color.WHITE);   	
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      window.setColor(Color.BLUE);

      window.drawString("Robot LAB ", 35, 35 );
      
   }

   public void head( Graphics window )
   {
      window.setColor(Color.BLACK);

      window.fillRect(300, 100, 200, 200);
      
      window.setColor(Color.RED);

      window.fillRect(330, 160, 25, 25);
		
				
   }

   public void upperBody( Graphics window )
   {

		//add more code here
   }

   public void lowerBody( Graphics window )
   {

		//add more code here

   }
}