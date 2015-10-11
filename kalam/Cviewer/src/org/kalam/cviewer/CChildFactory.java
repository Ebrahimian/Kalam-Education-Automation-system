/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kalam.cviewer;
import demo.Course;
import java.beans.IntrospectionException;
import java.util.List;
import org.openide.nodes.BeanNode;
import org.openide.nodes.ChildFactory;
import org.openide.nodes.Children;
import org.openide.nodes.Node;
import org.openide.util.Exceptions;
import org.openide.util.lookup.Lookups;

public class CChildFactory extends ChildFactory<Course> {

    private List<Course> resultList;

    public CChildFactory(List<Course> resultList) {
        this.resultList = resultList;
    }

    @Override
    protected boolean createKeys(List<Course> list) {
        for (Course Customer : resultList) {
            list.add(Customer);
        }
        return true;
    }

    @Override
    protected Node createNodeForKey(Course c) {
        try {
            return new CBeanNode(c);
        } catch (IntrospectionException ex) {
            Exceptions.printStackTrace(ex);
            return null;
        }
    }
    private class CBeanNode extends BeanNode {
    public CBeanNode(Course bean) throws IntrospectionException {
        super(bean, Children.LEAF, Lookups.singleton(bean));
    }
    }

}
