

import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import javax.swing.ListModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fen
 */
public class NewTable extends javax.swing.JFrame {

    /**
     * Creates new form addTable
     */
    
    public static DefaultListModel model = new DefaultListModel();
    
    public static Vector<String> createdColumnNames = new Vector<String>();
    public static Vector<String> primaryKeys = new Vector<String>();
    
    public static Vector<String> foreignKeys = new Vector<>();
    public static Vector<String> foreignKeysRFTable = new Vector<>();
    public static Vector<String> foreignKeysRFcolumn = new Vector<>();
    
    public NewTable() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTableName = new javax.swing.JLabel();
        txfTableName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        listColums = new javax.swing.JList();
        btnAddColumn = new javax.swing.JButton();
        btnCommit = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txfPrimaryKey = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txfForeignKey = new javax.swing.JTextArea();
        btnDelCol = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        lbTableName.setText("Table Name");

        jScrollPane1.setViewportView(listColums);

        btnAddColumn.setText("Add Column");
        btnAddColumn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddColumnActionPerformed(evt);
            }
        });

        btnCommit.setText("Commit");
        btnCommit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCommitActionPerformed(evt);
            }
        });

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txfPrimaryKey.setEditable(false);
        txfPrimaryKey.setBorder(javax.swing.BorderFactory.createTitledBorder("Primary Key:"));

        txfForeignKey.setEditable(false);
        txfForeignKey.setColumns(20);
        txfForeignKey.setRows(5);
        txfForeignKey.setBorder(javax.swing.BorderFactory.createTitledBorder("Foreign Key:"));
        jScrollPane2.setViewportView(txfForeignKey);

        btnDelCol.setText("Delete Column");
        btnDelCol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelColActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txfPrimaryKey, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnCommit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAddColumn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDelCol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbTableName, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(txfTableName, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTableName, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfTableName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAddColumn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btnDelCol, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCommit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(txfPrimaryKey, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(27, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddColumnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddColumnActionPerformed
        // TODO add your handling code here:
        AddColumn addColumn;
        try {
            addColumn = new AddColumn();
            addColumn.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(NewTable.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnAddColumnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        primaryKeys.removeAllElements();
                foreignKeys.removeAllElements();
                foreignKeysRFTable.removeAllElements();
                foreignKeysRFcolumn.removeAllElements();
                createdColumnNames.removeAllElements();
                listColums.removeAll();
                model.clear();
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnDelColActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelColActionPerformed
      
        int index=listColums.getSelectedIndex();
        String cn=createdColumnNames.get(index);
       
        for(int j=0;j<primaryKeys.size();j++)
        {
            String a=primaryKeys.get(j);
           if(cn.equalsIgnoreCase(a))
           {
               primaryKeys.removeElementAt(j);
             
               txfPrimaryKey.setText("");
               String txtPr="";
               for(int i=0;i<NewTable.primaryKeys.size();i++)
               {
                   if(i!=0)
                      txtPr+=",";
                   txtPr+=NewTable.primaryKeys.get(i);   
               }
               txfPrimaryKey.setText(txtPr);
              
               break;
           }
       
        }
        
        for(int k=0;k<foreignKeys.size();k++)
        {
            String b=foreignKeys.get(k);
           if(cn.equalsIgnoreCase(b))
           {
               foreignKeys.removeElementAt(k);
               foreignKeysRFTable.removeElementAt(k);
               foreignKeysRFcolumn.removeElementAt(k);
                 
               txfForeignKey.setText("");
               String txtFr="";
               for(int t=0;t<foreignKeys.size();t++)
                    { 
                        txtFr+="\n"+NewTable.foreignKeys.get(t)+" REFERENCES "+NewTable.foreignKeysRFTable.get(t)+" ("+ NewTable.foreignKeysRFcolumn.get(t) +")";
                    }
               txfForeignKey.setText(txtFr);
               break;
           }
       
        }
        createdColumnNames.removeElementAt(index);
        model.removeElementAt(index);
        listColums.setModel(model);
        
    }//GEN-LAST:event_btnDelColActionPerformed

    private void btnCommitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCommitActionPerformed
        if(txfTableName.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Column Name Field can not be empty. ", "Invalid Input.", JOptionPane.ERROR_MESSAGE);
            txfTableName.requestFocusInWindow();
           
        }
        else
        {
            String query="CREATE TABLE "+txfTableName.getText()+" \n(";
            
            ListModel md = listColums.getModel();

            for(int i=0; i < md.getSize(); i++)
            {
                 query+=  md.getElementAt(i)+",\n";  
            }
            query+="PRIMARY KEY (";
            for(int i=0;i<NewTable.primaryKeys.size();i++)
            {
                if(i!=0)
                    query+=",";
                query+=primaryKeys.get(i);
            }
            query+=")";
            if(foreignKeys.size()==0)
                 query+=");";
            else
            {
                query+=",\n";
                for(int k=0;k<NewTable.foreignKeys.size();k++)
                {
                    if(k!=0)
                        query+=",\n";
                    query+="FOREIGN KEY ("+foreignKeys.get(k)+") REFERENCES "+NewTable.foreignKeysRFTable.get(k)+" ("+ NewTable.foreignKeysRFcolumn.get(k) +")";
                }
                query+= ");" ;
                
            }
            try 
            {
                Statement st =Database.connection.createStatement();
                st.executeUpdate(query);
                Database.fillTables();
                primaryKeys.removeAllElements();
                foreignKeys.removeAllElements();
                foreignKeysRFTable.removeAllElements();
                foreignKeysRFcolumn.removeAllElements();
                createdColumnNames.removeAllElements();
                this.dispose();
                
            } 
            catch (SQLException ex)
            {
                JOptionPane.showMessageDialog(this, ex+" \nOperation Failed. ", "Error Message", ERROR_MESSAGE);
            }    
        }
            
    }//GEN-LAST:event_btnCommitActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
      primaryKeys.removeAllElements();
                foreignKeys.removeAllElements();
                foreignKeysRFTable.removeAllElements();
                foreignKeysRFcolumn.removeAllElements();
                createdColumnNames.removeAllElements();
                listColums.removeAll();
               
                model.clear();
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddColumn;
    private javax.swing.JButton btnCommit;
    private javax.swing.JButton btnDelCol;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbTableName;
    public static javax.swing.JList listColums;
    public static javax.swing.JTextArea txfForeignKey;
    public static javax.swing.JTextField txfPrimaryKey;
    private javax.swing.JTextField txfTableName;
    // End of variables declaration//GEN-END:variables
}