
package javaapplication9;

import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author disco dancer
 */
public class NewJFrame1 extends javax.swing.JFrame implements Runnable,ActionListener {

  
        
     
	boolean flag1,flag2,flag3,flag4;boolean flag5=true;boolean flag6=false;boolean flag7=true;
	 int x1= 10,count=1;		
         int x2= 185,x3=100;
         int y1=40;
         int y2=40,y3=350,y4=400;int score=0;
 
         static int x4= 10,x5 = 100,x6=100,cout=1;		
         static int y5=40;
         static int y6=40,y7=350,y8=400;
        mainpanel mp;
       int mx,my;
        Img2 p1;
        Graphics g;
        
    /**
     * Creates new form NewJFrame1
     */
    public NewJFrame1() {
        initComponents();
        mp=new mainpanel();
       jPanel1.add(mp);
        repaint();
        p1=new Img2();
        repaint();
        b2.setEnabled(false);
        l3.setText("5");
       
        }
    
    public void start(){
        Thread th= new Thread(this);
        th.start();
        }
 
	public void run()
	{
		while(true)
                    {
                  
              
		if(flag5==true){	
                  x1+=3;x2+=3;
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
                     
                     if(y3==35)
                     {
                         System.out.println(x1 +" " + x2);
                     }
                      
                      if(y3==35 && ((x1>=508 &&x1<=543) || (x1>=648 && x1<=683)))
                      {
                          score=score+10;
                          jLabel2.setText(String.valueOf(score));
                        JOptionPane.showMessageDialog(null,"YOU SCORED 10"," POOR SHOT", JOptionPane.INFORMATION_MESSAGE);
                        
                        flag5=flag3=flag1=false;
                          }
                    
                      else if(y3==35 && ((x1>=543 &&x1<=569) ||  (x1>=622 && x1<=648))){
                       score=score+25;
                       jLabel2.setText(String.valueOf(score));
                        JOptionPane.showMessageDialog(null,"YOU SCORED 25","IS THAT ALL YOU GOT?", JOptionPane.INFORMATION_MESSAGE);
                        
                        flag5=flag3=flag1=false;
                  }
                      
                      else if(y3==35 && ((x1>=569 &&x1<=586) || (x1>=605 && x1<=622))){
                       score=score+50;
                       jLabel2.setText(String.valueOf(score));
                        JOptionPane.showMessageDialog(null,"YOU SCORED 50","YOU CAN DO MUCH BETTER ", JOptionPane.INFORMATION_MESSAGE);
                        
                        flag5=flag3=flag1=false;
                  }
                      
                      else if(y3==35 && ((x1>=586 &&x1<=594) || (x1>=597 && x1<=605))){
                       score=score+100;
                       jLabel2.setText(String.valueOf(score));
                        JOptionPane.showMessageDialog(null,"YOU SCORED 100"," THAT'S LIKE IT", JOptionPane.INFORMATION_MESSAGE);
                        
                        flag5=flag3=flag1=false;
                  }
                       else if(y3==35 && ((x1>=594 &&x1<=597) )){//|| (x2>=772 && x2<=780))){
                       score=score+500;
                       jLabel2.setText(String.valueOf(score));
                        JOptionPane.showMessageDialog(null,"YOU SCORED 500"," BULLZZZ EYE", JOptionPane.INFORMATION_MESSAGE);
                        
                        flag5=flag3=flag1=false;
                  }
                  
                      
                        
                      if(count>5 && y3==35){
                        flag5=flag3=flag1=false;
                        b1.setEnabled(false);
                        b3.setEnabled(false);
                       JOptionPane.showMessageDialog(null,"Sorry GAME OVER, press New GAme to try again"," OOPS!! you loose", JOptionPane.INFORMATION_MESSAGE);
                    b2.setEnabled(true);
                        }
                       
                    if(y3<=-120){
                        y3=350;y4=400;flag3=false;
                    }
                  }
                repaint();
            try {
                //try
                //{
                Thread.sleep (20);
                //}
                //catch (InterruptedException ex)
                //{
                //Thread.currentThread().interrupt();
                //}
            } catch (InterruptedException ex) {
                Logger.getLogger(NewJFrame1.class.getName()).log(Level.SEVERE, null, ex);
            }
	}
                
	}


	public void paint (Graphics g)
	{
            super.paint(g);
            g.setColor(Color.darkGray);
            g.fillRect(x1, y1,175,10);
          
            
            g.setColor(Color.blue);
            g.fillRect(x1+30, y1,115,10);
           
            g.setColor(Color.green);
            g.fillRect(x1+55, y1,65,10);
           
            g.setColor(Color.yellow);
            g.fillRect(x1+75, y1,20,10);
            
            g.setColor(Color.red);
            g.fillRect(x1+85, y1,5,10);
           
            g.setColor(Color.black);
            g.drawLine(683,y3, 683, y4);
            g.fillOval(678, y3, 10, 10);
            g.fillOval(674, y3+8, 7, 7); g.fillOval(684, y3+8, 7, 7); g.fillOval(678, y4, 10, 10);
        
        }

   @Override
    public void actionPerformed(ActionEvent e) { 
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(2147483647, 2147483647));
        getContentPane().setLayout(null);

        b1.setText("FIRE!!!");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1);
        b1.setBounds(680, 620, 110, 40);

        b3.setText("AIM AGAIN");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        getContentPane().add(b3);
        b3.setBounds(510, 690, 100, 40);

        b2.setText("NEW GAME");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        getContentPane().add(b2);
        b2.setBounds(850, 690, 100, 40);

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CHANCES : ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 690, 120, 40);

        l3.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        l3.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(l3);
        l3.setBounds(160, 700, 80, 20);

        jLabel3.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("total score");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 634, 160, 30);

        jLabel2.setFont(new java.awt.Font("Showcard Gothic", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(210, 630, 80, 30);

        jPanel1.setLayout(new java.awt.BorderLayout());
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, -2, 1366, 1010);
        jPanel1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
      flag3=true;count++; 
      if(count==4){
          l3.setText("all chances over");
      }
      l3.setText(String.valueOf(6-count));
     
      
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
       b1.setEnabled(true);       b2.setEnabled(false);       b3.setEnabled(true);
       x1=x4;x2=x5;
       y3=y7;y4=y8;
       count=cout;
       jLabel2.setText("");
       score=0;
      
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
 x1=x4;
 x2=x5;
       y3=y7;y4=y8;        // TODO add your handling code here:
    }//GEN-LAST:event_b3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
    NewJFrame1 obj=new NewJFrame1();
    obj.setVisible(true);
    obj.start();
 
    
     
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel l3;
    // End of variables declaration//GEN-END:variables

}
