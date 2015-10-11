/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kalam.viewer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.openide.awt.ActionID;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;

@ActionID(id="org.shop.viewer.CustomerRootRefreshAction", category="Cust")
@ActionRegistration(displayName="#CTL_CustomerRootRefreshAction")
@Messages("CTL_CustomerRootRefreshAction=Refresh")
public class stRootRefreshAction implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        viewerTopComponent.refreshNode();
    }
    
}