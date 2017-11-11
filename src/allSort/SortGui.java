/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package allSort;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Mahmoud
 */
public class SortGui extends javax.swing.JFrame {

    /**
     * Creates new form SortGui
     */
    Bu as = new Bu(11);
    Se s = new Se(11);
    In i = new In(11);
    Me m = new Me(11);
    Qu q = new Qu(11);
    Oa o = new Oa(11);

    public SortGui() {
        setLookAndFeel();
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        ObSelec = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Num = new javax.swing.JTextField();
        Name = new javax.swing.JTextField();
        insert = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        bu = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        se = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        in = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        me = new javax.swing.JLabel();
        qc = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ar = new javax.swing.JLabel();
        sort = new javax.swing.JButton();
        numkey = new javax.swing.JTextField();
        nameKey = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ObSelec.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Integer", "String", "Integer and String" }));
        ObSelec.setSelectedItem(null);
        ObSelec.setName(""); // NOI18N
        ObSelec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ObSelecActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Chosee :");

        jLabel1.setText("Enter :");

        insert.setText("Insert");
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });

        jLabel2.setText("Bubble Sort :");

        bu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel5.setText("Selection Sort :");

        se.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel7.setText("Insertion Sort :");

        in.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel9.setText("Merge Sort :");

        jLabel10.setText("Quick Sort :");

        me.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        qc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel4.setText("Original Array :");

        ar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        sort.setText("Sort");
        sort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortActionPerformed(evt);
            }
        });

        jButton1.setText("Binary Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Clear All");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(se, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bu, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ar, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(me, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(qc, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(in, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel3)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(numkey)
                            .addComponent(Num, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(ObSelec, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Name)
                                    .addComponent(nameKey, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                        .addComponent(insert)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton2))
                                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addGap(18, 18, 18)
                                        .addComponent(sort)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)))
                .addGap(85, 85, 85))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ObSelec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insert)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numkey, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameKey, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(sort))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(bu, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(se, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(in, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(me, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(qc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58))
        );
        jLayeredPane1.setLayer(ObSelec, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(Num, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(Name, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(insert, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(bu, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(se, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(in, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(me, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(qc, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(ar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(sort, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(numkey, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(nameKey, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ObSelecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ObSelecActionPerformed
        if (ObSelec.getSelectedItem() == ObSelec.getItemAt(0)) {

            Name.setEnabled(false);
            Num.setEnabled(true);
            nameKey.setEnabled(false);
            numkey.setEnabled(true);
            as.clear();
            s.clear();
            i.clear();
            m.clear();
            q.clear();
            o.clear();
            ar.setText(null);
            bu.setText(null);
            se.setText(null);
            in.setText(null);
            me.setText(null);
            qc.setText(null);
        }
        if (ObSelec.getSelectedItem() == ObSelec.getItemAt(1)) {

            Num.setEnabled(false);
            Name.setEnabled(true);
            numkey.setEnabled(false);
            nameKey.setEnabled(true);
            as.clear();
            s.clear();
            i.clear();
            m.clear();
            q.clear();
            o.clear();
            ar.setText(null);
            bu.setText(null);
            se.setText(null);
            in.setText(null);
            me.setText(null);
            qc.setText(null);
        }
        if (ObSelec.getSelectedItem() == ObSelec.getItemAt(2)) {

            Num.setEnabled(true);
            Name.setEnabled(true);
            numkey.setEnabled(true);
            nameKey.setEnabled(true);
            as.clear();
            s.clear();
            i.clear();
            m.clear();
            q.clear();
            o.clear();
            ar.setText(null);
            bu.setText(null);
            se.setText(null);
            in.setText(null);
            me.setText(null);
            qc.setText(null);
        }
    }//GEN-LAST:event_ObSelecActionPerformed

    private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed
       if (ObSelec.getSelectedItem() == null) {
JOptionPane.showMessageDialog(null, "Choose type first");
}
        
        if (ObSelec.getSelectedItem() == ObSelec.getItemAt(0)) {
            String y = Num.getText();
            int x = Integer.parseInt(y);
            Data d = new Data(x);
            as.insert(d);
            s.insert(d);
            i.insert(d);
            m.insert(d);
            q.insert(d);
            o.insert(d);
            bu.setText(as.toString());
            ar.setText(o.toString());
            se.setText(s.toString());
            in.setText(i.toString());
            qc.setText(q.toString());
            me.setText(m.toString());

        }
        if (ObSelec.getSelectedItem() == ObSelec.getItemAt(1)) {
            String y = Name.getText();
            try {
                int l = Integer.parseInt(y);
                JOptionPane.showMessageDialog(null, "Please Enter a Name");
            } catch (NumberFormatException ex) {
                Data d = new Data(y);
                as.insert(d);
                s.insert(d);
                i.insert(d);
                m.insert(d);
                q.insert(d);
                o.insert(d);
                bu.setText(as.toString());
                ar.setText(o.toString());
                se.setText(s.toString());
                in.setText(i.toString());
                qc.setText(q.toString());
                me.setText(m.toString());

            }
        }
        if (ObSelec.getSelectedItem() == ObSelec.getItemAt(2)) {
            String y = Name.getText();
            String x = Num.getText();
            int n = Integer.parseInt(x);
            try {
                int l = Integer.parseInt(y);
                JOptionPane.showMessageDialog(null, "Please Enter a correct Name and ID");
            } catch (NumberFormatException ex) {
                Data d = new Data(y, n);
                as.insert(d);
                s.insert(d);
                i.insert(d);
                m.insert(d);
                q.insert(d);
                o.insert(d);
                bu.setText(as.toString());
                ar.setText(o.toString());
                se.setText(s.toString());
                in.setText(i.toString());
                qc.setText(q.toString());
                me.setText(m.toString());

            }
        }
    }//GEN-LAST:event_insertActionPerformed

    private void sortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortActionPerformed
if (ObSelec.getSelectedItem() == null) {
JOptionPane.showMessageDialog(null, "Choose type first");
}
        
        try {
            as.bubbleSort();
            as.bubbleSort();
            s.selectionSort();
            i.insertionSort();
            m.mergeSort();
            q.quickSort();
            ar.setText(o.toString());
            bu.setText(as.toString());
            se.setText(s.toString());
            in.setText(i.toString());
            me.setText(m.toString());
            qc.setText(q.toString());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Insert some things first then sort");
        }
    }//GEN-LAST:event_sortActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       if (ObSelec.getSelectedItem() == null) {
JOptionPane.showMessageDialog(null, "Choose type first");
}
        
        if (ObSelec.getSelectedItem() == ObSelec.getItemAt(0)) {
            String y = numkey.getText();
            int x = Integer.parseInt(y);
            Data d = new Data(x);
            as.find(d);
        }
        if (ObSelec.getSelectedItem() == ObSelec.getItemAt(1)) {
            String y = nameKey.getText();
            try {
                int l = Integer.parseInt(y);
                JOptionPane.showMessageDialog(null, "Please Enter a Name");
            } catch (NumberFormatException ex) {
                Data d = new Data(y);
                as.find(d);
            }
        }
        if (ObSelec.getSelectedItem() == ObSelec.getItemAt(2)) {
            String y = nameKey.getText();
            String x = numkey.getText();
            int m = Integer.parseInt(x);
            try {
                int l = Integer.parseInt(y);
                JOptionPane.showMessageDialog(null, "Please Enter a correct Name and ID");
            } catch (NumberFormatException ex) {
                Data d = new Data(y, m);
                as.find(d);
            }
        }
        numkey.setText(null);
        nameKey.setText(null);


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        o.clear();
        as.clear();
        as.clear();
        s.clear();
        i.clear();
        m.clear();
        q.clear();
        ar.setText(o.toString());
        bu.setText(as.toString());
        se.setText(s.toString());
        in.setText(i.toString());
        me.setText(m.toString());
        qc.setText(q.toString());
    }//GEN-LAST:event_jButton2ActionPerformed
    public void setLookAndFeel() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SortGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */

        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SortGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Name;
    private javax.swing.JTextField Num;
    private javax.swing.JComboBox ObSelec;
    private javax.swing.JLabel ar;
    private javax.swing.JLabel bu;
    private javax.swing.JLabel in;
    private javax.swing.JButton insert;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLabel me;
    private javax.swing.JTextField nameKey;
    private javax.swing.JTextField numkey;
    private javax.swing.JLabel qc;
    private javax.swing.JLabel se;
    private javax.swing.JButton sort;
    // End of variables declaration//GEN-END:variables
}