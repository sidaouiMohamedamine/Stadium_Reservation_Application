
import java.sql.*;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SIDAOUI
 */
public class Formulaire extends javax.swing.JFrame {
            DefaultTableModel d=new DefaultTableModel();
    /**
     * Creates new form Formulaire
     */
    public Formulaire() {
        initComponents();
        d=(DefaultTableModel)jTable1.getModel();
    }
    //public ArrayList user
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cin = new javax.swing.JTextField();
        nom = new javax.swing.JTextField();
        prenom = new javax.swing.JTextField();
        adr = new javax.swing.JTextField();
        ntel = new javax.swing.JTextField();
        nbj = new javax.swing.JTextField();
        date = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        cmt = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        hr = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Formulaire");
        setBackground(new java.awt.Color(51, 204, 0));
        setBounds(new java.awt.Rectangle(300, 150, 350, 350));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setSize(new java.awt.Dimension(500, 500));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 204, 0));

        jLabel2.setBackground(new java.awt.Color(0, 204, 51));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Inscrivez vous");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 54, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 630, 60);

        jPanel2.setBackground(new java.awt.Color(0, 204, 0));
        jPanel2.setMinimumSize(new java.awt.Dimension(800, 600));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Cin:");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(50, 100, 50, 22);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Nom:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(50, 130, 70, 22);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Prénom:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(50, 160, 70, 22);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setText("Adresse:");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(50, 190, 70, 22);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setText("N°tel:");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(50, 220, 50, 14);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setText("Nb_Joueur:");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(50, 250, 110, 22);

        jLabel9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel9.setText("Date:");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(50, 280, 50, 22);

        jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel8.setText("Commentaire:");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(40, 370, 120, 22);
        jPanel2.add(cin);
        cin.setBounds(200, 100, 150, 20);

        nom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomActionPerformed(evt);
            }
        });
        jPanel2.add(nom);
        nom.setBounds(200, 130, 150, 20);
        jPanel2.add(prenom);
        prenom.setBounds(200, 160, 150, 20);

        adr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adrActionPerformed(evt);
            }
        });
        jPanel2.add(adr);
        adr.setBounds(200, 190, 150, 20);

        ntel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ntelActionPerformed(evt);
            }
        });
        jPanel2.add(ntel);
        ntel.setBounds(200, 220, 150, 20);
        jPanel2.add(nbj);
        nbj.setBounds(200, 250, 150, 20);
        jPanel2.add(date);
        date.setBounds(100, 280, 80, 30);

        cmt.setColumns(20);
        cmt.setRows(5);
        jScrollPane1.setViewportView(cmt);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(180, 340, 290, 100);

        jLabel11.setForeground(new java.awt.Color(255, 51, 51));
        jLabel11.setText("*");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(290, 100, 6, 14);

        jLabel10.setForeground(new java.awt.Color(255, 0, 51));
        jLabel10.setText("*");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(290, 130, 6, 14);

        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setText("*");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(290, 160, 6, 14);

        jLabel13.setForeground(new java.awt.Color(255, 0, 0));
        jLabel13.setText("*");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(290, 190, 6, 14);

        jLabel14.setForeground(new java.awt.Color(255, 0, 51));
        jLabel14.setText("*");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(290, 220, 6, 14);

        jLabel15.setForeground(new java.awt.Color(255, 0, 0));
        jLabel15.setText("*");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(240, 250, 6, 14);

        jLabel16.setForeground(new java.awt.Color(255, 0, 0));
        jLabel16.setText("*");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(190, 280, 6, 14);

        jLabel17.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel17.setText("Heure");
        jPanel2.add(jLabel17);
        jLabel17.setBounds(210, 280, 49, 20);

        hr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hrActionPerformed(evt);
            }
        });
        jPanel2.add(hr);
        hr.setBounds(280, 280, 80, 30);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jButton1.setText("Réserver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(120, 460, 140, 30);

        jButton2.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        jButton2.setText("Consulter");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(500, 230, 120, 30);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nom", "Prénom", "Date"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(400, 100, 350, 120);

        jLabel18.setForeground(new java.awt.Color(204, 0, 0));
        jLabel18.setText("format:DD-MM-YY|| HH:MM");
        jPanel2.add(jLabel18);
        jLabel18.setBounds(400, 280, 170, 20);

        jButton3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton3.setText("Supprimer");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(320, 460, 130, 30);

        jLabel19.setForeground(new java.awt.Color(255, 51, 0));
        jLabel19.setText("*");
        jPanel2.add(jLabel19);
        jLabel19.setBounds(360, 250, 40, 14);

        jLabel20.setForeground(new java.awt.Color(255, 51, 0));
        jLabel20.setText("*");
        jPanel2.add(jLabel20);
        jLabel20.setBounds(360, 210, 20, 40);

        jLabel21.setForeground(new java.awt.Color(255, 51, 0));
        jLabel21.setText("*");
        jPanel2.add(jLabel21);
        jLabel21.setBounds(370, 270, 40, 40);

        jLabel22.setForeground(new java.awt.Color(255, 51, 0));
        jLabel22.setText("*");
        jPanel2.add(jLabel22);
        jLabel22.setBounds(360, 90, 40, 40);

        jLabel23.setForeground(new java.awt.Color(255, 51, 0));
        jLabel23.setText("*");
        jPanel2.add(jLabel23);
        jLabel23.setBounds(360, 120, 40, 40);

        jLabel24.setForeground(new java.awt.Color(255, 51, 0));
        jLabel24.setText("*");
        jPanel2.add(jLabel24);
        jLabel24.setBounds(360, 150, 40, 40);

        jLabel25.setForeground(new java.awt.Color(255, 51, 0));
        jLabel25.setText("*");
        jPanel2.add(jLabel25);
        jLabel25.setBounds(360, 180, 40, 40);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setText("Fermer");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4);
        jButton4.setBounds(543, 460, 120, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 1220, 550);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hrActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  
        if (nom.getText().equals("")||prenom.getText().equals("")||cin.getText().equals("")||adr.getText().equals("")||ntel.getText().equals("")||date.getText().equals("")||hr.getText().equals(""))
        {JOptionPane.showMessageDialog(null,"Remplir Tous Les Champs!!");}
          else
           {
            try {
                
                Class.forName("com.mysql.jdbc.Driver");
            } catch (Exception e) {
                System.out.println("Erreur Driver!!");

            }
            try
            {String url="jdbc:mysql://localhost/joueur";
             String user="root";
             String mp="0000";
                Connection cnx=DriverManager.getConnection(url,user,mp);
                PreparedStatement st=cnx.prepareStatement("insert into info(cin,nom,prenom,adresse,num,date,heur,commentaire,nbjoueur)values(?,?,?,?,?,?,?,?,?)");
                st.setString(1,cin.getText());
                st.setString(2,nom.getText());
                st.setString(3,prenom.getText());
                st.setString(4,adr.getText());
                st.setString(5,ntel.getText());
                st.setString(6,date.getText());
                st.setString(7,hr.getText());
                st.setString(8,cmt.getText());
                st.setString(9,nbj.getText());
                st.execute();
                JOptionPane.showMessageDialog(null,"Vous Allez Recevoir Un Message de Confirmation");
     
            }
            catch(Exception e)
            {
                System.out.println("Erreur Connection");
            }
                   
                   
                   
                   
       
                   
                   }
                          
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ntelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ntelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ntelActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
try {
                
                Class.forName("com.mysql.jdbc.Driver");
            } catch (Exception e) {
                System.out.println("Erreur Driver!!");

            }
            try
            {String url="jdbc:mysql://localhost/joueur";
             String user="root";
             String mp="0000";
                Connection cnx=DriverManager.getConnection(url,user,mp);
                Statement st=cnx.createStatement();
                ResultSet rs=st.executeQuery("select  nom,prenom,date,heur from info");
                while(rs.next())
                {
                    String nom=rs.getString("nom");      
                    String prenom=rs.getString("prenom");    
                    String date=rs.getString("date");
                    String heur=rs.getString("heur");
                String dt=date+'-'+heur;
                String []ligne;
                ligne = new String[]{nom,prenom,dt};
                d.addRow(ligne);

                }
                    
            }
            catch(Exception e)
            {
                System.out.println("Erreur Connection");
            }                       

    }//GEN-LAST:event_jButton2ActionPerformed

    private void adrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adrActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
          String msg=JOptionPane.showInputDialog("Votre Cin");
try {
                
                Class.forName("com.mysql.jdbc.Driver");
            } catch (Exception e) {
                System.out.println("Erreur Driver!!");

            }
            try
            {String url="jdbc:mysql://localhost/joueur";
             String user="root";
             String mp="0000";
                Connection cnx=DriverManager.getConnection(url,user,mp);
                PreparedStatement st=cnx.prepareStatement("delete from info where cin=?");
                st.setString(1,msg);
                st.execute();
                  JOptionPane.showMessageDialog(null,"Opération valider");
                    
            }
            catch(Exception e)
            {
                System.out.println("Erreur Connection");
            }                       

    }//GEN-LAST:event_jButton3ActionPerformed

    private void nomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Formulaire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulaire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulaire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulaire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulaire().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adr;
    private javax.swing.JTextField cin;
    private javax.swing.JTextArea cmt;
    private javax.swing.JTextField date;
    private javax.swing.JTextField hr;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nbj;
    private javax.swing.JTextField nom;
    private javax.swing.JTextField ntel;
    private javax.swing.JTextField prenom;
    // End of variables declaration//GEN-END:variables
}