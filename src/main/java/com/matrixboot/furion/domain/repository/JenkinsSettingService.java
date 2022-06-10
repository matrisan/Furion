package com.matrixboot.furion.domain.repository;

import com.intellij.openapi.components.PersistentStateComponent;
import com.intellij.openapi.components.State;
import com.intellij.openapi.components.Storage;
import com.intellij.openapi.project.Project;
import com.matrixboot.furion.domain.entity.JenkinsState;
import org.jetbrains.annotations.NotNull;

/**
 * create in 2022/6/5 23:55
 *
 * @author shishaodong
 * @version 0.0.1
 */
@State(name = "JenkinsSetting", storages =  @Storage("$PROJECT_CONFIG_DIR$/jenkins-setting.xml"))
public class JenkinsSettingService implements PersistentStateComponent<JenkinsState> {

    private JenkinsState state = new JenkinsState();

    public static JenkinsSettingService getInstance(@NotNull Project project) {
        return project.getService(JenkinsSettingService.class);
    }

    @Override
    public JenkinsState getState() {
        return state;
    }

    @Override
    public void loadState(@NotNull JenkinsState state) {
        this.state = state;
    }

}
