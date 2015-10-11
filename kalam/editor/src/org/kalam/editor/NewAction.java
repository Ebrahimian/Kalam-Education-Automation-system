/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kalam.editor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.openide.awt.ActionID;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;
import org.openide.windows.WindowManager;

@ActionID(id="org.shop.editor.NewAction", category="File")
@ActionRegistration(displayName="#CTL_NewAction")
@Messages("CTL_NewAction=Refresh")
public final class NewAction implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        editorTopComponent tc = (editorTopComponent) WindowManager.getDefault().findTopComponent("editorTopComponent");
        tc.resetFields();
        tc.open();
        tc.requestActive();
    }

}
