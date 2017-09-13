/*
 * ParameterPanel.java
 *
 * Created on February 15, 2007, 9:23 AM
 */
package pipe.gui.widgets.oldwidges;

import javax.swing.*;

import pipe.gui.ApplicationSettings;
import pipe.gui.PetriNetTab;
import pipe.views.viewComponents.Parameter;
import pipe.views.viewComponents.RateParameter;

/**
 * @author Pere Bonet
 */
public class ParameterPanel 
        extends javax.swing.JPanel {
   
   private final Parameter parameter;
   
   private final String oldName;
   
   private Number oldValue;
   
   private final PetriNetTab _view = ApplicationSettings.getApplicationView().getCurrentTab();

    private final JRootPane rootPane;
   
   /**
    * Creates new form ParameterPanel
    * @param _rootPane
    * @param _param
    */
   public ParameterPanel(JRootPane _rootPane, Parameter _param) {
      parameter = _param;
      rootPane = _rootPane;
      
      initComponents();
      rootPane.setDefaultButton(okButton);
      oldName = _param.getName();
      labelTextField.setText(oldName);
      if (parameter instanceof RateParameter){
         oldValue = ((RateParameter)parameter).getValue();
      }
      valueTextField.setText(oldValue.toString());
      valueTextField.requestFocusInWindow();
   }
   
   /** This method is called from within the constructor to
    * initialize the form.
    * WARNING: Do NOT modify this code. The content of this method is
    * always regenerated by the Form Editor.
    */
   // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
   private void initComponents() {
      java.awt.GridBagConstraints gridBagConstraints;

       JPanel panel = new JPanel();
       JLabel parameterLabelLabel = new JLabel();
       JLabel parameterValueLabel = new JLabel();
      labelTextField = new javax.swing.JTextField();
      valueTextField = new javax.swing.JTextField();
       JLabel jLabel1 = new JLabel();
       JPanel buttonPanel = new JPanel();
      okButton = new javax.swing.JButton();
       JButton cancelButton = new JButton();

      setLayout(new java.awt.GridBagLayout());

      panel.setLayout(new java.awt.GridBagLayout());

      panel.setBorder(javax.swing.BorderFactory.createTitledBorder("Edit Parameter"));
      parameterLabelLabel.setText("Label:");
      gridBagConstraints = new java.awt.GridBagConstraints();
      gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
      panel.add(parameterLabelLabel, gridBagConstraints);

      parameterValueLabel.setText("Value:");
      gridBagConstraints = new java.awt.GridBagConstraints();
      gridBagConstraints.gridx = 0;
      gridBagConstraints.gridy = 1;
      gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
      panel.add(parameterValueLabel, gridBagConstraints);

      labelTextField.setMinimumSize(new java.awt.Dimension(60, 19));
      labelTextField.addFocusListener(new java.awt.event.FocusAdapter() {
         public void focusGained(java.awt.event.FocusEvent evt) {
            labelTextFieldFocusGained(evt);
         }
         public void focusLost(java.awt.event.FocusEvent evt) {
            labelTextFieldFocusLost(evt);
         }
      });

      gridBagConstraints = new java.awt.GridBagConstraints();
      gridBagConstraints.gridwidth = 3;
      gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
      gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
      panel.add(labelTextField, gridBagConstraints);

      valueTextField.addFocusListener(new java.awt.event.FocusAdapter() {
         public void focusGained(java.awt.event.FocusEvent evt) {
            valueTextFieldFocusGained(evt);
         }
         public void focusLost(java.awt.event.FocusEvent evt) {
            valueTextFieldFocusLost(evt);
         }
      });

      gridBagConstraints = new java.awt.GridBagConstraints();
      gridBagConstraints.gridx = 1;
      gridBagConstraints.gridy = 1;
      gridBagConstraints.gridwidth = 3;
      gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
      gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
      panel.add(valueTextField, gridBagConstraints);

      jLabel1.setText("                                        ");
      gridBagConstraints = new java.awt.GridBagConstraints();
      gridBagConstraints.gridx = 1;
      gridBagConstraints.gridy = 2;
      gridBagConstraints.gridwidth = 3;
      gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
      panel.add(jLabel1, gridBagConstraints);

      gridBagConstraints = new java.awt.GridBagConstraints();
      gridBagConstraints.gridwidth = 2;
      gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
      gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
      add(panel, gridBagConstraints);

      buttonPanel.setLayout(new java.awt.GridBagLayout());

      okButton.setText("OK");
      okButton.setMaximumSize(new java.awt.Dimension(75, 25));
      okButton.setMinimumSize(new java.awt.Dimension(75, 25));
      okButton.setPreferredSize(new java.awt.Dimension(75, 25));
      okButton.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            okButtonActionPerformed(evt);
         }
      });

      gridBagConstraints = new java.awt.GridBagConstraints();
      gridBagConstraints.gridx = 0;
      gridBagConstraints.gridy = 1;
      gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
      gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
      buttonPanel.add(okButton, gridBagConstraints);

      cancelButton.setText("Cancel");
      cancelButton.addActionListener(new java.awt.event.ActionListener()
      {
          public void actionPerformed(java.awt.event.ActionEvent evt)
          {
              cancelButtonActionPerformed(evt);
          }
      });

      gridBagConstraints = new java.awt.GridBagConstraints();
      gridBagConstraints.gridx = 1;
      gridBagConstraints.gridy = 1;
      gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
      gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 5);
      buttonPanel.add(cancelButton, gridBagConstraints);

      gridBagConstraints = new java.awt.GridBagConstraints();
      gridBagConstraints.gridx = 1;
      gridBagConstraints.gridy = 1;
      gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
      add(buttonPanel, gridBagConstraints);

   }// </editor-fold>//GEN-END:initComponents

   private void valueTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_valueTextFieldFocusLost
      focusLost(valueTextField);
   }//GEN-LAST:event_valueTextFieldFocusLost

   private void valueTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_valueTextFieldFocusGained
      focusGained(valueTextField);
   }//GEN-LAST:event_valueTextFieldFocusGained

   private void labelTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_labelTextFieldFocusLost
      focusLost(labelTextField);
   }//GEN-LAST:event_labelTextFieldFocusLost

   private void labelTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_labelTextFieldFocusGained
      focusGained(labelTextField);
   }//GEN-LAST:event_labelTextFieldFocusGained

   private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
      exit();
   }//GEN-LAST:event_cancelButtonActionPerformed

   
   private void focusGained(javax.swing.JTextField textField){
      textField.setCaretPosition(0);
      textField.moveCaretPosition(textField.getText().length());
   }
   
   private void focusLost(javax.swing.JTextField textField){
      textField.setCaretPosition(0);
   }   
   
   private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
      String newName = labelTextField.getText();
      _view.getHistoryManager().newEdit(); // new "transaction""
      if (parameter instanceof RateParameter){
         if (!oldName.equals(newName)){
             if (ApplicationSettings.getApplicationView().getCurrentPetriNetView().changeRateParameter(oldName, newName)) {
               _view.getHistoryManager().addEdit(
                        parameter.setParameterName(newName));
               parameter.update();
            } else {
               return;
            }
         }
         try {
            Double newValue = Double.parseDouble(valueTextField.getText());
            if (!oldValue.equals(newValue)) {
               _view.getHistoryManager().addEdit(
                        ((RateParameter)parameter).setValue(newValue));
               parameter.update();               
            }      
         } catch (java.lang.NumberFormatException nfe) {
            return;
         }
      } 
      parameter.updateBounds();
      exit();   
   }//GEN-LAST:event_okButtonActionPerformed
   
   
   private void exit() {
      rootPane.getParent().setVisible(false);
   }


    private javax.swing.JTextField labelTextField;
   private javax.swing.JButton okButton;
    private javax.swing.JTextField valueTextField;
   // End of variables declaration//GEN-END:variables
   
}
