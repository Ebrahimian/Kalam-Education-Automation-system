/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kalam.cviewer;
import java.util.List;
import javax.swing.Action;
import org.openide.nodes.AbstractNode;
import org.openide.nodes.Children;
import org.openide.util.NbBundle.Messages;
import org.openide.util.Utilities;
import static org.kalam.cviewer.Bundle.*;

public class CRootNode extends AbstractNode {

    @Messages("CTRL_RootName=Root")
    public CRootNode(Children kids) {
        super(kids);
        setDisplayName(CTRL_RootName());
    }

    @Override
    public Action[] getActions(boolean context) {
        List actionsForCustomer = Utilities.actionsForPath("Actions/Customer");
        return (Action[]) actionsForCustomer.toArray(new Action[actionsForCustomer.size()]);
    }

}