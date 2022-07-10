package com.matrixboot.furion.ui;

import com.intellij.openapi.fileChooser.FileChooserDescriptorFactory;
import com.intellij.openapi.ui.TextBrowseFolderListener;
import com.intellij.openapi.ui.TextFieldWithBrowseButton;

import javax.swing.*;


/**
 * create in 2022/6/6 23:50
 *
 * @author shishaodong
 * @version 0.0.1
 */
public class SettingUi {

    private JPanel mainPanel;
    private TextFieldWithBrowseButton kubeConfigTextField;
    private JTextField serverTextField;
    private JTextField usernameTextField;
    private JPasswordField passwordField;
    private JTextField jobTextField;


    public SettingUi() {
        initUi();
    }

    private void initUi() {
        kubeConfigTextField.addBrowseFolderListener(new TextBrowseFolderListener(FileChooserDescriptorFactory.createSingleFileOrFolderDescriptor()) {});
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public void setMainPanel(JPanel mainPanel) {
        this.mainPanel = mainPanel;
    }

    public TextFieldWithBrowseButton getKubeConfigTextField() {
        return kubeConfigTextField;
    }

    public void setKubeConfigTextField(TextFieldWithBrowseButton kubeConfigTextField) {
        this.kubeConfigTextField = kubeConfigTextField;
    }

    public JTextField getServerTextField() {
        return serverTextField;
    }

    public void setServerTextField(JTextField serverTextField) {
        this.serverTextField = serverTextField;
    }

    public JTextField getUsernameTextField() {
        return usernameTextField;
    }

    public void setUsernameTextField(JTextField usernameTextField) {
        this.usernameTextField = usernameTextField;
    }

    public JPasswordField getPasswordField() {
        return passwordField;
    }

    public void setPasswordField(JPasswordField passwordField) {
        this.passwordField = passwordField;
    }

    public JTextField getJobTextField() {
        return jobTextField;
    }

    public void setJobTextField(JTextField jobTextField) {
        this.jobTextField = jobTextField;
    }
}
