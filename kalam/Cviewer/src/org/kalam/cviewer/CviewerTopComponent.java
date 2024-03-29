/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kalam.cviewer;

import demo.Course;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import org.netbeans.api.settings.ConvertAsProperties;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.explorer.ExplorerManager;
import org.openide.explorer.ExplorerUtils;
import org.openide.nodes.Children;
import org.openide.util.NbBundle.Messages;
import org.openide.windows.TopComponent;
import secsys.Secsys;

/**
 * Top component which displays something.
 */
@ConvertAsProperties(dtd = "-//org.kalam.cviewer//Cviewer//EN",
autostore = false)
@TopComponent.Description(preferredID = "CviewerTopComponent",
//iconBase="SET/PATH/TO/ICON/HERE", 
persistenceType = TopComponent.PERSISTENCE_ALWAYS)
@TopComponent.Registration(mode = "properties", openAtStartup = true)
@ActionID(category = "Window", id = "org.kalam.cviewer.CviewerTopComponent")
@ActionReference(path = "Menu/Window" /*
 * , position = 333
 */)
@TopComponent.OpenActionRegistration(displayName = "#CTL_CviewerAction",
preferredID = "CviewerTopComponent")
@Messages({
    "CTL_CviewerAction=Cviewer",
    "CTL_CviewerTopComponent=Cviewer Window",
    "HINT_CviewerTopComponent=This is a Cviewer window"
})
public final class CviewerTopComponent extends TopComponent implements ExplorerManager.Provider {

    static String socialnum;
    static String profname;
    String nb = new Secsys().Secsys();
    private static ExplorerManager em = new ExplorerManager();

    public CviewerTopComponent() {
       
       // if("G2STNP1".equals(nb)){
            initComponents();
            setName(Bundle.CTL_CviewerTopComponent());
            setToolTipText(Bundle.HINT_CviewerTopComponent());

            EntityManager entityManager = Persistence.createEntityManagerFactory("stLibraryPU").createEntityManager();
            javax.persistence.Query query = entityManager.createQuery("SELECT c FROM Course c");
            List<Course> resultList = query.getResultList();

            em.setRootContext(new CRootNode(Children.create(new CChildFactory(resultList), true)));
            associateLookup(ExplorerUtils.createLookup(em, getActionMap()));

      //   }   

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        beanTreeView1 = new org.openide.explorer.view.BeanTreeView();
        jLabel1 = new javax.swing.JLabel();
        stNumField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        profField = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDisplayName(org.openide.util.NbBundle.getMessage(CviewerTopComponent.class, "CviewerTopComponent.displayName")); // NOI18N
        setPreferredSize(new java.awt.Dimension(255, 230));

        beanTreeView1.setBorder(javax.swing.BorderFactory.createTitledBorder(org.openide.util.NbBundle.getMessage(CviewerTopComponent.class, "CviewerTopComponent.beanTreeView1.border.title"))); // NOI18N
        beanTreeView1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(CviewerTopComponent.class, "CviewerTopComponent.jLabel1.text")); // NOI18N

        stNumField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        stNumField.setText(org.openide.util.NbBundle.getMessage(CviewerTopComponent.class, "CviewerTopComponent.stNumField.text")); // NOI18N
        stNumField.setNextFocusableComponent(jButton1);
        stNumField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stNumFieldActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jButton1, org.openide.util.NbBundle.getMessage(CviewerTopComponent.class, "CviewerTopComponent.jButton1.text")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jLabel2, org.openide.util.NbBundle.getMessage(CviewerTopComponent.class, "CviewerTopComponent.jLabel2.text")); // NOI18N

        profField.setText(org.openide.util.NbBundle.getMessage(CviewerTopComponent.class, "CviewerTopComponent.profField.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jButton2, org.openide.util.NbBundle.getMessage(CviewerTopComponent.class, "CviewerTopComponent.jButton2.text")); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(beanTreeView1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(profField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stNumField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(14, 14, 14))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(stNumField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(profField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(beanTreeView1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        socialnum = stNumField.getText();

        CviewerTopComponent.refreshNode(socialnum);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void stNumFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stNumFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stNumFieldActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
              profname = profField.getText();

        CviewerTopComponent.refreshNodeProf(profname);
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.openide.explorer.view.BeanTreeView beanTreeView1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField profField;
    private javax.swing.JTextField stNumField;
    // End of variables declaration//GEN-END:variables

    @Override
    public void componentOpened() {
        // TODO add custom code on component opening
    }

    @Override
    public void componentClosed() {
        // TODO add custom code on component closing
    }

    @Override
    public ExplorerManager getExplorerManager() {
        return em;
    }

    void writeProperties(java.util.Properties p) {
        // better to version settings since initial version as advocated at
        // http://wiki.apidesign.org/wiki/PropertyFiles
        p.setProperty("version", "1.0");
        // TODO store your settings
    }

    void readProperties(java.util.Properties p) {
        String version = p.getProperty("version");
        // TODO read your settings according to their version
    }

    public static void refreshNode() {
        EntityManager entityManager = Persistence.createEntityManagerFactory("stLibraryPU").createEntityManager();
        javax.persistence.Query query = entityManager.createQuery("SELECT c FROM Course c");
        List<Course> resultList = query.getResultList();
        em.setRootContext(new CRootNode(Children.create(new CChildFactory(resultList), true)));
    }

    public static void refreshNode(String Num) {
        socialnum = Num;
        EntityManager entityManager = Persistence.createEntityManagerFactory("stLibraryPU").createEntityManager();
        javax.persistence.Query query = entityManager.createQuery("SELECT c FROM Course c WHERE c.socialnum = :socialnum");
        Query setParameter = query.setParameter("socialnum", socialnum);
        List<Course> resultList = query.getResultList();
        em.setRootContext(new CRootNode(Children.create(new CChildFactory(resultList), true)));

    }
        public static void refreshNodeProf(String ProfN) {
        profname = ProfN;
        EntityManager entityManager = Persistence.createEntityManagerFactory("stLibraryPU").createEntityManager();
        javax.persistence.Query query = entityManager.createQuery("SELECT c FROM Course c WHERE c.professor = :professor");
        Query setParameter = query.setParameter("professor", profname);
        List<Course> resultList = query.getResultList();
        em.setRootContext(new CRootNode(Children.create(new CChildFactory(resultList), true)));

    }
        
}
