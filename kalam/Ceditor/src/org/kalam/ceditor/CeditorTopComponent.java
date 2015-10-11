/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kalam.ceditor;

import demo.Course;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import org.netbeans.api.settings.ConvertAsProperties;
import org.openide.DialogDisplayer;
import org.openide.NotifyDescriptor;
import org.openide.NotifyDescriptor.Confirmation;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.UndoRedo;
import org.openide.cookies.SaveCookie;
import org.openide.util.Exceptions;
import org.openide.util.Lookup;
import org.openide.util.LookupEvent;
import org.openide.util.LookupListener;
import org.openide.windows.TopComponent;
import org.openide.util.NbBundle.Messages;
import org.openide.util.lookup.AbstractLookup;
import org.openide.util.lookup.InstanceContent;
import org.openide.windows.WindowManager;

/**
 * Top component which displays something.
 */
@ConvertAsProperties(dtd = "-//org.kalam.ceditor//Ceditor//EN",
autostore = false)
@TopComponent.Description(preferredID = "CeditorTopComponent",
//iconBase="SET/PATH/TO/ICON/HERE", 
persistenceType = TopComponent.PERSISTENCE_ALWAYS)
@TopComponent.Registration(mode = "output", openAtStartup = true)
@ActionID(category = "Window", id = "org.kalam.ceditor.CeditorTopComponent")
@ActionReference(path = "Menu/Window" /*
 * , position = 333
 */)
@TopComponent.OpenActionRegistration(displayName = "#CTL_CeditorAction",
preferredID = "CeditorTopComponent")
@Messages({
    "CTL_CeditorAction=Ceditor",
    "CTL_CeditorTopComponent=Ceditor Window",
    "HINT_CeditorTopComponent=This is a Ceditor window"
})
public final class CeditorTopComponent extends TopComponent implements LookupListener {

    private final InstanceContent content;
    private final CSaveCapability impl;
    Course course;
    private UndoRedo.Manager manager = new UndoRedo.Manager();
    private Lookup.Result result = null;

    public CeditorTopComponent() {
        initComponents();
        setName(Bundle.CTL_CeditorTopComponent());
        setToolTipText(Bundle.HINT_CeditorTopComponent());


        CStNumField.getDocument().addUndoableEditListener(manager);
        CcashField.getDocument().addUndoableEditListener(manager);
        CcheckField.getDocument().addUndoableEditListener(manager);
        ChourField.getDocument().addUndoableEditListener(manager);
        CtuiField.getDocument().addUndoableEditListener(manager);
        cdayField.getDocument().addUndoableEditListener(manager);
        CprofField.getDocument().addUndoableEditListener(manager);



        CStNumField.getDocument().addDocumentListener(new DocumentListener() {

            public void insertUpdate(DocumentEvent arg0) {
                fire(true);
            }

            public void removeUpdate(DocumentEvent arg0) {
                fire(true);
            }

            public void changedUpdate(DocumentEvent arg0) {
                fire(true);
            }
        });
        CcashField.getDocument().addDocumentListener(new DocumentListener() {

            public void insertUpdate(DocumentEvent arg0) {
                fire(true);
            }

            public void removeUpdate(DocumentEvent arg0) {
                fire(true);
            }

            public void changedUpdate(DocumentEvent arg0) {
                fire(true);
            }
        });
        CcheckField.getDocument().addDocumentListener(new DocumentListener() {

            public void insertUpdate(DocumentEvent arg0) {
                fire(true);
            }

            public void removeUpdate(DocumentEvent arg0) {
                fire(true);
            }

            public void changedUpdate(DocumentEvent arg0) {
                fire(true);
            }
        });
        ChourField.getDocument().addDocumentListener(new DocumentListener() {

            public void insertUpdate(DocumentEvent arg0) {
                fire(true);
            }

            public void removeUpdate(DocumentEvent arg0) {
                fire(true);
            }

            public void changedUpdate(DocumentEvent arg0) {
                fire(true);
            }
        });
        CtuiField.getDocument().addDocumentListener(new DocumentListener() {

            public void insertUpdate(DocumentEvent arg0) {
                fire(true);
            }

            public void removeUpdate(DocumentEvent arg0) {
                fire(true);
            }

            public void changedUpdate(DocumentEvent arg0) {
                fire(true);
            }
        });
        cdayField.getDocument().addDocumentListener(new DocumentListener() {

            public void insertUpdate(DocumentEvent arg0) {
                fire(true);
            }

            public void removeUpdate(DocumentEvent arg0) {
                fire(true);
            }

            public void changedUpdate(DocumentEvent arg0) {
                fire(true);
            }
        });
        CprofField.getDocument().addDocumentListener(new DocumentListener() {

            public void insertUpdate(DocumentEvent arg0) {
                fire(true);
            }

            public void removeUpdate(DocumentEvent arg0) {
                fire(true);
            }

            public void changedUpdate(DocumentEvent arg0) {
                fire(true);
            }
        });


        //Create a new instance of our SaveCookie implementation:
        impl = new CSaveCapability();

        //Create a new instance of our dynamic object:
        content = new InstanceContent();

        //Add the dynamic object to the TopComponent Lookup:
        associateLookup(new AbstractLookup(content));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        CStNumField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ChourField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cdayField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        CtuiField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        CcashField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        CcheckField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        CprofField = new javax.swing.JTextField();
        CResetButton1 = new javax.swing.JButton();
        CSaveButton2 = new javax.swing.JButton();
        courseSpinner = new javax.swing.JSpinner();
        termSpinner1 = new javax.swing.JSpinner();

        org.openide.awt.Mnemonics.setLocalizedText(jLabel9, org.openide.util.NbBundle.getMessage(CeditorTopComponent.class, "CeditorTopComponent.jLabel9.text")); // NOI18N

        setDisplayName(org.openide.util.NbBundle.getMessage(CeditorTopComponent.class, "CeditorTopComponent.displayName")); // NOI18N
        setPreferredSize(new java.awt.Dimension(632, 230));

        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(CeditorTopComponent.class, "CeditorTopComponent.jLabel1.text")); // NOI18N

        CStNumField.setText(org.openide.util.NbBundle.getMessage(CeditorTopComponent.class, "CeditorTopComponent.CStNumField.text")); // NOI18N
        CStNumField.setNextFocusableComponent(termSpinner1);

        org.openide.awt.Mnemonics.setLocalizedText(jLabel2, org.openide.util.NbBundle.getMessage(CeditorTopComponent.class, "CeditorTopComponent.jLabel2.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel3, org.openide.util.NbBundle.getMessage(CeditorTopComponent.class, "CeditorTopComponent.jLabel3.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel4, org.openide.util.NbBundle.getMessage(CeditorTopComponent.class, "CeditorTopComponent.jLabel4.text")); // NOI18N

        ChourField.setText(org.openide.util.NbBundle.getMessage(CeditorTopComponent.class, "CeditorTopComponent.ChourField.text")); // NOI18N
        ChourField.setNextFocusableComponent(cdayField);

        org.openide.awt.Mnemonics.setLocalizedText(jLabel5, org.openide.util.NbBundle.getMessage(CeditorTopComponent.class, "CeditorTopComponent.jLabel5.text")); // NOI18N

        cdayField.setText(org.openide.util.NbBundle.getMessage(CeditorTopComponent.class, "CeditorTopComponent.cdayField.text")); // NOI18N
        cdayField.setNextFocusableComponent(CprofField);

        org.openide.awt.Mnemonics.setLocalizedText(jLabel6, org.openide.util.NbBundle.getMessage(CeditorTopComponent.class, "CeditorTopComponent.jLabel6.text")); // NOI18N

        CtuiField.setText(org.openide.util.NbBundle.getMessage(CeditorTopComponent.class, "CeditorTopComponent.CtuiField.text")); // NOI18N
        CtuiField.setNextFocusableComponent(CcashField);

        org.openide.awt.Mnemonics.setLocalizedText(jLabel7, org.openide.util.NbBundle.getMessage(CeditorTopComponent.class, "CeditorTopComponent.jLabel7.text")); // NOI18N

        CcashField.setText(org.openide.util.NbBundle.getMessage(CeditorTopComponent.class, "CeditorTopComponent.CcashField.text")); // NOI18N
        CcashField.setNextFocusableComponent(CcheckField);

        org.openide.awt.Mnemonics.setLocalizedText(jLabel8, org.openide.util.NbBundle.getMessage(CeditorTopComponent.class, "CeditorTopComponent.jLabel8.text")); // NOI18N

        CcheckField.setText(org.openide.util.NbBundle.getMessage(CeditorTopComponent.class, "CeditorTopComponent.CcheckField.text")); // NOI18N
        CcheckField.setNextFocusableComponent(CSaveButton2);

        org.openide.awt.Mnemonics.setLocalizedText(jLabel10, org.openide.util.NbBundle.getMessage(CeditorTopComponent.class, "CeditorTopComponent.jLabel10.text")); // NOI18N

        CprofField.setText(org.openide.util.NbBundle.getMessage(CeditorTopComponent.class, "CeditorTopComponent.CprofField.text")); // NOI18N
        CprofField.setNextFocusableComponent(CtuiField);

        org.openide.awt.Mnemonics.setLocalizedText(CResetButton1, org.openide.util.NbBundle.getMessage(CeditorTopComponent.class, "CeditorTopComponent.CResetButton1.text")); // NOI18N
        CResetButton1.setNextFocusableComponent(CStNumField);
        CResetButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CResetButton1ActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(CSaveButton2, org.openide.util.NbBundle.getMessage(CeditorTopComponent.class, "CeditorTopComponent.CSaveButton2.text")); // NOI18N
        CSaveButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CSaveButton2ActionPerformed(evt);
            }
        });

        courseSpinner.setModel(new javax.swing.SpinnerListModel(new String[] {"Children 1", "Children 2", "Children 3", "Children 4", "Children 5", "Children 6", "Children 7", "Children 8", "Children 9", "Children 10", "Children 11", "Children 12", "Children 13", "Children 14", "Basic A", "Basic B", "Starter 1", "Starter 2", "JL 1", "JL 2", "JL 3", "JL 4", "JL 5", "JL 6", "JL 7", "JL 8", "JL 9", "JL 10", "JL 11", "JL 12", "Pre-Bridge 1", "Pre-Bridge 2", "Pre-Bridge 3", "Pre-Bridge 4", "Bridge 1", "Bridge 2", "Bridge 3", "Level 1", "Level 2", "Level 3", "Level 4", "Level 5", "Level 6", "Level 7", "Level 8", "Level 9", "Level 10", "Level 11", "Level 12", "UPI 1", "UPI 2", "UPI 3", "UPI 4", "Pre-Advanced A", "Pre-Advanced B", "Pre-Advanced C", "Advanced A", "Advanced B", "Advanced C", "FCE 1", "FCE 2", "FCE 3", "FCE 4", " "}));
        courseSpinner.setNextFocusableComponent(ChourField);

        termSpinner1.setModel(new javax.swing.SpinnerListModel(new String[] {"966", "965", "964", "963", "962", "961", "956", "955", "954", "953", "952", "951", "946", "945", "944", "943", "942", "941", "936", "935", "934", "933", "932", "931", "926", "925", "924", "923", "922", "921", "916", "915", "914", "913", "912", "911"}));
        termSpinner1.setNextFocusableComponent(courseSpinner);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CcheckField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cdayField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CcashField, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ChourField, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(CtuiField, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                                    .addComponent(courseSpinner))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CSaveButton2)
                        .addGap(18, 18, 18)
                        .addComponent(CResetButton1)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CStNumField, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(termSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CprofField, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(CStNumField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CResetButton1)
                            .addComponent(CSaveButton2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ChourField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cdayField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5))
                            .addComponent(termSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(courseSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel10)
                    .addComponent(CprofField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CtuiField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(CcashField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(CcheckField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(120, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CResetButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CResetButton1ActionPerformed
     resetFields();
    }//GEN-LAST:event_CResetButton1ActionPerformed

    private void CSaveButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CSaveButton2ActionPerformed
  CSaveCapability cs= new CSaveCapability();
        try {
            cs.save();
        } catch (IOException ex) {
            Exceptions.printStackTrace(ex);
        }
    }//GEN-LAST:event_CSaveButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CResetButton1;
    private javax.swing.JButton CSaveButton2;
    private javax.swing.JTextField CStNumField;
    private javax.swing.JTextField CcashField;
    private javax.swing.JTextField CcheckField;
    private javax.swing.JTextField ChourField;
    private javax.swing.JTextField CprofField;
    private javax.swing.JTextField CtuiField;
    private javax.swing.JTextField cdayField;
    private javax.swing.JSpinner courseSpinner;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSpinner termSpinner1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void componentOpened() {
        result = WindowManager.getDefault().findTopComponent("CviewerTopComponent").getLookup().lookupResult(Course.class);
        result.addLookupListener(this);
        resultChanged(new LookupEvent(result));
        resetFields();
    }

    @Override
    public void componentClosed() {
        result.removeLookupListener(this);
        result = null;
    }

    @Override
    public UndoRedo getUndoRedo() {
        return manager;
    }

    @Override
    public void resultChanged(LookupEvent lookupEvent) {
        Lookup.Result r = (Lookup.Result) lookupEvent.getSource();
        Collection<Course> coll = r.allInstances();
        if (!coll.isEmpty()) {
            for (Course cust : coll) {
                course = cust;
                termSpinner1.setValue(cust.getName());
                courseSpinner.setValue(cust.getSemester());
                CStNumField.setText(cust.getSocialnum());
                CcashField.setText(cust.getCash());
                CcheckField.setText(cust.getOncheck());
                ChourField.setText(cust.getHours());
                CtuiField.setText(cust.getTuition());
                cdayField.setText(cust.getDays());
                CprofField.setText(cust.getProfessor());
            }
        } else {
            termSpinner1.setValue(" ");
            courseSpinner.setValue(" ");
            CStNumField.setText("");
            CcashField.setText("");
            CcheckField.setText("");
            ChourField.setText("");
            CtuiField.setText("");
            cdayField.setText("");
            CprofField.setText("");
        }
    }

    void writeProperties(java.util.Properties p) {
        // better to version settings since initial version as advocated at
        // http://wiki.apidesign.org/wiki/PropertyFiles
        p.setProperty("version", "1.0");
        // TODO store your settings
    }

    public void resetFields() {
        course = new Course();
        termSpinner1.setValue(" ");
        courseSpinner.setValue(" ");
        CStNumField.setText("");
        CcashField.setText("");
        CcheckField.setText("");
        ChourField.setText("");
        CtuiField.setText("");
        cdayField.setText("");
        CprofField.setText("");
    }

    void readProperties(java.util.Properties p) {
        String version = p.getProperty("version");
        // TODO read your settings according to their version
    }

    public void fire(boolean modified) {
        if (modified) {
            //If the text is modified,
            //we add SaveCookie impl to Lookup:
            content.add(impl);
        } else {
            //Otherwise, we remove the SaveCookie impl from the lookup:
            content.remove(impl);
        }
    }

    private class CSaveCapability implements SaveCookie {

        @Override
        public void save() throws IOException {

            Confirmation message = new NotifyDescriptor.Confirmation("آیا مایل به ذخیره رکورد فعلی هستید؟",
                    NotifyDescriptor.OK_CANCEL_OPTION,
                    NotifyDescriptor.QUESTION_MESSAGE);

            Object result = DialogDisplayer.getDefault().notify(message);
            //When user clicks "Yes", indicating they really want to save,
            //we need to disable the Save action,
            //so that it will only be usable when the next change is made
            //to the JTextArea:
            if (NotifyDescriptor.YES_OPTION.equals(result)) {
                fire(false);
                EntityManager entityManager = Persistence.createEntityManagerFactory("stLibraryPU").createEntityManager();
                entityManager.getTransaction().begin();
                if (course.getId() != null) {
                    Course c = entityManager.find(Course.class, course.getId());
                    c.setName(termSpinner1.getValue().toString());
                    c.setCash(CcashField.getText());
                    c.setDays(cdayField.getText());
                    c.setHours(ChourField.getText());
                    c.setOncheck(CcheckField.getText());
                    c.setProfessor(CprofField.getText());
                    c.setSemester(courseSpinner.getValue().toString());
                    c.setTuition(CtuiField.getText());
                    c.setSocialnum(CStNumField.getText());

                    entityManager.getTransaction().commit();
                } else {
                    javax.persistence.Query query = entityManager.createQuery("SELECT c FROM Course c");
                    List<Course> resultList = query.getResultList();
                    course.setId(resultList.size() + 1);
                    course.setName(termSpinner1.getValue().toString());
                    course.setCash(CcashField.getText());
                    course.setDays(cdayField.getText());
                    course.setHours(ChourField.getText());
                    course.setOncheck(CcheckField.getText());
                    course.setProfessor(CprofField.getText());
                    course.setSemester(courseSpinner.getValue().toString());
                    course.setTuition(CtuiField.getText());
                    course.setSocialnum(CStNumField.getText());
                    //add more fields that will populate all the other columns in the table!
                    entityManager.persist(course);
                    entityManager.getTransaction().commit();

                }
            }

        }
    }
}
