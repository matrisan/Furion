package com.matrixboot.furion.infrastructure.config;

import com.intellij.openapi.options.SearchableConfigurable;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.NlsContexts;
import com.matrixboot.furion.domain.repository.JenkinsSettingService;
import com.matrixboot.furion.domain.repository.KubeSettingService;
import com.matrixboot.furion.infrastructure.core.ComponentCommon;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * create in 2022/6/6 23:31
 *
 * @author shishaodong
 * @version 0.0.1
 */
public class FurionConfigurable implements SearchableConfigurable {

    private final Project project;

    public FurionConfigurable(Project project) {
        this.project = project;
    }

    @Override
    public @NotNull @NonNls String getId() {
        return "Furion";
    }

    @NlsContexts.ConfigurableName
    @Override
    public String getDisplayName() {
        return "Furion";
    }

    @Override
    public @Nullable JComponent createComponent() {
        return ComponentCommon.SETTING_UI.getMainPanel();
    }

    @Override
    public boolean isModified() {
        return true;
    }

    @Override
    public void apply() {
        KubeSettingService kubeSettingService = KubeSettingService.getInstance(project);
        JenkinsSettingService jenkinsSettingService = JenkinsSettingService.getInstance(project);
        assert kubeSettingService.getState() != null;
        kubeSettingService.getState().setKubeConfigPath(ComponentCommon.SETTING_UI.getKubeConfigTextField().getText());
        assert jenkinsSettingService.getState() != null;
        jenkinsSettingService.getState().setServer(ComponentCommon.SETTING_UI.getServerTextField().getText());
        jenkinsSettingService.getState().setUsername(ComponentCommon.SETTING_UI.getUsernameTextField().getText());
        jenkinsSettingService.getState().setPassword(new String(ComponentCommon.SETTING_UI.getPasswordField().getPassword()));
        jenkinsSettingService.getState().setJob(ComponentCommon.SETTING_UI.getJobTextField().getText());
    }
}
