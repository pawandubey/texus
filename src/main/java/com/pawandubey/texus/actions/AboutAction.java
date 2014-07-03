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

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JOptionPane;

/**
 *
 * @author Pawan Dubey <pawandubey@outlook.com>
 */
public class AboutAction extends AbstractAction{
    private static final long serialVersionUID = 5L;
    private final String aboutMessage = "<html><center><h2>Texus Editor</h2><br><br><h4>A Simple Java Text Editor. Made with NetBeans and Maven.</h4><br><br>"
            + "Copy Right 2014 Pawan Dubey (pawandubey@outlook.com)<br>Licensed Under Apache License V2</center>";
    
    @Override
    public void actionPerformed(ActionEvent e) {
        showAbout();
    }

    private void showAbout() {
        JOptionPane.showMessageDialog(null, aboutMessage, "About Texus", JOptionPane.INFORMATION_MESSAGE);
        
    }
    
}
