/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pawandubey.texus.actions;

import com.pawandubey.texus.Texus;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

/**
 *
 * @author Pawan Dubey <pawandubey@outlook.com>
 */
public class NewAction extends AbstractAction{
    private static final long serialVersionUID = 4L;

    @Override
    public void actionPerformed(ActionEvent e) {
        Texus texus = new Texus();
        texus.setVisible(true);
    }
    
    
}
