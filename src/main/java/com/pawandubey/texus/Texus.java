/*
 * Copyright 2014 Pawan Dubey (pawandubey@outlook.com)
 * 
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.pawandubey.texus;

import com.pawandubey.texus.actions.NewAction;
import com.pawandubey.texus.actions.OpenAction;
import com.pawandubey.texus.actions.SaveAction;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JTextPane;

/**
 *
 * @author Pawan Dubey <pawandubey@outlook.com>
 */
public class Texus extends javax.swing.JFrame {
    private static final long serialVersionUID = 1L;

    /**
     * Creates new form Texus
     */
    public Texus() {
        initComponents();
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content
     * of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        editor = new javax.swing.JTextPane();
        jToolBar1 = new javax.swing.JToolBar();
        newtool = new javax.swing.JButton();
        opentool = new javax.swing.JButton();
        savetool = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        newfile = new javax.swing.JMenuItem();
        open = new javax.swing.JMenuItem();
        save = new javax.swing.JMenuItem();
        saveas = new javax.swing.JMenuItem();
        exit = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        about = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Texus");
        setName("window"); // NOI18N
        setPreferredSize(new java.awt.Dimension(960, 540));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        editor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                editorKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(editor);

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        newtool.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cc/black/png/doc_empty_icon&24.png"))); // NOI18N
        newtool.setFocusable(false);
        newtool.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        newtool.setOpaque(false);
        newtool.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(newtool);

        opentool.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cc/black/png/folder_open_icon&24.png"))); // NOI18N
        opentool.setFocusable(false);
        opentool.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        opentool.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(opentool);

        savetool.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cc/black/png/save_icon&24.png"))); // NOI18N
        savetool.setEnabled(false);
        savetool.setFocusable(false);
        savetool.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        savetool.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(savetool);

        jMenu4.setText("File");

        newfile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        newfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cc/black/png/doc_empty_icon&16.png"))); // NOI18N
        newfile.setText("New");
        jMenu4.add(newfile);

        open.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        open.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cc/black/png/folder_open_icon&16.png"))); // NOI18N
        open.setText("Open");
        jMenu4.add(open);

        save.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cc/black/png/save_icon&16.png"))); // NOI18N
        save.setText("Save");
        save.setEnabled(false);
        jMenu4.add(save);

        saveas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        saveas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cc/black/png/save_icon&16.png"))); // NOI18N
        saveas.setText("Save As");
        saveas.setEnabled(false);
        jMenu4.add(saveas);

        exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cc/black/png/app_window_cross_icon&16.png"))); // NOI18N
        exit.setText("Exit");
        jMenu4.add(exit);

        jMenuBar2.add(jMenu4);

        jMenu5.setText("Help");

        about.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        about.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cc/black/png/info_icon&16.png"))); // NOI18N
        about.setText("About");
        jMenu5.add(about);

        jMenuBar2.add(jMenu5);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 816, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_editorKeyTyped
        save.setEnabled(true);
        savetool.setEnabled(true);
        saveas.setEnabled(true);
    }//GEN-LAST:event_editorKeyTyped

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        saveaction.setTexus(this);
        openaction.setTexus(this);
        
        save.addActionListener(saveaction);
        savetool.addActionListener(saveaction);
        open.addActionListener(openaction);
        opentool.addActionListener(openaction);
        newfile.addActionListener(newaction);
        newtool.addActionListener(newaction);
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(Texus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Texus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Texus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Texus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Texus().setVisible(true);
                
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem about;
    private javax.swing.JTextPane editor;
    private javax.swing.JMenuItem exit;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuItem newfile;
    private javax.swing.JButton newtool;
    private javax.swing.JMenuItem open;
    private javax.swing.JButton opentool;
    private javax.swing.JMenuItem save;
    private javax.swing.JMenuItem saveas;
    private javax.swing.JButton savetool;
    // End of variables declaration//GEN-END:variables
    private KeyListener keyListener;
    private final SaveAction saveaction = new SaveAction();
    private final OpenAction openaction = new OpenAction();
    private final NewAction newaction = new NewAction();
    
    
    public JTextPane getEditor(){
        return this.editor;
    }
    
    
}
