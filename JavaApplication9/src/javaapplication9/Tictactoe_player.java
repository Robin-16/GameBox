/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class Tictactoe_player extends javax.swing.JFrame {
int count,b1,b2,b3,b4,b5,b6,b7,b8,b9,i;
boolean flag,destroy,f1,f2,f3,f4,f5,f6,f7,f8,f9,flagger=false;
Tictactoe_playerpanel t11;
    /**
     * Creates new form Tictactoe_player
     */
    public Tictactoe_player() {
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(1366,768);
        t11=new Tictactoe_playerpanel();
        jPanel1.add(t11);
        repaint();
       
    }
    
    public void assign()
   {   
       if(count==9)
       {
           JOptionPane.showMessageDialog(rootPane,"The Game ends as STALEMATE","STALEMATE",JOptionPane.INFORMATION_MESSAGE);
            
           
       }
        else
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
       if((b1==b2)&&(b1==b3))
       {
           if(b1==1)
           {
              JOptionPane.showMessageDialog(rootPane,"PLAYER2 WINS: PRESS RESTART FOR NEW GAME","PLAYER 2 WINS",JOptionPane.INFORMATION_MESSAGE);
               destroy=true;
           }
           else if(b1==2)
           {
              JOptionPane.showMessageDialog(rootPane,"PLAYER1 WINS: PRESS RESTART FOR NEW GAME","PLAYER 1 WINS",JOptionPane.INFORMATION_MESSAGE);
               destroy=true;
           }
       }
       if((b4==b5)&&(b4==b6))
       {
           if(b4==1)
           {
              JOptionPane.showMessageDialog(rootPane,"PLAYER2 WINS: PRESS RESTART FOR NEW GAME","PLAYER 2 WINS",JOptionPane.INFORMATION_MESSAGE);
               destroy=true;
           }
           else if(b4==2)
           {
              JOptionPane.showMessageDialog(rootPane,"PLAYER1 WINS: PRESS RESTART FOR NEW GAME","PLAYER 1 WINS",JOptionPane.INFORMATION_MESSAGE);
               destroy=true;
           }
       }
       if((b7==b8)&&(b7==b9))
       {
           if(b7==1)
           {
              JOptionPane.showMessageDialog(rootPane,"PLAYER2 WINS: PRESS RESTART FOR NEW GAME","PLAYER 2 WINS",JOptionPane.INFORMATION_MESSAGE);
               destroy=true;
           }
           else if(b7==2)
           {
              JOptionPane.showMessageDialog(rootPane,"PLAYER1 WINS: PRESS RESTART FOR NEW GAME","PLAYER 1 WINS",JOptionPane.INFORMATION_MESSAGE);
               destroy=true;
           }
       }
       if((b1==b4)&&(b1==b7))
       {
           if(b1==1)
           {
              JOptionPane.showMessageDialog(rootPane,"PLAYER2 WINS: PRESS RESTART FOR NEW GAME","PLAYER 2 WINS",JOptionPane.INFORMATION_MESSAGE);
               destroy=true;
           }
           else if(b1==2)
           {
              JOptionPane.showMessageDialog(rootPane,"PLAYER1 WINS: PRESS RESTART FOR NEW GAME","PLAYER 1 WINS",JOptionPane.INFORMATION_MESSAGE);
               destroy=true;
           }
       }
       if((b2==b5)&&(b2==b8))
       {
           if(b2==1)
           {
              JOptionPane.showMessageDialog(rootPane,"PLAYER2 WINS: PRESS RESTART FOR NEW GAME","PLAYER 2 WINS",JOptionPane.INFORMATION_MESSAGE);
               destroy=true;
           }
           else if(b2==2)
           {
               JOptionPane.showMessageDialog(rootPane,"PLAYER1 WINS: PRESS RESTART FOR NEW GAME","PLAYER 1 WINS",JOptionPane.INFORMATION_MESSAGE);
               destroy=true;
           }
       }
       if((b3==b6)&&(b3==b9))
       {
           if(b3==1)
           {
              JOptionPane.showMessageDialog(rootPane,"PLAYER2 WINS: PRESS RESTART FOR NEW GAME","PLAYER 2 WINS",JOptionPane.INFORMATION_MESSAGE);
               destroy=true;
           }
           else if(b3==2)
           {
              JOptionPane.showMessageDialog(rootPane,"PLAYER1 WINS: PRESS RESTART FOR NEW GAME","PLAYER 1 WINS",JOptionPane.INFORMATION_MESSAGE);
               destroy=true;
           }
       }
       if((b1==b5)&&(b1==b9))
       {
           if(b1==1)
           {
              JOptionPane.showMessageDialog(rootPane,"PLAYER2 WINS: PRESS RESTART FOR NEW GAME","PLAYER 2 WINS",JOptionPane.INFORMATION_MESSAGE);
               destroy=true;
           }
           else if(b1==2)
           {
              JOptionPane.showMessageDialog(rootPane,"PLAYER1 WINS: PRESS RESTART FOR NEW GAME","PLAYER 1 WINS",JOptionPane.INFORMATION_MESSAGE);
               destroy=true;
           }
       }
       if((b3==b5)&&(b3==b7))
       {
           if(b3==1)
           {
              JOptionPane.showMessageDialog(rootPane,"PLAYER2 WINS: PRESS RESTART FOR NEW GAME","PLAYER 2 WINS",JOptionPane.INFORMATION_MESSAGE);
               destroy=true;
           }
           else if(b3==2)
           {
              JOptionPane.showMessageDialog(rootPane,"PLAYER1 WINS: PRESS RESTART FOR NEW GAME","PLAYER 1 WINS",JOptionPane.INFORMATION_MESSAGE);
               destroy=true;
           }
       }
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
        reset = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jButton10 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        getContentPane().setLayout(null);

        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(10, 10, 43, 32);

        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(70, 10, 45, 32);

        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(130, 10, 44, 32);

        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(10, 60, 43, 31);

        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(70, 60, 46, 31);

        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(130, 60, 43, 31);

        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(10, 110, 43, 31);

        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(70, 110, 46, 31);

        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(130, 110, 43, 31);

        reset.setText("reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        getContentPane().add(reset);
        reset.setBounds(100, 277, 168, 23);

        jToggleButton1.setText("start/pause");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1);
        jToggleButton1.setBounds(240, 10, 140, 23);

        jButton10.setText("Rules");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10);
        jButton10.setBounds(240, 40, 140, 23);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 160, 160, 14);

        jPanel1.setLayout(new java.awt.BorderLayout());
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1366, 768);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        if(jToggleButton1.isSelected()==false)
        {
            JOptionPane.showMessageDialog(rootPane,"game is in pause state,resume it for resetting the game","error",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
        flag = false;
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
        i = 0;
        b1 = 0;
        b2 = 0;
        b3 = 0;
        b4 = 0;
        b5 = 0;
        b6 = 0;
        b7 = 0;
        b8 = 0;
        b9 = 0;
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
        
         jLabel2.setText("player 1 turn");
           flagger=true;
       }
       
    }//GEN-LAST:event_resetActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        if(flagger==false)
        {
            jButton9.disable();
        }
        else{
        if (destroy == false) {
            if (f9 == true) {
                JOptionPane.showMessageDialog(rootPane, "PLEASE CHOOSE AN UNPRESSED BUTTON", "BUTTON ALREADY CHOSEN", JOptionPane.ERROR_MESSAGE);
            }

            if (f9 == false) {
                if (flag == true) {
                    jButton9.setText("X");
                    jButton9.setBackground(Color.blue);
                    i = i + 1;
                    f9 = true;
                    flag = false;
                    count++;
                } else {
                    jButton9.setText("O");
                    jButton9.setBackground(Color.red);
                    i = i + 1;
                    f9 = true;
                    flag = true;
                    count++;
                }
            }
            if (i > 4) {
                assign();

            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "PLEASE RESTART THE GAME", "GAME OVER", JOptionPane.ERROR_MESSAGE);
        }
        
        if(flag==false)
        {
            jLabel2.setText("player 1 turn");
        }
        else
        {
            jLabel2.setText("player 2 turn");
        }
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
      if(flagger==false)
      {
          jButton8.disable();
      }
      else{
        if (destroy == false) {
            if (f8 == true) {
                JOptionPane.showMessageDialog(rootPane, "PLEASE CHOOSE AN UNPRESSED BUTTON", "BUTTON ALREADY CHOSEN", JOptionPane.ERROR_MESSAGE);
            }

            if (f8 == false) {
                if (flag == true) {
                    jButton8.setText("X");
                    jButton8.setBackground(Color.blue);
                    i = i + 1;
                    f8 = true;
                    flag = false;
                    count++;
                } else {
                    jButton8.setText("O");
                    jButton8.setBackground(Color.red);
                    i = i + 1;
                    f8 = true;
                    flag = true;
                    count++;
                }
            }
            if (i > 4) {
                assign();

            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "PLEASE RESTART THE GAME", "GAME OVER", JOptionPane.ERROR_MESSAGE);
        }
 if(flag==false)
        {
            jLabel2.setText("player 1 turn");
        }
        else
        {
            jLabel2.setText("player 2 turn");
        }
      }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if(flagger==false)
        {
            jButton7.disable();
        }
        else
        {
        if (destroy == false) {
            if (f7 == true) {
                JOptionPane.showMessageDialog(rootPane, "PLEASE CHOOSE AN UNPRESSED BUTTON", "BUTTON ALREADY CHOSEN", JOptionPane.ERROR_MESSAGE);
            }

            if (f7 == false) {
                if (flag == true) {
                    jButton7.setText("X");
                    jButton7.setBackground(Color.blue);
                    i = i + 1;
                    f7 = true;
                    flag = false;
                    count++;
                } else {
                    jButton7.setText("O");
                    jButton7.setBackground(Color.red);
                    i = i + 1;
                    f7 = true;
                    flag = true;
                    count++;
                }
            }
            if (i > 4) {
                assign();

            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "PLEASE RESTART THE GAME", "GAME OVER", JOptionPane.ERROR_MESSAGE);
        }
         if(flag==false)
        {
            jLabel2.setText("player 1 turn");
        }
        else
        {
            jLabel2.setText("player 2 turn");
        }
        }

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if(flagger==false)
        {
            jButton6.disable();
        }
        else
        {
        if (destroy == false) {
            if (f6 == true) {
                JOptionPane.showMessageDialog(rootPane, "PLEASE CHOOSE AN UNPRESSED BUTTON", "BUTTON ALREADY CHOSEN", JOptionPane.ERROR_MESSAGE);
            }

            if (f6 == false) {
                if (flag == true) {
                    jButton6.setText("X");
                    jButton6.setBackground(Color.blue);
                    i = i + 1;
                    f6 = true;
                    flag = false;
                    count++;
                } else {
                    jButton6.setText("O");
                    jButton6.setBackground(Color.red);
                    i = i + 1;
                    f6 = true;
                    flag = true;
                    count++;
                }
            }
            if (i > 4) {
                assign();

            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "PLEASE RESTART THE GAME", "GAME OVER", JOptionPane.ERROR_MESSAGE);
        }
           if(flag==false)
        {
            jLabel2.setText("player 1 turn");
        }
        else
        {
            jLabel2.setText("player 2 turn");
        }
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if(flagger==false)
        {
            jButton5.disable();
        }
        else
        {
        if (destroy == false) {
            if (f5 == true) {
                JOptionPane.showMessageDialog(rootPane, "PLEASE CHOOSE AN UNPRESSED BUTTON", "BUTTON ALREADY CHOSEN", JOptionPane.ERROR_MESSAGE);
            }

            if (f5 == false) {
                if (flag == true) {
                    jButton5.setText("X");
                    jButton5.setBackground(Color.blue);
                    i = i + 1;
                    f5 = true;
                    flag = false;
                    count++;
                } else {
                    jButton5.setText("O");
                    jButton5.setBackground(Color.red);
                    i = i + 1;
                    f5 = true;
                    flag = true;
                    count++;
                }
            }
            if (i > 4) {
                assign();

            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "PLEASE RESTART THE GAME", "GAME OVER", JOptionPane.ERROR_MESSAGE);
        }
             if(flag==false)
        {
            jLabel2.setText("player 1 turn");
        }
        else
        {
            jLabel2.setText("player 2 turn");
        }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(flagger==false)
        {
            jButton4.disable();
        }
        else{
        if (destroy == false) {
            if (f4 == true) {
                JOptionPane.showMessageDialog(rootPane, "PLEASE CHOOSE AN UNPRESSED BUTTON", "BUTTON ALREADY CHOSEN", JOptionPane.ERROR_MESSAGE);
            }

            if (f4 == false) {
                if (flag == true) {
                    jButton4.setText("X");
                    jButton4.setBackground(Color.blue);
                    i = i + 1;
                    f4 = true;
                    flag = false;
                    count++;
                } else {
                    jButton4.setText("O");
                    jButton4.setBackground(Color.red);
                    i = i + 1;
                    f4 = true;
                    flag = true;
                    count++;
                }
            }
            if (i > 4) {
                assign();

            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "PLEASE RESTART THE GAME", "GAME OVER", JOptionPane.ERROR_MESSAGE);
        }
         if(flag==false)
        {
            jLabel2.setText("player 1 turn");
        }
        else
        {
            jLabel2.setText("player 2 turn");
        }
        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(flagger==false)
        {
            jButton3.disable();
        }
        else
        {
        if (destroy == false) {
            if (f3 == true) {
                JOptionPane.showMessageDialog(rootPane, "PLEASE CHOOSE AN UNPRESSED BUTTON", "BUTTON ALREADY CHOSEN", JOptionPane.ERROR_MESSAGE);
            }

            if (f3 == false) {
                if (flag == true) {
                    jButton3.setText("X");
                    jButton3.setBackground(Color.blue);
                    i = i + 1;
                    f3 = true;
                    flag = false;
                    count++;
                } else {
                    jButton3.setText("O");
                    jButton3.setBackground(Color.red);
                    i = i + 1;
                    f3 = true;
                    flag = true;
                    count++;
                }
            }
            if (i > 4) {
                assign();

            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "PLEASE RESTART THE GAME", "GAME OVER", JOptionPane.ERROR_MESSAGE);
        }
             if(flag==false)
        {
            jLabel2.setText("player 1 turn");
        }
        else
        {
            jLabel2.setText("player 2 turn");
        }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(flagger==false)
        {
            jButton2.disable();
        }
        else{
        if (destroy == false) {
            if (f2 == true) {
                JOptionPane.showMessageDialog(rootPane, "PLEASE CHOOSE AN UNPRESSED BUTTON", "BUTTON ALREADY CHOSEN", JOptionPane.ERROR_MESSAGE);
            }

            if (f2 == false) {
                if (flag == true) {
                    jButton2.setText("X");
                    jButton2.setBackground(Color.blue);
                    i = i + 1;
                    f2 = true;
                    flag = false;
                    count++;
                } else {
                    jButton2.setText("O");
                    jButton2.setBackground(Color.red);
                    i = i + 1;
                    f2 = true;
                    flag = true;
                    count++;
                }
            }
            if (i > 4) {
                assign();

            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "PLEASE RESTART THE GAME", "GAME OVER", JOptionPane.ERROR_MESSAGE);
        }
           if(flag==false)
        {
            jLabel2.setText("player 1 turn");
        }
        else
        {
            jLabel2.setText("player 2 turn");
        }
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(flagger==false)
        {
            jButton1.disable();
        }
        else{
        if (destroy == false) {
            if (f1 == true) {
                JOptionPane.showMessageDialog(rootPane, "PLEASE CHOOSE AN UNPRESSED BUTTON", "BUTTON ALREADY CHOSEN", JOptionPane.ERROR_MESSAGE);
            }

            if (f1 == false) {
                if (flag == true) {
                    jButton1.setText("X");
                    jButton1.setBackground(Color.blue);
                    i = i + 1;
                    f1 = true;
                    flag = false;
                    count++;
                } else {
                    jButton1.setText("O");
                    jButton1.setBackground(Color.red);
                    i = i + 1;
                    f1 = true;
                    flag = true;
                    count++;
                }
            }
            if (i > 4) {
                assign();

            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "PLEASE RESTART THE GAME", "GAME OVER", JOptionPane.ERROR_MESSAGE);
        }
         if(flag==false)
        {
            jLabel2.setText("player 1 turn");
        }
        else
        {
            jLabel2.setText("player 2 turn");
        }
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
       if(jToggleButton1.isSelected()==true)
       {
        flagger=true;
       }
       else
       {
           flagger=false;
       }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
      tictacrules mnw=new tictacrules();
      mnw.setSize(500,350);
      mnw.setVisible(true);
    }//GEN-LAST:event_jButton10ActionPerformed

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
            java.util.logging.Logger.getLogger(Tictactoe_player.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tictactoe_player.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tictactoe_player.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tictactoe_player.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Tictactoe_player().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JButton reset;
    // End of variables declaration//GEN-END:variables
}
