/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kalam.viewer;

import java.util.List;
import javax.swing.Action;
import org.openide.nodes.AbstractNode;
import org.openide.nodes.Children;
import org.openide.util.NbBundle.Messages;
import org.openide.util.Utilities;
import static org.kalam.viewer.Bundle.*;

public class stRootNode extends AbstractNode {

    @Messages("CTRL_RootName=Root")
    public stRootNode(Children kids) {
        super(kids);
        setDisplayName(CTRL_RootName());
    }

    @Override
    public Action[] getActions(boolean context) {
        List actionsForSt = Utilities.actionsForPath("Actions/Cust");
        return (Action[]) actionsForSt.toArray(new Action[actionsForSt.size()]);
    }

}