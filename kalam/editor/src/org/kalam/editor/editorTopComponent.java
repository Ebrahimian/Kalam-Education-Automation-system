/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kalam.editor;

import demo.Student;
import demo.Course;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
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
@ConvertAsProperties(dtd = "-//org.kalam.editor//editor//EN",
        autostore = false)
@TopComponent.Description(preferredID = "editorTopComponent",
        //iconBase="SET/PATH/TO/ICON/HERE", 
        persistenceType = TopComponent.PERSISTENCE_ALWAYS)
@TopComponent.Registration(mode = "editor", openAtStartup = true)
@ActionID(category = "Window", id = "org.kalam.editor.editorTopComponent")
@ActionReference(path = "Menu/Window" /*
         * , position = 333
         */)
@TopComponent.OpenActionRegistration(displayName = "#CTL_editorAction",
        preferredID = "editorTopComponent")
@Messages({
    "CTL_editorAction=editor",
    "CTL_editorTopComponent=editor Window",
    "HINT_editorTopComponent=This is a editor window"
})
public final class editorTopComponent extends TopComponent implements LookupListener {

    Student student;
    Course course;
    static String name;
    private final InstanceContent content;
    private final StSaveCapability impl;
    private UndoRedo.Manager manager = new UndoRedo.Manager();
    private Lookup.Result result = null;

    public editorTopComponent() {
        initComponents();
        setName(Bundle.CTL_editorTopComponent());
        setToolTipText(Bundle.HINT_editorTopComponent());

        nameField.getDocument().addUndoableEditListener(manager);
        finameField.getDocument().addUndoableEditListener(manager);
        fanameField.getDocument().addUndoableEditListener(manager);
        jobField.getDocument().addUndoableEditListener(manager);
        telField.getDocument().addUndoableEditListener(manager);
        cellField.getDocument().addUndoableEditListener(manager);
        cityField.getDocument().addUndoableEditListener(manager);
        addressField.getDocument().addUndoableEditListener(manager);


        regnumField.getDocument().addUndoableEditListener(manager);




        nameField.getDocument().addDocumentListener(new DocumentListener() {
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

        finameField.getDocument().addDocumentListener(new DocumentListener() {
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
        fanameField.getDocument().addDocumentListener(new DocumentListener() {
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
        jobField.getDocument().addDocumentListener(new DocumentListener() {
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
        telField.getDocument().addDocumentListener(new DocumentListener() {
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
        cellField.getDocument().addDocumentListener(new DocumentListener() {
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
        cityField.getDocument().addDocumentListener(new DocumentListener() {
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
        addressField.getDocument().addDocumentListener(new DocumentListener() {
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
        /**
         * birthField.getDocument().addDocumentListener(new DocumentListener() {
         *
         * public void insertUpdate(DocumentEvent arg0) { fire(true); }
         *
         * public void removeUpdate(DocumentEvent arg0) { fire(true); }
         *
         * public void changedUpdate(DocumentEvent arg0) { fire(true); }
        });
         */
        regnumField.getDocument().addDocumentListener(new DocumentListener() {
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
        impl = new StSaveCapability();

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

        nameField = new javax.swing.JTextField();
        finameField = new javax.swing.JTextField();
        fanameField = new javax.swing.JTextField();
        regnumField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cityField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        addressField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jobField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        telField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cellField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        courseField = new javax.swing.JSpinner();
        termSpinner1 = new javax.swing.JSpinner();
        jButton3 = new javax.swing.JButton();

        setDisplayName(org.openide.util.NbBundle.getMessage(editorTopComponent.class, "editorTopComponent.displayName")); // NOI18N
        setPreferredSize(new java.awt.Dimension(572, 197));

        nameField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        nameField.setText(org.openide.util.NbBundle.getMessage(editorTopComponent.class, "editorTopComponent.nameField.text")); // NOI18N
        nameField.setNextFocusableComponent(finameField);
        nameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nameFieldKeyPressed(evt);
            }
        });

        finameField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        finameField.setText(org.openide.util.NbBundle.getMessage(editorTopComponent.class, "editorTopComponent.finameField.text")); // NOI18N
        finameField.setNextFocusableComponent(fanameField);

        fanameField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        fanameField.setText(org.openide.util.NbBundle.getMessage(editorTopComponent.class, "editorTopComponent.fanameField.text")); // NOI18N
        fanameField.setNextFocusableComponent(regnumField);
        fanameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fanameFieldActionPerformed(evt);
            }
        });

        regnumField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        regnumField.setText(org.openide.util.NbBundle.getMessage(editorTopComponent.class, "editorTopComponent.regnumField.text")); // NOI18N
        regnumField.setNextFocusableComponent(termSpinner1);

        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(editorTopComponent.class, "editorTopComponent.jLabel1.text")); // NOI18N

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        org.openide.awt.Mnemonics.setLocalizedText(jLabel2, org.openide.util.NbBundle.getMessage(editorTopComponent.class, "editorTopComponent.jLabel2.text")); // NOI18N

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        org.openide.awt.Mnemonics.setLocalizedText(jLabel4, org.openide.util.NbBundle.getMessage(editorTopComponent.class, "editorTopComponent.jLabel4.text")); // NOI18N

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        org.openide.awt.Mnemonics.setLocalizedText(jLabel5, org.openide.util.NbBundle.getMessage(editorTopComponent.class, "editorTopComponent.jLabel5.text")); // NOI18N

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        org.openide.awt.Mnemonics.setLocalizedText(jLabel6, org.openide.util.NbBundle.getMessage(editorTopComponent.class, "editorTopComponent.jLabel6.text")); // NOI18N

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        org.openide.awt.Mnemonics.setLocalizedText(jLabel7, org.openide.util.NbBundle.getMessage(editorTopComponent.class, "editorTopComponent.jLabel7.text")); // NOI18N

        cityField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        cityField.setText(org.openide.util.NbBundle.getMessage(editorTopComponent.class, "editorTopComponent.cityField.text")); // NOI18N
        cityField.setNextFocusableComponent(addressField);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        org.openide.awt.Mnemonics.setLocalizedText(jLabel8, org.openide.util.NbBundle.getMessage(editorTopComponent.class, "editorTopComponent.jLabel8.text")); // NOI18N

        addressField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        addressField.setText(org.openide.util.NbBundle.getMessage(editorTopComponent.class, "editorTopComponent.addressField.text")); // NOI18N
        addressField.setNextFocusableComponent(jobField);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        org.openide.awt.Mnemonics.setLocalizedText(jLabel9, org.openide.util.NbBundle.getMessage(editorTopComponent.class, "editorTopComponent.jLabel9.text")); // NOI18N

        jobField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jobField.setText(org.openide.util.NbBundle.getMessage(editorTopComponent.class, "editorTopComponent.jobField.text")); // NOI18N
        jobField.setNextFocusableComponent(telField);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        org.openide.awt.Mnemonics.setLocalizedText(jLabel10, org.openide.util.NbBundle.getMessage(editorTopComponent.class, "editorTopComponent.jLabel10.text")); // NOI18N

        telField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        telField.setText(org.openide.util.NbBundle.getMessage(editorTopComponent.class, "editorTopComponent.telField.text")); // NOI18N
        telField.setNextFocusableComponent(cellField);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        org.openide.awt.Mnemonics.setLocalizedText(jLabel11, org.openide.util.NbBundle.getMessage(editorTopComponent.class, "editorTopComponent.jLabel11.text")); // NOI18N

        cellField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        cellField.setText(org.openide.util.NbBundle.getMessage(editorTopComponent.class, "editorTopComponent.cellField.text")); // NOI18N
        cellField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        cellField.setNextFocusableComponent(jButton2);

        org.openide.awt.Mnemonics.setLocalizedText(jButton1, org.openide.util.NbBundle.getMessage(editorTopComponent.class, "editorTopComponent.jButton1.text")); // NOI18N
        jButton1.setActionCommand(org.openide.util.NbBundle.getMessage(editorTopComponent.class, "editorTopComponent.jButton1.actionCommand")); // NOI18N
        jButton1.setNextFocusableComponent(nameField);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jButton2, org.openide.util.NbBundle.getMessage(editorTopComponent.class, "editorTopComponent.jButton2.text")); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jLabel12, org.openide.util.NbBundle.getMessage(editorTopComponent.class, "editorTopComponent.jLabel12.text")); // NOI18N

        courseField.setModel(new javax.swing.SpinnerListModel(new String[] {"Children 1", "Children 2", "Children 3", "Children 4", "Children 5", "Children 6", "Children 7", "Children 8", "Children 9", "Children 10", "Children 11", "Children 12", "Children 13", "Children 14", "Basic A", "Basic B", "Starter 1", "Starter 2", "JL 1", "JL 2", "JL 3", "JL 4", "JL 5", "JL 6", "JL 7", "JL 8", "JL 9", "JL 10", "JL 11", "JL 12", "Pre-Bridge 1", "Pre-Bridge 2", "Pre-Bridge 3", "Pre-Bridge 4", "Bridge 1", "Bridge 2", "Bridge 3", "Level 1", "Level 2", "Level 3", "Level 4", "Level 5", "Level 6", "Level 7", "Level 8", "Level 9", "Level 10", "Level 11", "Level 12", "UPI 1", "UPI 2", "UPI 3", "UPI 4", "Pre-Advanced A", "Pre-Advanced B", "Pre-Advanced C", "Advanced A", "Advanced B", "Advanced C", "FCE 1", "FCE 2", "FCE 3", "FCE 4", " "}));
        courseField.setName(org.openide.util.NbBundle.getMessage(editorTopComponent.class, "editorTopComponent.courseField.name")); // NOI18N
        courseField.setNextFocusableComponent(cityField);

        termSpinner1.setModel(new javax.swing.SpinnerListModel(new String[] {"966", "965", "964", "963", "962", "961", "956", "955", "954", "953", "952", "951", "946", "945", "944", "943", "942", "941", "936", "935", "934", "933", "932", "931", "926", "925", "924", "923", "922", "921", "916", "915", "914", "913", "912", "911"}));
        termSpinner1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        termSpinner1.setNextFocusableComponent(courseField);

        org.openide.awt.Mnemonics.setLocalizedText(jButton3, org.openide.util.NbBundle.getMessage(editorTopComponent.class, "editorTopComponent.jButton3.text")); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(fanameField)
                                        .addComponent(courseField, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE))
                                    .addComponent(cellField, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(finameField, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(telField, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(termSpinner1, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)))
                            .addComponent(addressField))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(regnumField, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(nameField, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                                .addComponent(cityField)
                                .addComponent(jobField)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(jLabel4))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(finameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addComponent(fanameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regnumField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4)
                    .addComponent(jLabel12)
                    .addComponent(courseField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(termSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jobField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(telField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(cellField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void fanameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fanameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fanameFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        resetFields();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        StSaveCapability sts = new StSaveCapability();
        try {
            sts.save();
        } catch (IOException ex) {
            Exceptions.printStackTrace(ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void nameFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameFieldKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldKeyPressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
                StSaveCapability std = new StSaveCapability();
        try {
            System.out.println(this.nameField.getText());
            std.delete(this.nameField.getText());
        } catch (IOException ex) {
            Exceptions.printStackTrace(ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressField;
    private javax.swing.JTextField cellField;
    private javax.swing.JTextField cityField;
    private javax.swing.JSpinner courseField;
    private javax.swing.JTextField fanameField;
    private javax.swing.JTextField finameField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jobField;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField regnumField;
    private javax.swing.JTextField telField;
    private javax.swing.JSpinner termSpinner1;
    // End of variables declaration//GEN-END:variables

    @Override
    public UndoRedo getUndoRedo() {
        return manager;
    }

    @Override
    public void resultChanged(LookupEvent lookupEvent) {
        Lookup.Result r = (Lookup.Result) lookupEvent.getSource();
        Collection<Student> coll = r.allInstances();
        if (!coll.isEmpty()) {
            for (Student stud : coll) {
                student = stud;
                nameField.setText(stud.getName());
                finameField.setText(stud.getFirstName());
                fanameField.setText(stud.getFatherName());
                jobField.setText(stud.getJob());
                telField.setText(stud.getTel());
                cellField.setText(stud.getCell());
                cityField.setText(stud.getAddress1());
                addressField.setText(stud.getAddress2());
                courseField.setValue(stud.getCourse());
                termSpinner1.setValue(stud.getTerm());

                regnumField.setText(stud.getSocialNumber());



            }
        } else {
            nameField.setText("");
            finameField.setText("");
            fanameField.setText("");
            jobField.setText("");
            telField.setText("");
            cellField.setText("");
            cityField.setText("");
            addressField.setText("");
            courseField.setValue(" ");
            termSpinner1.setValue(" ");

            regnumField.setText("");
        }
    }

    @Override
    public void componentOpened() {
        result = WindowManager.getDefault().findTopComponent("viewerTopComponent").getLookup().lookupResult(Student.class);
        result.addLookupListener(this);
        resultChanged(new LookupEvent(result));
        resetFields();

    }

    @Override
    public void componentClosed() {
        result.removeLookupListener(this);
        result = null;
    }

    public void resetFields() {
        student = new Student();
        nameField.setText("");
        finameField.setText("");
        fanameField.setText("");
        jobField.setText("");
        telField.setText("");
        cellField.setText("");
        cityField.setText("");
        addressField.setText("");
        courseField.setValue(" ");
        termSpinner1.setValue(" ");
        regnumField.setText("");

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

    private class StSaveCapability implements SaveCookie {

        @Override
        public void save() throws IOException {

            Confirmation message = new NotifyDescriptor.Confirmation("آیا مایل به ذخیره رکورد فعلی هستید؟ ",
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

                if (student.getId() != null && student.getTerm().equalsIgnoreCase(termSpinner1.getValue().toString())
                        && student.getCourse().equalsIgnoreCase(courseField.getValue().toString())) {
                    Student c = entityManager.find(Student.class, student.getId());
                    c.setName(nameField.getText());
                    c.setFirstName(finameField.getText());
                    c.setFatherName(fanameField.getText());
                    c.setJob(jobField.getText());
                    c.setAddress1(cityField.getText());
                    c.setAddress2(addressField.getText());
                    c.setCourse(courseField.getValue().toString());
                    c.setTel(telField.getText());
                    c.setCell(cellField.getText());
                    c.setSocialNumber(regnumField.getText());
                    c.setTerm(termSpinner1.getValue().toString());




                    entityManager.getTransaction().commit();
                } else {
                    javax.persistence.Query query = entityManager.createQuery("SELECT c FROM Student c");
                    List<Student> resultList = query.getResultList();

                    student.setId(resultList.size() + 1);
                    student.setName(nameField.getText());
                    student.setFirstName(finameField.getText());
                    student.setFatherName(fanameField.getText());
                    student.setJob(jobField.getText());
                    student.setAddress1(cityField.getText());
                    student.setAddress2(addressField.getText());
                    student.setCourse(courseField.getValue().toString());
                    student.setTel(telField.getText());
                    student.setCell(cellField.getText());
                    student.setSocialNumber(regnumField.getText());
                    student.setTerm(termSpinner1.getValue().toString());

                    //add more fields that will populate all the other columns in the table!
                    entityManager.persist(student);
                    entityManager.getTransaction().commit();

                }
            }


        }

        public void delete(String s) throws IOException {
            Confirmation message = new NotifyDescriptor.Confirmation("آیا مایل یه حذف رکورد جاری هستید؟",
                    NotifyDescriptor.OK_CANCEL_OPTION,
                    NotifyDescriptor.QUESTION_MESSAGE);

            Object result1 = DialogDisplayer.getDefault().notify(message);
            if (NotifyDescriptor.YES_OPTION.equals(result1)) {
                EntityManager entityManager = Persistence.createEntityManagerFactory("stLibraryPU").createEntityManager();
                entityManager.getTransaction().begin();
                javax.persistence.Query query;
                query = entityManager.createQuery("DELETE FROM Student WHERE Student.name = :name");
                query.setParameter("name", s);
               
                entityManager.getTransaction().commit();

            }

        }
    }
}
