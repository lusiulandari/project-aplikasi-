/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum7;

/**
 *
 * @author ASUS
 */
public class praktikum7 extends javax.swing.JFrame {

    /**
     * Creates new form praktikum7
     */
    public praktikum7() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jeniskelamin = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtnama = new javax.swing.JTextField();
        txtnim = new javax.swing.JTextField();
        txttm = new javax.swing.JTextField();
        txtalamat = new javax.swing.JTextField();
        rdlaki = new javax.swing.JRadioButton();
        rdperempuan = new javax.swing.JRadioButton();
        cbagama = new javax.swing.JComboBox<>();
        txtasal = new javax.swing.JTextField();
        cxbsetatus = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        btproses = new javax.swing.JButton();
        btreset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setText("BIODATA");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(130, 10, 60, 14);

        jLabel2.setText("Nama");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(7, 50, 30, 14);

        jLabel3.setText("NIM/TM");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(4, 80, 40, 20);

        jLabel4.setText("Alamat");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 120, 40, 14);

        jLabel5.setText("Jenis Kelamin");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 144, 63, 20);

        jLabel6.setText("Agama");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 174, 40, 20);

        jLabel8.setText("status");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 244, 40, 20);

        jLabel9.setText("Daerah Asal");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 214, 70, 30);
        getContentPane().add(txtnama);
        txtnama.setBounds(120, 50, 160, 20);

        txtnim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnimActionPerformed(evt);
            }
        });
        getContentPane().add(txtnim);
        txtnim.setBounds(120, 80, 80, 20);
        getContentPane().add(txttm);
        txttm.setBounds(210, 80, 80, 20);
        getContentPane().add(txtalamat);
        txtalamat.setBounds(120, 120, 80, 20);

        jeniskelamin.add(rdlaki);
        rdlaki.setText("laki-laki");
        getContentPane().add(rdlaki);
        rdlaki.setBounds(120, 150, 59, 23);

        jeniskelamin.add(rdperempuan);
        rdperempuan.setText("perempuan");
        getContentPane().add(rdperempuan);
        rdperempuan.setBounds(193, 150, 80, 23);

        cbagama.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "islam", "katolik", "kristen", "hindu", "budha" }));
        getContentPane().add(cbagama);
        cbagama.setBounds(120, 180, 60, 20);
        getContentPane().add(txtasal);
        txtasal.setBounds(120, 220, 100, 20);

        cxbsetatus.setText("belummenikah");
        getContentPane().add(cxbsetatus);
        cxbsetatus.setBounds(120, 250, 93, 23);

        area.setColumns(20);
        area.setRows(5);
        jScrollPane1.setViewportView(area);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 300, 190, 96);

        btproses.setText("proses");
        btproses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btprosesActionPerformed(evt);
            }
        });
        getContentPane().add(btproses);
        btproses.setBounds(300, 310, 60, 20);

        btreset.setText("reset");
        getContentPane().add(btreset);
        btreset.setBounds(300, 340, 57, 23);

        setSize(new java.awt.Dimension(416, 440));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtnimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnimActionPerformed

    private void btprosesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btprosesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btprosesActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
     txtnama.setText(""); 
     txtnim.setText("");
     txttm.setText("");
     txtalamat.setText("");
     txtasal.setText(""); // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(praktikum7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(praktikum7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(praktikum7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(praktikum7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new praktikum7().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea area;
    private javax.swing.JButton btproses;
    private javax.swing.JButton btreset;
    private javax.swing.JComboBox<String> cbagama;
    private javax.swing.JCheckBox cxbsetatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.ButtonGroup jeniskelamin;
    private javax.swing.JRadioButton rdlaki;
    private javax.swing.JRadioButton rdperempuan;
    private javax.swing.JTextField txtalamat;
    private javax.swing.JTextField txtasal;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtnim;
    private javax.swing.JTextField txttm;
    // End of variables declaration//GEN-END:variables
}
