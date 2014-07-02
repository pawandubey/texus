/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pawandubey.texus.actions;

import com.pawandubey.texus.Texus;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.JFileChooser;

/**
 *
 * @author Pawan Dubey <pawandubey@outlook.com>
 */
public class SaveAction extends AbstractAction{
    private static final long serialVersionUID = 2L;
    private Texus texus;
    public SaveAction(){
        super("Save");
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        JFileChooser fileChooser = new JFileChooser();
        if (fileChooser.showSaveDialog(texus) == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            if(file!=null){
                try {
                    savefile(file);
                } catch (IOException ex) {
                    Logger.getLogger(SaveAction.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
    }
    
    public void setTexus(Texus texus){
        this.texus = texus;
    }
    
    private void savefile(File file) throws IOException{
        FileWriter writer = new FileWriter(file);
        this.texus.getEditor().write(writer);
        writer.close();
    }
    
}
