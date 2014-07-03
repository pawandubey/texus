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
