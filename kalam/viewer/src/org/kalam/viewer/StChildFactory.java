/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kalam.viewer;

import demo.Student;
import java.beans.IntrospectionException;
import java.util.List;
import org.openide.nodes.BeanNode;
import org.openide.nodes.ChildFactory;
import org.openide.nodes.Children;
import org.openide.nodes.Node;
import org.openide.util.Exceptions;
import org.openide.util.lookup.Lookups;

public class StChildFactory extends ChildFactory<Student> {

    private List<Student> resultList;

    public StChildFactory(List<Student> resultList) {
        this.resultList = resultList;
    }

    @Override
    protected boolean createKeys(List<Student> list) {
        for (Student student : resultList) {
            list.add(student);
        }
        return true;
    }

    @Override
    protected Node createNodeForKey(Student c) {
        try {
            return new StBeanNode(c);
        } catch (IntrospectionException ex) {
            Exceptions.printStackTrace(ex);
            return null;
        }
    }

    private class StBeanNode extends BeanNode {

        public StBeanNode(Student bean) throws IntrospectionException {
            super(bean, Children.LEAF, Lookups.singleton(bean));
        }
    }
}
