package javaapplication9;
import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.ImageObserver;
import javax.swing.*;
import sun.java2d.loops.DrawLine;

public class Ball extends Applet implements Runnable,ActionListener
{
        Button b1;Label l1,l2;
        JPanel p;
        Button b2;
	boolean flag1,flag2,flag3,flag4;boolean flag5=true;boolean flag6=false;
	static int x1= 10,count=0;		
        static int x2= 100,x3=100;
       static  int y1=40;
        static int y2=40,y3=350,y4=400;
       
        Img2 p1;
        Graphics g;
        
        //Image background;
        
     

     public void init()  
     { 
  
         //setBackground(Color.darkGray); 
         b1 = new Button("Action!"); 
         b2= new Button("New Game");
         l1 = new Label("Don't click!"); 
         l2 = new Label(); 
         p=new JPanel();
         p1=new Img2();
         
       //  background=getImage(getCodeBase(),"bacground.jpg");
        
         
         add(b1); 
         add(l1);
         add(l2);
         add(p);
         add(b2);
         b1.addActionListener(this);
         b2.setEnabled(false);
         
         repaint();
         
          
         }

     	public void start(){
        Thread th= new Thread(this);
        th.start();
        }
 
	public void run ()
	{
		while(true)
                    {
                  
               //   x3=x3+2;
		if(flag5==true){	
                  x1+=10;x2+=10;//x5+=10;x6+=10;x7+=10;x8+=10;x9+=10;x10+=10;
                }
                 if(x2>=1166){
                 flag1=true;
                 flag5=false;
                  }
                 if(flag1==true)
                {
                x2=x2-10;
                x1=x1-10; 
                 }
               
                  if(x1<=200){
                    flag5=true;flag1=false;
                  }
 
                  if(flag3==true){
                      y4-=7;
                      y3-=7;
                     
                      if(y3==35 && (x1>=593 &&x1<=773) && (x2>=593 && x2<=773))
                      {
                          break;
                      }
                        if(count>2 && y3==35){
                            flag5=flag3=false;
                        b1.setEnabled(false);
                       JOptionPane.showMessageDialog(null,"SOrry GAME OVER, press New GAme to try again"," OOPS!! you loose", JOptionPane.INFORMATION_MESSAGE);
                    b2.setEnabled(true);
                        }
                       
                    if(y3<=-120){
                        y3=350;y4=400;flag3=false;
                    }
                  }
                repaint();
                 
			try
			{
			Thread.sleep (20);
			}
			catch (InterruptedException ex)
			{
			Thread.currentThread().interrupt();
			}
	}
	}


	public void paint (Graphics g)
	{
            super.paint(g);
            g.setColor(Color.black);
            // g.drawLine(x5, 39, x6, 39); g.drawLine(x7, 38, x8, 38);             g.drawLine(x9, 37, x10, 37); 

            g.drawLine(x1, y1, x2, y2);
            g.drawLine(683,y3, 683, y4);
         //   g.drawImage(img, 0, 0,getWidth(),getHeight(),imgb);
        }

   @Override
    public void actionPerformed(ActionEvent e) {
    flag3=true;count++;  
    }
}