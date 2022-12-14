/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo;

import Seat.*;

/**
 *
 * @author Chinmay
 */
public class StadiumSeatPlan extends javax.swing.JFrame {

    /**
     * Creates new form StadiumSeatPlan
     */
    String str;
    public StadiumSeatPlan() {
        initComponents();
        platinumRadioButton.setSelected(true);
        User.tseat=platinumRadioButton.getText();
        User.seatFare=7000;
        User.seatname="platinumseat";
        EventjLabel.setText(User.event+">>Select seat type");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TitlePanel = new javax.swing.JPanel();
        TitleLabel = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        TitlePanel1 = new javax.swing.JPanel();
        TitleLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        proceedButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        royalBoxRadioButton = new javax.swing.JRadioButton();
        gen1RadioButton = new javax.swing.JRadioButton();
        gen2RadioButton = new javax.swing.JRadioButton();
        int1RadioButton = new javax.swing.JRadioButton();
        vipBox2RadioButton = new javax.swing.JRadioButton();
        int2RadioButton = new javax.swing.JRadioButton();
        corp2RadioButton = new javax.swing.JRadioButton();
        platinumRadioButton = new javax.swing.JRadioButton();
        prem2RadioButton = new javax.swing.JRadioButton();
        corp1RadioButton = new javax.swing.JRadioButton();
        vipbox1RadioButton = new javax.swing.JRadioButton();
        prem1RadioButton = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        EventjLabel = new javax.swing.JLabel();

        TitlePanel.setBackground(java.awt.SystemColor.textHighlight);
        TitlePanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TitlePanel.setPreferredSize(new java.awt.Dimension(766, 120));

        TitleLabel.setBackground(new java.awt.Color(0, 0, 153));
        TitleLabel.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        TitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleLabel.setText("Stadium Seat Booking System");
        TitleLabel.setIconTextGap(0);

        javax.swing.GroupLayout TitlePanelLayout = new javax.swing.GroupLayout(TitlePanel);
        TitlePanel.setLayout(TitlePanelLayout);
        TitlePanelLayout.setHorizontalGroup(
            TitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TitlePanelLayout.createSequentialGroup()
                .addContainerGap(288, Short.MAX_VALUE)
                .addComponent(TitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(252, 252, 252))
        );
        TitlePanelLayout.setVerticalGroup(
            TitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TitlePanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(TitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        TitlePanel1.setBackground(java.awt.SystemColor.textHighlight);
        TitlePanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TitlePanel1.setPreferredSize(new java.awt.Dimension(766, 120));

        TitleLabel1.setBackground(new java.awt.Color(0, 0, 153));
        TitleLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        TitleLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleLabel1.setText("Stadium Seat Booking System");
        TitleLabel1.setIconTextGap(0);

        javax.swing.GroupLayout TitlePanel1Layout = new javax.swing.GroupLayout(TitlePanel1);
        TitlePanel1.setLayout(TitlePanel1Layout);
        TitlePanel1Layout.setHorizontalGroup(
            TitlePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TitlePanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TitleLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(252, 252, 252))
        );
        TitlePanel1Layout.setVerticalGroup(
            TitlePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TitlePanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(TitleLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setText("Select your seating area to proceed");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PriceChart.png"))); // NOI18N

        proceedButton.setText("Proceed");
        proceedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proceedButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(royalBoxRadioButton);
        royalBoxRadioButton.setText("Royal Box");
        royalBoxRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                royalBoxRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(gen1RadioButton);
        gen1RadioButton.setText("General Addmission West");
        gen1RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gen1RadioButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(gen2RadioButton);
        gen2RadioButton.setText("General Addmission East");
        gen2RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gen2RadioButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(int1RadioButton);
        int1RadioButton.setText("International Seats West");
        int1RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                int1RadioButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(vipBox2RadioButton);
        vipBox2RadioButton.setText("VIP Box East");
        vipBox2RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vipBox2RadioButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(int2RadioButton);
        int2RadioButton.setText("International Seats East");
        int2RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                int2RadioButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(corp2RadioButton);
        corp2RadioButton.setText("Corporate Box East");
        corp2RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                corp2RadioButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(platinumRadioButton);
        platinumRadioButton.setText("Platinum Seats");
        platinumRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                platinumRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(prem2RadioButton);
        prem2RadioButton.setText("Premium Seats East");
        prem2RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prem2RadioButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(corp1RadioButton);
        corp1RadioButton.setText("Corporate Box West");
        corp1RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                corp1RadioButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(vipbox1RadioButton);
        vipbox1RadioButton.setText("VIP Box West");
        vipbox1RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vipbox1RadioButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(prem1RadioButton);
        prem1RadioButton.setText("Premium Seats West");
        prem1RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prem1RadioButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gen2RadioButton)
                    .addComponent(platinumRadioButton)
                    .addComponent(royalBoxRadioButton)
                    .addComponent(vipbox1RadioButton)
                    .addComponent(vipBox2RadioButton)
                    .addComponent(prem1RadioButton)
                    .addComponent(prem2RadioButton)
                    .addComponent(corp1RadioButton)
                    .addComponent(corp2RadioButton)
                    .addComponent(int1RadioButton)
                    .addComponent(int2RadioButton)
                    .addComponent(gen1RadioButton))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(platinumRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(royalBoxRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(vipbox1RadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(vipBox2RadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(prem1RadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(prem2RadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(corp1RadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(corp2RadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(int1RadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(int2RadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gen1RadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(gen2RadioButton)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(118, 118, 118)
                                .addComponent(proceedButton)
                                .addGap(20, 20, 20))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel3)
                        .addGap(69, 69, 69)
                        .addComponent(proceedButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jPanel3.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/venue_40 - Copy.jpg"))); // NOI18N
        jLabel1.setIconTextGap(0);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        EventjLabel.setText("jLabel4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TitlePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1050, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(EventjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TitlePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(EventjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void platinumRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_platinumRadioButtonActionPerformed
        User.tseat=platinumRadioButton.getText();
        User.seatFare=7000;
        User.seatname="platinumseat";
    }//GEN-LAST:event_platinumRadioButtonActionPerformed

    private void royalBoxRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_royalBoxRadioButtonActionPerformed
       User.tseat=royalBoxRadioButton.getText();
       User.seatFare=5000;
       User.seatname="royalbox";
    }//GEN-LAST:event_royalBoxRadioButtonActionPerformed

    private void vipbox1RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vipbox1RadioButtonActionPerformed
       User.tseat=vipbox1RadioButton.getText();
       User.seatFare=4500;
       User.seatname="vipboxwest";
    }//GEN-LAST:event_vipbox1RadioButtonActionPerformed

    private void vipBox2RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vipBox2RadioButtonActionPerformed
       User.tseat=vipBox2RadioButton.getText();
       User.seatFare=4500;
       User.seatname="vipboxeast";
    }//GEN-LAST:event_vipBox2RadioButtonActionPerformed

    private void prem1RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prem1RadioButtonActionPerformed
       User.tseat=prem1RadioButton.getText();
       User.seatFare=4000;
       User.seatname="premiumseatwest";
    }//GEN-LAST:event_prem1RadioButtonActionPerformed

    private void prem2RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prem2RadioButtonActionPerformed
        User.tseat=prem2RadioButton.getText();
        User.seatFare=4000;
        User.seatname="premiumseateast";
    }//GEN-LAST:event_prem2RadioButtonActionPerformed

    private void corp1RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_corp1RadioButtonActionPerformed
        User.tseat=corp1RadioButton.getText();
        User.seatFare=3000;
        User.seatname="corporateboxwest";
    }//GEN-LAST:event_corp1RadioButtonActionPerformed

    private void corp2RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_corp2RadioButtonActionPerformed
        User.tseat=corp2RadioButton.getText();
        User.seatFare=3000;
        User.seatname="corporateboxeast";
    }//GEN-LAST:event_corp2RadioButtonActionPerformed

    private void int1RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_int1RadioButtonActionPerformed
       User.tseat=int1RadioButton.getText();
       User.seatFare=2000;
       User.seatname="interenationalwest";
    }//GEN-LAST:event_int1RadioButtonActionPerformed

    private void int2RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_int2RadioButtonActionPerformed
      User.tseat=int2RadioButton.getText();
      User.seatFare=2000;
      User.seatname="interenationaleast";
    }//GEN-LAST:event_int2RadioButtonActionPerformed

    private void gen1RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gen1RadioButtonActionPerformed
       User.tseat=gen1RadioButton.getText();
       User.seatFare=1000;
       User.seatname="generalwest";
    }//GEN-LAST:event_gen1RadioButtonActionPerformed

    private void gen2RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gen2RadioButtonActionPerformed
      User.tseat=gen2RadioButton.getText();
      User.seatFare=1000;
      User.seatname="generaleast";
    }//GEN-LAST:event_gen2RadioButtonActionPerformed

    private void proceedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proceedButtonActionPerformed
        User.dbupdate="update "+User.seatname+" set "+User.statusname +"=false where seat_num=?";
        if(platinumRadioButton.isSelected())
        {
            PlatinumSeat platinumSeat = new PlatinumSeat();
            platinumSeat.setVisible(true);
        }
        else if(royalBoxRadioButton.isSelected())
        {
            RoyalBox royalBox = new RoyalBox();
            royalBox.setVisible(true);            
        }    
        else if(vipbox1RadioButton.isSelected()||vipBox2RadioButton.isSelected())
        {
            VIPBox vipBox = new VIPBox();
            vipBox.setVisible(true);            
        }
        else if(prem1RadioButton.isSelected()||prem2RadioButton.isSelected()||corp1RadioButton.isSelected()||corp2RadioButton.isSelected())
        {
            PremiumSeatAndCorporateBox p = new PremiumSeatAndCorporateBox();
            p.setVisible(true);
        }
        else if(int1RadioButton.isSelected()||int2RadioButton.isSelected())
        {
            InternationalSeat internationalSeat = new InternationalSeat();
            internationalSeat.setVisible(true);
        }
        else if(gen1RadioButton.isSelected()||gen2RadioButton.isSelected())
        {
            GeneralSeat generalSeat = new GeneralSeat();
            generalSeat.setVisible(true);
        }
        this.dispose();
    }//GEN-LAST:event_proceedButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        User.tseat=null;
        User.seatFare=0;
        User.seatname=null;
        UserHome userHome = new UserHome();
        userHome.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StadiumSeatPlan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StadiumSeatPlan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StadiumSeatPlan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StadiumSeatPlan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StadiumSeatPlan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EventjLabel;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JLabel TitleLabel1;
    private javax.swing.JPanel TitlePanel;
    private javax.swing.JPanel TitlePanel1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton corp1RadioButton;
    private javax.swing.JRadioButton corp2RadioButton;
    private javax.swing.JRadioButton gen1RadioButton;
    private javax.swing.JRadioButton gen2RadioButton;
    private javax.swing.JRadioButton int1RadioButton;
    private javax.swing.JRadioButton int2RadioButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton platinumRadioButton;
    private javax.swing.JRadioButton prem1RadioButton;
    private javax.swing.JRadioButton prem2RadioButton;
    private javax.swing.JButton proceedButton;
    private javax.swing.JRadioButton royalBoxRadioButton;
    private javax.swing.JRadioButton vipBox2RadioButton;
    private javax.swing.JRadioButton vipbox1RadioButton;
    // End of variables declaration//GEN-END:variables
}

