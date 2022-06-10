package com.matrixboot.furion.domain.repository;

import com.intellij.openapi.components.PersistentStateComponent;
import com.intellij.openapi.components.State;
import com.intellij.openapi.components.Storage;
import com.intellij.openapi.project.Project;
import com.matrixboot.furion.domain.entity.KubeState;
import org.jetbrains.annotations.NotNull;

/**
 * create in 2022/6/4 22:01
 *
 * @author shishaodong
 * @version 0.0.1
 */
@State(name = "KubeSetting", storages = @Storage("$PROJECT_CONFIG_DIR$/kube-setting.xml"))
public class KubeSettingService implements PersistentStateComponent<KubeState> {

    private KubeState state = new KubeState();

    public static KubeSettingService getInstance(@NotNull Project project) {
        return project.getService(KubeSettingService.class);
    }

    @Override
    public KubeState getState() {
        return state;
    }

    @Override
    public void loadState(@NotNull KubeState state) {
        this.state = state;
    }

}
