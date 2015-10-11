/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kalam.cviewer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.openide.awt.ActionID;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;

@ActionID(id="org.shop.viewer.CustomerRootRefreshAction", category="Customer")
@ActionRegistration(displayName="#CTL_CRootRefreshAction")
@Messages("CTL_CRootRefreshAction=Refresh")
public class CRootRefreshAction implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        CviewerTopComponent.refreshNode();
    }
    
}