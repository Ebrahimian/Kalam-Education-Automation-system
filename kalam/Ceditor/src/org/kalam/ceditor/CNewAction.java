/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kalam.ceditor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.openide.awt.ActionID;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;
import org.openide.windows.WindowManager;

@ActionID(id="org.shop.editor.CustomerNewAction", category="File")
@ActionRegistration(displayName="#CTL_CustomerNewAction")
@Messages("CTL_CustomerNewAction=Refresh")
public final class CNewAction implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        CeditorTopComponent tc = (CeditorTopComponent) WindowManager.getDefault().findTopComponent("CeditorTopComponent");
        tc.resetFields();
        tc.open();
        tc.requestActive();
    }

}