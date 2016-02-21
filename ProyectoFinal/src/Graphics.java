
import java.io.*;
import javax.swing.*;

public class Graphics extends javax.swing.JFrame {

    private String globalVariable="";


    public Graphics() {
        initComponents();
        jTextField1.setText("0");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        Number1 = new javax.swing.JButton();
        Number2 = new javax.swing.JButton();
        Number3 = new javax.swing.JButton();
        Number4 = new javax.swing.JButton();
        Number5 = new javax.swing.JButton();
        Number6 = new javax.swing.JButton();
        Number7 = new javax.swing.JButton();
        Number8 = new javax.swing.JButton();
        Number9 = new javax.swing.JButton();
        sumButton = new javax.swing.JButton();
        subtractButton = new javax.swing.JButton();
        divisionButton = new javax.swing.JButton();
        Del = new javax.swing.JButton();
        Point = new javax.swing.JButton();
        Number0 = new javax.swing.JButton();
        productButton = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        equalButton = new javax.swing.JButton();
        SaveOperation = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jCheckBox1.setText("Checked");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        Number1.setText("1");
        Number1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Number1ActionPerformed(evt);
            }
        });

        Number2.setText("2");
        Number2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Number2ActionPerformed(evt);
            }
        });

        Number3.setText("3");
        Number3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Number3ActionPerformed(evt);
            }
        });

        Number4.setText("4");
        Number4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Number4ActionPerformed(evt);
            }
        });

        Number5.setText("5");
        Number5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Number5ActionPerformed(evt);
            }
        });

        Number6.setText("6");
        Number6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Number6ActionPerformed(evt);
            }
        });

        Number7.setText("7");
        Number7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Number7ActionPerformed(evt);
            }
        });

        Number8.setText("8");
        Number8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Number8ActionPerformed(evt);
            }
        });

        Number9.setText("9");
        Number9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Number9ActionPerformed(evt);
            }
        });

        sumButton.setText("+");
        sumButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumButtonActionPerformed(evt);
            }
        });

        subtractButton.setText("-");
        subtractButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtractButtonActionPerformed(evt);
            }
        });

        divisionButton.setText("/");
        divisionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisionButtonActionPerformed(evt);
            }
        });

        Del.setText("<-");
        Del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DelActionPerformed(evt);
            }
        });

        Point.setText(".");
        Point.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PointActionPerformed(evt);
            }
        });

        Number0.setText("0");
        Number0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Number0ActionPerformed(evt);
            }
        });

        productButton.setText("*");
        productButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productButtonActionPerformed(evt);
            }
        });

        equalButton.setText("=");
        equalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalButtonActionPerformed(evt);
            }
        });

        SaveOperation.setText("Save");
        SaveOperation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveOperationActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(Number1)
                                .add(15, 15, 15)
                                .add(Number2)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(Number3)
                                .add(6, 6, 6)
                                .add(sumButton))
                            .add(layout.createSequentialGroup()
                                .add(Number4)
                                .add(18, 18, 18)
                                .add(Number5)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(Number6)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(subtractButton))
                            .add(layout.createSequentialGroup()
                                .add(Number7)
                                .add(18, 18, 18)
                                .add(Number8)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(Number9)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(divisionButton))
                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                                .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                                    .add(jCheckBox1)
                                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                    .add(SaveOperation)
                                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .add(equalButton))
                                .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                                    .add(Del)
                                    .add(18, 18, 18)
                                    .add(Number0)
                                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                    .add(Point)
                                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                    .add(productButton))))
                        .addContainerGap(41, Short.MAX_VALUE))
                    .add(layout.createSequentialGroup()
                        .add(jTextField1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
                        .add(20, 20, 20))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jTextField1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 56, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(9, 9, 9)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(Number2)
                    .add(Number3)
                    .add(sumButton)
                    .add(Number1))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(Number4)
                    .add(Number5)
                    .add(Number6)
                    .add(subtractButton))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(Number7)
                    .add(Number8)
                    .add(Number9)
                    .add(divisionButton))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(Del)
                    .add(productButton)
                    .add(Number0)
                    .add(Point))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jCheckBox1)
                    .add(equalButton)
                    .add(SaveOperation))
                .addContainerGap(120, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sumButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumButtonActionPerformed
        globalVariable=jTextField1.getText();
        jTextField1.setText(globalVariable+"+");
    }//GEN-LAST:event_sumButtonActionPerformed

    private void Number1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Number1ActionPerformed
        globalVariable=jTextField1.getText();
        jTextField1.setText(globalVariable+"1");
    }//GEN-LAST:event_Number1ActionPerformed

    private void Number2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Number2ActionPerformed
        globalVariable=jTextField1.getText();
        jTextField1.setText(globalVariable+"2");
    }//GEN-LAST:event_Number2ActionPerformed

    private void Number3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Number3ActionPerformed
        globalVariable=jTextField1.getText();
        jTextField1.setText(globalVariable+"3");

    }//GEN-LAST:event_Number3ActionPerformed

    private void Number4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Number4ActionPerformed
        globalVariable=jTextField1.getText();
        jTextField1.setText(globalVariable+"4");

    }//GEN-LAST:event_Number4ActionPerformed

    private void Number5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Number5ActionPerformed
        globalVariable=jTextField1.getText();
        jTextField1.setText(globalVariable+"5");
    }//GEN-LAST:event_Number5ActionPerformed

    private void Number6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Number6ActionPerformed
        globalVariable=jTextField1.getText();
        jTextField1.setText(globalVariable+"6");
    }//GEN-LAST:event_Number6ActionPerformed

    private void Number7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Number7ActionPerformed
        globalVariable=jTextField1.getText();
        jTextField1.setText(globalVariable+"7");
    }//GEN-LAST:event_Number7ActionPerformed

    private void Number8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Number8ActionPerformed
        globalVariable=jTextField1.getText();
        jTextField1.setText(globalVariable+"8");
    }//GEN-LAST:event_Number8ActionPerformed

    private void Number9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Number9ActionPerformed
        globalVariable=jTextField1.getText();
        jTextField1.setText(globalVariable+"9");
    }//GEN-LAST:event_Number9ActionPerformed

    private void Number0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Number0ActionPerformed
        globalVariable=jTextField1.getText();
        jTextField1.setText(globalVariable+"0");
    }//GEN-LAST:event_Number0ActionPerformed

    private void PointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PointActionPerformed
        globalVariable=jTextField1.getText();
        jTextField1.setText(globalVariable+".");
    }//GEN-LAST:event_PointActionPerformed

    private void DelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DelActionPerformed
            int howLongIsThis=Integer.parseInt(jTextField1.getText());
            globalVariable=jTextField1.getText();
            //jTextField1.setText(""+globalVariable.substring(globalVariable,howLongIsThis-1));

    }//GEN-LAST:event_DelActionPerformed

    private void subtractButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtractButtonActionPerformed
        globalVariable=jTextField1.getText();
        jTextField1.setText(globalVariable+"-");
    }//GEN-LAST:event_subtractButtonActionPerformed

    private void divisionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisionButtonActionPerformed
        globalVariable=jTextField1.getText();
        jTextField1.setText(globalVariable+"/");
    }//GEN-LAST:event_divisionButtonActionPerformed

    private void productButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productButtonActionPerformed
        globalVariable=jTextField1.getText();
        jTextField1.setText(globalVariable+"*");
    }//GEN-LAST:event_productButtonActionPerformed

    private void equalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalButtonActionPerformed
        globalVariable=jTextField1.getText();
        jTextField1.setText(globalVariable+"=");
    }//GEN-LAST:event_equalButtonActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed

    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void SaveOperationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveOperationActionPerformed
        if (jCheckBox1.isSelected()) {
            try{
                 FileWriter write = new FileWriter("/prueba.txt",true);
                 PrintWriter printOnText = new PrintWriter(write);
                 printOnText.println(jTextField1.getText());
                 printOnText.close();
          }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Error: "+ex.toString());

            }
        }
    }//GEN-LAST:event_SaveOperationActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Graphics().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Del;
    private javax.swing.JButton Number0;
    private javax.swing.JButton Number1;
    private javax.swing.JButton Number2;
    private javax.swing.JButton Number3;
    private javax.swing.JButton Number4;
    private javax.swing.JButton Number5;
    private javax.swing.JButton Number6;
    private javax.swing.JButton Number7;
    private javax.swing.JButton Number8;
    private javax.swing.JButton Number9;
    private javax.swing.JButton Point;
    private javax.swing.JButton SaveOperation;
    private javax.swing.JButton divisionButton;
    private javax.swing.JButton equalButton;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton productButton;
    private javax.swing.JButton subtractButton;
    private javax.swing.JButton sumButton;
    // End of variables declaration//GEN-END:variables

}
