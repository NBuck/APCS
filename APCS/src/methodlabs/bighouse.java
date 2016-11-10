package methodlabs;

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class bighouse extends Canvas
{
   public bighouse()  
   {
      setSize(800,600);
      setBackground(Color.WHITE);
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      bigHouse(window);
   }

   public void bigHouse( Graphics window )
   {
      window.setColor(Color.BLUE);

      window.drawString( "BIG HOUSE ", 50, 50 );

      window.setColor(Color.BLUE);

      window.fillRect( 200, 200, 400, 400 );
      
      window.setColor(Color.WHITE);

      window.fillRect(350, 420, 70, 160);
      
      window.setColor(Color.WHITE);
      
      window.fillRect(250, 250, 70, 70);
      
      window.setColor(Color.WHITE);
      
      window.fillRect(500,290, 70, 70);
      
      window.setColor(Color.MAGENTA);
      
      window.fillRect(160, 150, 480, 70);
      
      
   }
}