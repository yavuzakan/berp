
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yca
 */
public class u1011 extends javax.swing.JFrame {
    public  Connection c;
 public Statement st;
public  ResultSet rs;
    /**
     * Creates new form u1011
     */
    public u1011() {
        initComponents();
        jTextField4.setVisible(false);
        jTextField5.setVisible(false);
         jTable1.setShowGrid(true);
         jTable1.setAutoCreateRowSorter(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Üretim Emri - U101");

        jLabel1.setText("Müşteri İsmi");

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });

        jLabel2.setText("Ürün");

        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
        });

        jLabel3.setText("Teslim Tarihi");

        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField3KeyPressed(evt);
            }
        });

        jButton1.setText("Ara");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Müşteri İsmi", "Müşteri Notları", "Satılan Ürün", "Ürün Not", "Fiyat", "Miktar", "Teslim Tarihi", "Durum", "id"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setColumnSelectionAllowed(true);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(8).setMinWidth(0);
            jTable1.getColumnModel().getColumn(8).setMaxWidth(0);
        }

        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(jTextField1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(jTextField2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(133, 133, 133)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 761, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            this.ara();
        }
        if(evt.getKeyCode() == KeyEvent.VK_ESCAPE)
        {
            jTextField1.setText("");
        }

    }//GEN-LAST:event_jTextField1KeyPressed

    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            this.ara();
        }
        if(evt.getKeyCode() == KeyEvent.VK_ESCAPE)
        {
            jTextField2.setText("");
        }

    }//GEN-LAST:event_jTextField2KeyPressed

    private void jTextField3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            this.ara();
        }
        if(evt.getKeyCode() == KeyEvent.VK_ESCAPE)
        {
            jTextField3.setText("");
        }
    }//GEN-LAST:event_jTextField3KeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.ara();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
         DefaultTableModel tablo = (DefaultTableModel) jTable1.getModel();
         jTextField4.setText(tablo.getValueAt(jTable1.getSelectedRow(), 8).toString());
         jTextField5.setText(tablo.getValueAt(jTable1.getSelectedRow(), 6).toString());
        jButton2.setLabel(tablo.getValueAt(jTable1.getSelectedRow(), 2).toString());
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       u101.jTextField1.setText(jButton2.getText());
       u101.jTextField2.setText(jTextField5.getText());
       u101.jTextField7.setText(jTextField4.getText());
        
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(u1011.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(u1011.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(u1011.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(u1011.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new u1011().setVisible(true);
            }
        });
    }
    
      public void ara()
    {
     
        DefaultTableModel tablo = (DefaultTableModel) jTable1.getModel();         
        int rows = tablo.getRowCount(); 
        for(int i = rows - 1; i >=0; i--)
        {
           tablo.removeRow(i); 
        }
   
        String musteriara = jTextField1.getText();
        String urunara = jTextField2.getText();
        String testarihara = jTextField3.getText();
    


  
   try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:berp.sqlite");
            st = c.createStatement();
            
             String query = "SELECT * FROM satislar where musteri like '%"+ musteriara +"%' and urun like '%"+ urunara +"%' and testarih like '%"+ testarihara +"%' and durum like '%eni%' ";
      
             
        rs = st.executeQuery(query);
       
               while(rs.next())
         {
             
            String id  = rs.getString("id"); 
            String musteri = rs.getString("musteri"); 
            String musnot = rs.getString("musnot"); 
            String urun  = rs.getString("urun"); 
            String urunnot  = rs.getString("urunnot"); 
            String fiyat  = rs.getString("fiyat"); 
            String miktar = rs.getString("miktar"); 
            String  birim  = rs.getString("birim"); 
            String testarih  = rs.getString("testarih"); 
            String durum  = rs.getString("durum"); 
     
           
          //yarım bıraktın devam et.
        tablo.addRow(new Object[] {  musteri , musnot , urun , urunnot , fiyat , miktar + " - " + birim ,testarih , durum , id });

         
         }
 c.close();
rs.close();
st.close();

       }
       catch ( Exception e ) {
      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
      System.exit(0);
    }
        
        
        
    } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
