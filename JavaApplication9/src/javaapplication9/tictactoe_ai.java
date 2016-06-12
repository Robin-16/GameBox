/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author hp
 */
public class tictactoe_ai extends javax.swing.JFrame {
 boolean f1=false,f2=false,f3=false,f4=false,f5=false,f6=false,f7=false,f8=false,f9=false;
  int b1=0,b2=0,b3=0,b4=0,b5=0,b6=0,b7=0,b8=0,b9=0;
 boolean p1f1=false,p1f2=false,p1f3=false,p1f4=false,p1f5=false,p1f6=false,p1f7=false,p1f8=false,p1f9=false,handv=false,creditupdate=false,creditreduce=false,users=false;
 boolean p2f1=false,p2f2=false,p2f3=false,p2f4=false,p2f5=false,p2f6=false,p2f7=false,p2f8=false,p2f9=false,destroy=false,tester=false,fturn=false,tturn=false,sturn=false,foturn=false;
 int count=0; int win=0;boolean win1=false;
 int crval=homescreen.creditvalue;
 boolean inc=false,dec=false;
int increment=1;
int decrement=1;
int checker=0;
 tictactoe_aipanel t;
    /**
     * Creates new form tictactoe_ai
     */
    public tictactoe_ai() {
        initComponents();
        t=new tictactoe_aipanel();
        jPanel1.add(t);
        repaint();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(1366,768);
    }
    public void assign()
    {
        if(jButton1.getText().equalsIgnoreCase("X"))
       {
          b1=1;
           
       }
       if(jButton1.getText().equalsIgnoreCase("O"))
       {
          b1=2;
           
       }
       if(jButton2.getText().equalsIgnoreCase("X"))
       {
          b2=1;
           
       }
       if(jButton2.getText().equalsIgnoreCase("O"))
       {
          b2=2;
           
       }
       if(jButton3.getText().equalsIgnoreCase("X"))
       {
          b3=1;
           
       }
       if(jButton3.getText().equalsIgnoreCase("O"))
       {
          b3=2;
           
       }
       if(jButton4.getText().equalsIgnoreCase("X"))
       {
          b4=1;
           
       }
       if(jButton4.getText().equalsIgnoreCase("O"))
       {
          b4=2;
           
       }
       if(jButton5.getText().equalsIgnoreCase("X"))
       {
          b5=1;
           
       }
       if(jButton5.getText().equalsIgnoreCase("O"))
       {
          b5=2;
           
       }
       if(jButton6.getText().equalsIgnoreCase("X"))
       {
          b6=1;
           
       }
       if(jButton6.getText().equalsIgnoreCase("O"))
       {
          b6=2;
         
       }
       if(jButton7.getText().equalsIgnoreCase("X"))
       {
          b7=1;
           
       }
       if(jButton7.getText().equalsIgnoreCase("O"))
       {
          b7=2;
           
       }
       if(jButton8.getText().equalsIgnoreCase("X"))
       {
          b8=1;
           
       }
       if(jButton8.getText().equalsIgnoreCase("O"))
       {
          b8=2;
           
       }
       if(jButton9.getText().equalsIgnoreCase("X"))
       {
          b9=1;
           
       }
       if(jButton9.getText().equalsIgnoreCase("O"))
       {
          b9=2;
           
       }
       
    }
    public void win()
    {
        assign();
        if((b1==b2)&&(b1==b3)&&(b1!=0))
       {
           if(b1==1)
           {
               cpuaswinner();
              JOptionPane.showMessageDialog(rootPane,"CPU WINS: PRESS RESTART FOR NEW GAME","CPU WINS",JOptionPane.INFORMATION_MESSAGE);
               destroy=true;
       
           }
           else if(b1==2)
           {
               playeraswinner();
              JOptionPane.showMessageDialog(rootPane,"player WINS: PRESS RESTART FOR NEW GAME","player WINS",JOptionPane.INFORMATION_MESSAGE);
               destroy=true;
               win1=true;
               win=1;
           }
       }
       if((b4==b5)&&(b4==b6)&&(b4!=0))
       {
           if(b4==1)
           {
               cpuaswinner();
              JOptionPane.showMessageDialog(rootPane,"CPU WINS: PRESS RESTART FOR NEW GAME","CPU WINS",JOptionPane.INFORMATION_MESSAGE);
               destroy=true;
           }
           else if(b4==2)
           {
               playeraswinner();
              JOptionPane.showMessageDialog(rootPane,"player WINS: PRESS RESTART FOR NEW GAME","player WINS",JOptionPane.INFORMATION_MESSAGE);
               destroy=true;
               win1=true;
               win=1;
           }
       }
       if((b7==b8)&&(b7==b9)&&(b7!=0))
       {
           if(b7==1)
           {
               cpuaswinner();
              JOptionPane.showMessageDialog(rootPane,"CPU WINS: PRESS RESTART FOR NEW GAME","CPU WINS",JOptionPane.INFORMATION_MESSAGE);
               destroy=true;
           }
           else if(b7==2)
           {
               playeraswinner();
              JOptionPane.showMessageDialog(rootPane,"player WINS: PRESS RESTART FOR NEW GAME","player WINS",JOptionPane.INFORMATION_MESSAGE);
               destroy=true;
               win1=true;
               win=1;
           }
       }
       if((b1==b4)&&(b1==b7)&&(b1!=0))
       {
           if(b1==1)
           {
               cpuaswinner();
              JOptionPane.showMessageDialog(rootPane,"CPU WINS: PRESS RESTART FOR NEW GAME","CPU WINS",JOptionPane.INFORMATION_MESSAGE);
               destroy=true;
           }
           else if(b1==2)
           {
               playeraswinner();
              JOptionPane.showMessageDialog(rootPane,"player WINS: PRESS RESTART FOR NEW GAME","player WINS",JOptionPane.INFORMATION_MESSAGE);
               destroy=true;
               win1=true;
               win=1;
           }
       }
       if((b2==b5)&&(b2==b8)&&(b2!=0))
       {
           if(b2==1)
           {
               cpuaswinner();
              JOptionPane.showMessageDialog(rootPane,"CPU WINS: PRESS RESTART FOR NEW GAME","CPU WINS",JOptionPane.INFORMATION_MESSAGE);
               destroy=true;
           }
           else if(b2==2)
           {
               playeraswinner();
               JOptionPane.showMessageDialog(rootPane,"player WINS: PRESS RESTART FOR NEW GAME","player WINS",JOptionPane.INFORMATION_MESSAGE);
               destroy=true;
               win1=true;
               win=1;
           }
       }
       if((b3==b6)&&(b3==b9)&&(b3!=0))
       {
           if(b3==1)
           {
               cpuaswinner();
              JOptionPane.showMessageDialog(rootPane,"CPU WINS: PRESS RESTART FOR NEW GAME","CPU WINS",JOptionPane.INFORMATION_MESSAGE);
               destroy=true;
           }
           else if(b3==2)
           {
               playeraswinner();
              JOptionPane.showMessageDialog(rootPane,"player WINS: PRESS RESTART FOR NEW GAME","player WINS",JOptionPane.INFORMATION_MESSAGE);
               destroy=true;
               win1=true;
               win=1;
               
           }
       }
       if((b1==b5)&&(b1==b9)&&(b1!=0))
       {
           if(b1==1)
           {
               cpuaswinner();
              JOptionPane.showMessageDialog(rootPane,"CPU WINS: PRESS RESTART FOR NEW GAME","CPU WINS",JOptionPane.INFORMATION_MESSAGE);
               destroy=true;
           }
           else if(b1==2)
           {
               playeraswinner();
              JOptionPane.showMessageDialog(rootPane,"player WINS: PRESS RESTART FOR NEW GAME","player WINS",JOptionPane.INFORMATION_MESSAGE);
               destroy=true;
               win1=true;
               win=1;
           }
       }
       if((b3==b5)&&(b3==b7)&&(b3!=0))
       {
           if(b3==1)
           {
               cpuaswinner();
              JOptionPane.showMessageDialog(rootPane,"CPU WINS: PRESS RESTART FOR NEW GAME","CPU WINS",JOptionPane.INFORMATION_MESSAGE);
               destroy=true;
           }
           else if(b3==2)
           {
               playeraswinner();
              JOptionPane.showMessageDialog(rootPane,"player WINS: PRESS RESTART FOR NEW GAME","player WINS",JOptionPane.INFORMATION_MESSAGE);
               destroy=true;
               win1=true;
               win=1;
           }
       }

    }
    public void disabler()
    {
       jButton1.setEnabled(false);
       jButton2.setEnabled(false);
       jButton3.setEnabled(false);
       jButton4.setEnabled(false);
       jButton5.setEnabled(false);
       jButton6.setEnabled(false);
       jButton7.setEnabled(false);
       jButton8.setEnabled(false);
       jButton9.setEnabled(false);
       
    }
    public void enabler()
    {
       jButton1.setEnabled(true);
       jButton2.setEnabled(true);
       jButton3.setEnabled(true);
       jButton4.setEnabled(true);
       jButton5.setEnabled(true);
       jButton6.setEnabled(true);
       jButton7.setEnabled(true);
       jButton8.setEnabled(true);
       jButton9.setEnabled(true);
        
    }
    public void playeraswinner()
    {
        try {
            String nn=mainpage.user11;
            inc=true;
                                   dbconnect db=new dbconnect();
                                   crval=crval+1;
                                    String q1="Select * from credit_info";
                                 
                                 ResultSet rs1=db.getSelect(q1);
                       
                                 
                                      while(rs1.next())
                                      {
                                          String user=rs1.getString("name");
                                          String crr=rs1.getString("credits");
                                         if(user.equals(nn))
                                         
                                                 {
                                             users=true;
                                             break;
                                             
                                             
                                         }
                                         
                                      }
                                      if(users==true)
                                      {
                                          String valuesss=String.valueOf(crval);
                                          String q="UPDATE gamebox.credit_info SET credits='"+valuesss+"' where name='"+nn+"'";
                                            checker=db.getInsert(q);
                                  System.out.println(checker+ " ...   "+crval);
                                      }
        } catch (SQLException ex) {
            Logger.getLogger(tictactoe_ai.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void cpuaswinner()
    {
        try {
            String nn=mainpage.user11;
            dec=true;
                          dbconnect db=new dbconnect();
                          crval=crval-1;
                           String q1="Select * from credit_info";
                        
                        ResultSet rs1=db.getSelect(q1);
              
                        
                             while(rs1.next())
                             {
                                 String user=rs1.getString("name");
                                 String crr=rs1.getString("credits");
                                if(user.equals(nn))
                                
                                        {
                                    users=true;
                                    break;
                                    
                                    
                                }
                                
                             }
                             if(users==true)
                             {
                                 String valuesss=String.valueOf(crval);
                                 String q="UPDATE gamebox.credit_info SET credits='"+valuesss+"' where name='"+nn+"'";
                                   checker=db.getInsert(q);
                         System.out.println(checker+ " ...   "+crval);
                             }
        } catch (SQLException ex) {
            Logger.getLogger(tictactoe_ai.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void drawresult()
    {
          JOptionPane.showMessageDialog(rootPane,"No credit change","Your credits remain the same",JOptionPane.INFORMATION_MESSAGE);
    }
  public void turn()
  {
      if(count==9)
      {
            drawresult();
                JOptionPane.showMessageDialog(rootPane,"The game ends as stalemate","It's a tie",JOptionPane.INFORMATION_MESSAGE); 
                JOptionPane.showMessageDialog(rootPane,"Press restart for new game","It's a tie",JOptionPane.INFORMATION_MESSAGE);
                disabler();
       }
      
     else
      {
      if(fturn==false)
      {
          count=count+1;
          fturn();
      }
      else if(sturn==false)
      {
          count=count+1;
          sturn();
      }
      else if(tturn==false)
      {
          count=count+1;
          tturn();
          win();
          if(destroy==true)
          {
              disabler();
          }
      }
      else if(foturn==false)
      {
          count=count+1;
          foturn();
          win();
         if(destroy==true)
          {
              disabler();
          }
      }
  }
  }
  public void fturn()
  {
       if(p1f1==true||p1f3==true||p1f7==true||p1f9==true)
           {
               jButton5.setText("X");
               f5=true;
               p2f5=true;
               jButton5.setBackground(Color.red);
               fturn=true;
           }
           else if(p1f5=true)
           {
               jButton1.setText("X");
               f1=true;
               p2f1=true;
                fturn=true;
               jButton1.setBackground(Color.red);
           }
           else
           {
               jButton5.setText("X");
               f5=true;
       fturn=true;
               p2f5=true;
               jButton5.setBackground(Color.red);
           }
  }
  public void sturn()
  {
              if(p1f1==true&&p1f3==true)
               {
                   jButton2.setText("X");
                   f2=true;
                   p2f2=true;
                   jButton2.setBackground(Color.red); 
                   sturn=true;
               }
               else if(p1f1==true&&p1f7==true)
               {
                   jButton4.setText("X");
                   f4=true;
                   p2f4=true;
                    sturn=true;
                   jButton4.setBackground(Color.red); 
               }
               else if(p1f3==true&&p1f9==true)
               {
                   jButton6.setText("X");
                   f6=true;
                    sturn=true;
                   p2f6=true;
                   jButton6.setBackground(Color.red); 
               }
               else if(p1f1==true&&p1f9==true)
               {
                   jButton8.setText("X");
                   f8=true;
                   p2f8=true;
                    sturn=true;
                   jButton8.setBackground(Color.red); 
               }
               else if(p1f3==true&&p1f7==true)
               {
                   jButton8.setText("X");
                   f8=true; 
                   p2f8=true;
                    sturn=true;
                   jButton8.setBackground(Color.red); 
               }
          
              else if(p1f1==true&&p1f2==true)
               {
                   jButton3.setText("X");
                   f3=true;
                   p2f3=true;
                    sturn=true;
                   jButton3.setBackground(Color.red); 
               }
               else if(p1f2==true&&p1f3==true)
               {
                   jButton1.setText("X");
                   f1=true;
                   p2f1=true;
                    sturn=true;
                   jButton1.setBackground(Color.red); 
               }
              else if(p1f1==true&&p1f3==true)
               {
                   jButton2.setText("X");
                   f2=true;
                   p2f2=true;
                    sturn=true;
                   jButton2.setBackground(Color.red); 
               }
                else if(p1f4==true&&p1f5==true)
               {
                   jButton6.setText("X");
                   f6=true;
                   p2f6=true;
                    sturn=true;
                   jButton6.setBackground(Color.red); 
               }
               else if(p1f5==true&&p1f6==true)
               {
                   jButton4.setText("X");
                   f4=true;
                    sturn=true;
                   p2f4=true;
                   jButton4.setBackground(Color.red); 
               }
              else if(p1f4==true&&p1f6==true)
               {
                   jButton5.setText("X");
                   f5=true;
                    sturn=true;
                   p2f5=true;
                   jButton5.setBackground(Color.red); 
               }
              else if(p1f7==true&&p1f8==true)
               {
                   jButton9.setText("X");
                   f9=true;
                    sturn=true;
                   p2f9=true;
                   jButton9.setBackground(Color.red); 
               }
               else if(p1f7==true&&p1f9==true)
               {
                   jButton8.setText("X");
                   f8=true;
                   p2f8=true;
                    sturn=true;
                   jButton8.setBackground(Color.red); 
               }
              else if(p1f8==true&&p1f9==true)
               {
                   jButton7.setText("X");
                   f7=true;
                   p2f7=true;
                    sturn=true;
                   jButton7.setBackground(Color.red); 
               }
               else if(p1f1==true&&p1f4==true)
               {
                   jButton7.setText("X");
                   f7=true;
                   p2f7=true;
                    sturn=true;
                   jButton7.setBackground(Color.red); 
               }
              else if(p1f1==true&&p1f7==true)
               {
                   jButton4.setText("X");
                   f4=true;
                   p2f4=true;
                    sturn=true;
                   jButton4.setBackground(Color.red); 
               }
                else if(p1f4==true&&p1f7==true)
               {
                   jButton1.setText("X");
                   f1=true;
                   p2f1=true;
                    sturn=true;
                   jButton1.setBackground(Color.red); 
               }
               else if(p1f2==true&&p1f5==true)
               {
                   jButton8.setText("X");
                   f8=true;
                    sturn=true;
                   p2f8=true;
                   jButton8.setBackground(Color.red); 
                   
               }
              else if(p1f2==true&&p1f8==true)
               {
                   jButton5.setText("X");
                   f5=true;
                    sturn=true;
                   p2f5=true;
                   jButton5.setBackground(Color.red); 
               }
              else if(p1f5==true&&p1f8==true)
               {
                   jButton2.setText("X");
                   f2=true;
                   p2f2=true;
                    sturn=true;
                   jButton2.setBackground(Color.red); 
               }
               else if(p1f3==true&&p1f6==true)
               {
                   jButton9.setText("X");
                   f9=true;
                   p2f9=true;
                    sturn=true;
                   jButton9.setBackground(Color.red); 
               }
              else if(p1f3==true&&p1f9==true)
               {
                   jButton6.setText("X");
                   f6=true;
                   p2f6=true;
                    sturn=true;
                   jButton6.setBackground(Color.red); 
               }
               else if(p1f6==true&&p1f9==true)
               {
                   jButton3.setText("X");
                   f3=true;
                   p2f3=true;
                    sturn=true;
                   jButton3.setBackground(Color.red); 
               }
               else if(p1f1==true&&p1f5==true)
               {
                   jButton9.setText("X");
                   f9=true;
                   p2f9=true;
                    sturn=true;
                   jButton9.setBackground(Color.red); 
               }
              else if(p1f1==true&&p1f9==true)
               {
                   jButton5.setText("X");
                   f5=true;
                   p2f5=true;
                    sturn=true;
                   jButton5.setBackground(Color.red); 
               }
              else if(p1f3==true&&p1f5==true)
               {
                   jButton7.setText("X");
                   f7=true;
                   p2f7=true;
                    sturn=true;
                   jButton7.setBackground(Color.red); 
               }
               else if(p1f3==true&&p1f7==true)
               {
                   jButton5.setText("X");
                   f5=true;
                   p2f5=true;
                    sturn=true;
                   jButton5.setBackground(Color.red); 
               }
              else if(p1f5==true&&p1f7==true)
               {
                   jButton3.setText("X");
                   f3=true;
                   p2f3=true;
                    sturn=true;
                   jButton3.setBackground(Color.red); 
               }
               else if(p1f5==true&&p1f9==true)
               {
                   jButton1.setText("X");
                   f1=true;
                   p2f1=true;
                    sturn=true;
                   jButton1.setBackground(Color.red); 
               }
               else 
               {
                   addrandom();
                    sturn=true;
               }
  }
  public void tturn()
  {
      add();
      tturn=true;
  }
  public void foturn()
  {
      add();
      foturn=true;
  }
 public void addrandom()
 {
      if(p1f1==true||p1f3==true||p1f7==true||p1f9==true)
           {
               if(p1f1==true&&p1f3==true)
               {
                   jButton2.setText("X");
                   f2=true;
                   p2f2=true;
                   tester=true;
                   jButton2.setBackground(Color.red); 
               }
               else if(p1f1==true&&p1f7==true)
               {
                   jButton4.setText("X");
                   f4=true;
                   p2f4=true;
                   tester=true;
                   jButton4.setBackground(Color.red); 
               }
               else if(p1f3==true&&p1f9==true)
               {
                   jButton6.setText("X");
                   f6=true;
                   p2f6=true;
                   tester=true;
                   jButton6.setBackground(Color.red); 
               }
               else if(p1f1==true&&p1f9==true)
               {
                   jButton8.setText("X");
                   f8=true;
                   p2f8=true;
                   tester=true;
                   jButton8.setBackground(Color.red); 
               }
               else if(p1f3==true&&p1f7==true)
               {
                   jButton8.setText("X");
                   f8=true; 
                   p2f8=true;
                   tester=true;
                   jButton8.setBackground(Color.red); 
               }
          
              else if(p1f1==true&&p1f2==true)
               {
                   jButton3.setText("X");
                   f3=true;
                   p2f3=true;
                   tester=true;
                   jButton3.setBackground(Color.red); 
               }
               else if(p1f2==true&&p1f3==true)
               {
                   jButton1.setText("X");
                   f1=true;
                   p2f1=true;
                   tester=true;
                   jButton1.setBackground(Color.red); 
               }
              else if(p1f1==true&&p1f3==true)
               {
                   jButton2.setText("X");
                   f2=true;
                   p2f2=true;
                   tester=true;
                   jButton2.setBackground(Color.red); 
               }
                else if(p1f4==true&&p1f5==true)
               {
                   jButton6.setText("X");
                   f6=true;
                   p2f6=true;
                   tester=true;
                   jButton6.setBackground(Color.red); 
               }
               else if(p1f5==true&&p1f6==true)
               {
                   jButton4.setText("X");
                   f4=true;
                   p2f4=true;
                   tester=true;
                   jButton4.setBackground(Color.red); 
               }
              else if(p1f4==true&&p1f6==true)
               {
                   jButton5.setText("X");
                   f5=true;
                   p2f5=true;
                   tester=true;
                   jButton5.setBackground(Color.red); 
               }
              else if(p1f7==true&&p1f8==true)
               {
                   jButton9.setText("X");
                   f9=true;
                   p2f9=true;
                   tester=true;
                   jButton9.setBackground(Color.red); 
               }
               else if(p1f7==true&&p1f9==true)
               {
                   jButton8.setText("X");
                   f8=true;
                   p2f8=true;
                   tester=true;
                   jButton8.setBackground(Color.red); 
               }
              else if(p1f8==true&&p1f9==true)
               {
                   jButton7.setText("X");
                   f7=true;
                   p2f7=true;
                   tester=true;
                   jButton7.setBackground(Color.red); 
               }
               else if(p1f1==true&&p1f4==true)
               {
                   jButton7.setText("X");
                   f7=true;
                   p2f7=true;
                   tester=true;
                   jButton7.setBackground(Color.red); 
               }
              else if(p1f1==true&&p1f7==true)
               {
                   jButton4.setText("X");
                   f4=true;
                   p2f4=true;
                   tester=true;
                   jButton4.setBackground(Color.red); 
               }
                else if(p1f4==true&&p1f7==true)
               {
                   jButton1.setText("X");
                   f1=true;
                   p2f1=true;
                   tester=true;
                   jButton1.setBackground(Color.red); 
               }
               else if(p1f2==true&&p1f5==true)
               {
                   jButton8.setText("X");
                   f8=true;
                   p2f8=true;
                   tester=true;
                   jButton8.setBackground(Color.red); 
                   
               }
              else if(p1f2==true&&p1f8==true)
               {
                   jButton5.setText("X");
                   f5=true;
                   p2f5=true;
                   tester=true;
                   jButton5.setBackground(Color.red); 
               }
              else if(p1f5==true&&p1f8==true)
               {
                   jButton2.setText("X");
                   f2=true;
                   p2f2=true;
                   tester=true;
                   jButton2.setBackground(Color.red); 
               }
               else if(p1f3==true&&p1f6==true)
               {
                   jButton9.setText("X");
                   f9=true;
                   p2f9=true;
                   tester=true;
                   jButton9.setBackground(Color.red); 
               }
              else if(p1f3==true&&p1f9==true)
               {
                   jButton6.setText("X");
                   f6=true;
                   p2f6=true;
                   tester=true;
                   jButton6.setBackground(Color.red); 
               }
               else if(p1f6==true&&p1f9==true)
               {
                   jButton3.setText("X");
                   f3=true;
                   p2f3=true;
                   tester=true;
                   jButton3.setBackground(Color.red); 
               }
               else if(p1f1==true&&p1f5==true)
               {
                   jButton9.setText("X");
                   f9=true;
                   p2f9=true;
                   tester=true;
                   jButton9.setBackground(Color.red); 
               }
              else if(p1f1==true&&p1f9==true)
               {
                   jButton5.setText("X");
                   f5=true;
                   p2f5=true;
                   tester=true;
                   jButton5.setBackground(Color.red); 
               }
              else if(p1f3==true&&p1f5==true)
               {
                   jButton7.setText("X");
                   f7=true;
                   p2f7=true;
                   tester=true;
                   jButton7.setBackground(Color.red); 
               }
               else if(p1f3==true&&p1f7==true)
               {
                   jButton5.setText("X");
                   f5=true;
                   p2f5=true;
                   tester=true;
                   jButton5.setBackground(Color.red); 
               }
              else if(p1f5==true&&p1f7==true)
               {
                   jButton3.setText("X");
                   f3=true;
                   p2f3=true;
                   tester=true;
                   jButton3.setBackground(Color.red); 
               }
               else if(p1f5==true&&p1f9==true)
               {
                   jButton1.setText("X");
                   f1=true;
                   p2f1=true;
                   tester=true;
                   jButton1.setBackground(Color.red); 
               }
               
           }
     else if(p1f2==true||p1f4==true||p1f6==true||p1f8==true)
           {
               if(p1f2==true&&p1f5==true)
               {
                   jButton8.setText("X");
                   f8=true;
                   p2f8=true;
                   tester=true;
                   jButton8.setBackground(Color.red); 
               }
              else if(p1f4==true&&p1f5==true)
               {
                   jButton6.setText("X");
                   f6=true;
                   p2f6=true;
                   tester=true;
                   jButton6.setBackground(Color.red); 
               }
               if(p1f6==true&&p1f5==true)
               {
                   jButton4.setText("X");
                   f4=true;
                   p2f4=true;
                   tester=true;
                   jButton4.setBackground(Color.red); 
               }
               if(p1f8==true&&p1f5==true)
               {
                   jButton2.setText("X");
                   f2=true;
                   p2f2=true;
                   tester=true;
                   jButton2.setBackground(Color.red); 
               }
           }       
         
     if(tester==false)
          {
              if(f1==false)
           {
               f1=true;
               jButton1.setText("X");
               p2f1=true;
                   jButton1.setBackground(Color.red); 
           }
           else if(f2==false)
           {
               f2=true;
               jButton2.setText("X");
               p2f2=true;
                   jButton2.setBackground(Color.red); 
           }
           else if(f3==false)
           {
               f3=true;
               jButton3.setText("X");
               p2f3=true;
                   jButton3.setBackground(Color.red); 
           }
           else if(f4==false)
           {
               f4=true;
               jButton4.setText("X");
               p2f4=true;
                   jButton4.setBackground(Color.red); 
           }
           else if(f5==false)
           {
               f5=true;
               jButton5.setText("X");
               p2f5=true;
                   jButton5.setBackground(Color.red); 
           }
           else if(f6==false)
           {
               f6=true;
               jButton6.setText("X");
               p2f6=true;
                   jButton6.setBackground(Color.red); 
           }
           else if(f7==false)
           {
               f7=true;
               jButton7.setText("X");
               p2f7=true;
                   jButton7.setBackground(Color.red); 
           }
           else if(f8==false)
           {
               f8=true;
               jButton8.setText("X");
               p2f8=true;
                   jButton8.setBackground(Color.red); 
           }
           else if(f9==false)
           {
               f9=true;
               jButton9.setText("X");
               p2f9=true;
                   jButton9.setBackground(Color.red); 
           }  
         }
          tester=false;
    
 }
 public void add()
 {
          if(f1==false)
           {
               f1=true;
               jButton1.setText("X");
               p2f1=true;
                   jButton1.setBackground(Color.red); 
           }
           else if(f2==false)
           {
               f2=true;
               jButton2.setText("X");
               p2f2=true;
                   jButton2.setBackground(Color.red); 
           }
           else if(f3==false)
           {
               f3=true;
               jButton3.setText("X");
               p2f3=true;
                   jButton3.setBackground(Color.red); 
           }
           else if(f4==false)
           {
               f4=true;
               jButton4.setText("X");
               p2f4=true;
                   jButton4.setBackground(Color.red); 
           }
           else if(f5==false)
           {
               f5=true;
               jButton5.setText("X");
               p2f5=true;
                   jButton5.setBackground(Color.red); 
           }
           else if(f6==false)
           {
               f6=true;
               jButton6.setText("X");
               p2f6=true;
                   jButton6.setBackground(Color.red); 
           }
           else if(f7==false)
           {
               f7=true;
               jButton7.setText("X");
               p2f7=true;
                   jButton7.setBackground(Color.red); 
           }
           else if(f8==false)
           {
               f8=true;
               jButton8.setText("X");
               p2f8=true;
                   jButton8.setBackground(Color.red); 
           }
           else if(f9==false)
           {
               f9=true;
               jButton9.setText("X");
               p2f9=true;
                   jButton9.setBackground(Color.red); 
           }
 }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(null);

        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton1MouseReleased(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(180, 60, 80, 70);

        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton2MouseReleased(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(310, 60, 80, 70);

        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton3MouseReleased(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(440, 60, 80, 70);

        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton4MouseReleased(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(180, 150, 80, 70);

        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton5MouseReleased(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(310, 150, 80, 70);

        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton6MouseReleased(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(440, 150, 80, 70);

        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton7MouseReleased(evt);
            }
        });
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(180, 240, 80, 70);

        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton8MouseReleased(evt);
            }
        });
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(310, 240, 80, 70);

        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton9MouseReleased(evt);
            }
        });
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(440, 240, 80, 70);

        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(180, 10, 340, 30);

        jButton10.setText("reset");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10);
        jButton10.setBounds(840, 30, 110, 50);

        jButton11.setText("rules");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11);
        jButton11.setBounds(840, 100, 110, 50);

        jPanel1.setLayout(new java.awt.BorderLayout());
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1366, 768);
        jPanel1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseReleased
//     if(count==9)
//     {
//        JOptionPane.showMessageDialog(rootPane,"The game ends as stalemate","It's a tie",JOptionPane.INFORMATION_MESSAGE);
//        disabler();
//        JOptionPane.showMessageDialog(rootPane,"Press restart for new game","It's a tie",JOptionPane.INFORMATION_MESSAGE);
//     }
//       else
//     {count=count+1;
//        turn();
//     }
    }//GEN-LAST:event_jButton1MouseReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  if(f1==true)
  {
       JOptionPane.showMessageDialog(rootPane,"The Button is already chosen","ERROR",JOptionPane.ERROR_MESSAGE);
  }
  else
  {
        jButton1.setText("O");
     f1=true;
     p1f1=true;
   count=count+1;
   win();
   if(destroy==true)
   {
       disabler();
   }
   else
   {
   turn();
  }
  }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      if(f2==true)
  {
       JOptionPane.showMessageDialog(rootPane,"The Button is already chosen","ERROR",JOptionPane.ERROR_MESSAGE);
  }
  else
  {
        jButton2.setText("O");
     f2=true;
     p1f2=true;
   count=count+1;
   win();
  if(destroy==true)
   {
       disabler();
   }
   else
   {
   turn();
  }
  }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(f3==true)
  {
       JOptionPane.showMessageDialog(rootPane,"The Button is already chosen","ERROR",JOptionPane.ERROR_MESSAGE);
  }
  else
  {
        jButton3.setText("O");
     f3=true;
     p1f3=true;
   count=count+1;
   win();
  if(destroy==true)
   {
       disabler();
   }
   else
   {
   turn();
  }
  }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      if(f4==true)
  {
       JOptionPane.showMessageDialog(rootPane,"The Button is already chosen","ERROR",JOptionPane.ERROR_MESSAGE);
  }
  else
  {
        jButton4.setText("O");
     f4=true;
     p1f4=true;
   count=count+1;
   win();
   if(destroy==true)
   {
       disabler();
   }
   else
   {
   turn();
  }
  }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       if(f5==true)
  {
       JOptionPane.showMessageDialog(rootPane,"The Button is already chosen","ERROR",JOptionPane.ERROR_MESSAGE);
  }
  else
  {
        jButton5.setText("O");
     f5=true;
     p1f5=true;
   count=count+1;
   win();
   if(destroy==true)
   {
       disabler();
   }
   else
   {
   turn();
  }
  }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
     if(f6==true)
  {
       JOptionPane.showMessageDialog(rootPane,"The Button is already chosen","ERROR",JOptionPane.ERROR_MESSAGE);
  }
  else
  {
        jButton6.setText("O");
     f6=true;
     p1f6=true;
   count=count+1;
   win();
if(destroy==true)
   {
       disabler();
   }
   else
   {
   turn();
  }
  }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       if(f7==true)
  {
       JOptionPane.showMessageDialog(rootPane,"The Button is already chosen","ERROR",JOptionPane.ERROR_MESSAGE);
  }
  else
  {
        jButton7.setText("O");
     f7=true;
     p1f7=true;
   count=count+1;
   win();
   if(destroy==true)
   {
       disabler();
   }
   else
   {
   turn();
  }
  }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
     if(f8==true)
  {
       JOptionPane.showMessageDialog(rootPane,"The Button is already chosen","ERROR",JOptionPane.ERROR_MESSAGE);
  }
  else
  {
        jButton8.setText("O");
     f8=true;
     p1f8=true;
   count=count+1;
   win();
  if(destroy==true)
   {
       disabler();
   }
   else
   {
   turn();
  }
  }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
      if(f9==true)
  {
       JOptionPane.showMessageDialog(rootPane,"The Button is already chosen","ERROR",JOptionPane.ERROR_MESSAGE);
  }
  else
  {
        jButton9.setText("O");
     f9=true;
     p1f9=true;
   count=count+1;
   win();
  if(destroy==true)
   {
       disabler();
   }
   else
   {
   turn();
  }
  }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseReleased
     // turn();
    }//GEN-LAST:event_jButton2MouseReleased

    private void jButton3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseReleased
     // turn();
    }//GEN-LAST:event_jButton3MouseReleased

    private void jButton4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseReleased
       //turn();
    }//GEN-LAST:event_jButton4MouseReleased

    private void jButton5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseReleased
        //turn();
    }//GEN-LAST:event_jButton5MouseReleased

    private void jButton6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseReleased
      //turn();
    }//GEN-LAST:event_jButton6MouseReleased

    private void jButton7MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseReleased
// turn();    
    }//GEN-LAST:event_jButton7MouseReleased

    private void jButton8MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseReleased
  //     turn();
    }//GEN-LAST:event_jButton8MouseReleased

    private void jButton9MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseReleased
    //turn();
    }//GEN-LAST:event_jButton9MouseReleased

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
 destroy = false;
        f1 = false;
        f2 = false;
        f3 = false;
        f4 = false;
        f5 = false;
        f6 = false;
        f7 = false;
        f8 = false;
        f9 = false;
        
        p1f1 = false;
        p1f2 = false;
        p1f3 = false;
        p1f4 = false;
        p1f5 = false;
        p1f6 = false;
        p1f7 = false;
        p1f8 = false;
        p1f9 = false;
        
        p2f1 = false;
        p2f2 = false;
        p2f3 = false;
        p2f4 = false;
        p2f5 = false;
        p2f6 = false;
        p2f7 = false;
        p2f8 = false;
        p2f9 = false;
        fturn=false;
        tturn=false;
        sturn=false;
        foturn=false;
        handv=false;
        destroy=false;
        tester=false;
        b1=0;b2=0;b3=0;b4=0;b5=0;b6=0;b7=0;b8=0;b9=0;
        checker=0;
        creditupdate=false;creditreduce=false;users=false;
      
       
        count=0;
        jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        jButton4.setText("");
        jButton5.setText("");
        jButton6.setText("");
        jButton7.setText("");
        jButton8.setText("");
        jButton9.setText("");
        jButton1.setBackground(Color.LIGHT_GRAY);
        jButton2.setBackground(Color.LIGHT_GRAY);
        jButton3.setBackground(Color.LIGHT_GRAY);
        jButton4.setBackground(Color.LIGHT_GRAY);
        jButton5.setBackground(Color.LIGHT_GRAY);
        jButton6.setBackground(Color.LIGHT_GRAY);
        jButton7.setBackground(Color.LIGHT_GRAY);
        jButton8.setBackground(Color.LIGHT_GRAY);
        jButton9.setBackground(Color.LIGHT_GRAY);
      
         jLabel1.setText("player turn");
         enabler();
                 
 
    
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
       tictacrules mnw=new tictacrules();
      mnw.setSize(500,350);
      mnw.setVisible(true);
    }//GEN-LAST:event_jButton11ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(tictactoe_ai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tictactoe_ai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tictactoe_ai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tictactoe_ai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new tictactoe_ai().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
