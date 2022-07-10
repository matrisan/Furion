package com.matrixboot.furion.application.service;

import com.intellij.openapi.components.Service;
import com.intellij.openapi.project.Project;
import com.matrixboot.furion.domain.entity.KubeState;
import com.matrixboot.furion.domain.repository.KubeSettingService;
import com.matrixboot.furion.infrastructure.common.KubeCreateCommand;
import org.jetbrains.annotations.NotNull;


import io.fabric8.kubernetes.api.model.Event;
import io.fabric8.kubernetes.client.DefaultKubernetesClient;
import io.fabric8.kubernetes.client.KubernetesClient;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * create in 2022/6/4 14:53
 *
 * @author shishaodong
 * @version 0.0.1
 */
@Service
public final class KubeService {
    public static final ExecutorService EXECUTOR_SERVICE = new ThreadPoolExecutor(4, 6, 3, TimeUnit.SECONDS, new LinkedBlockingDeque<>(3), Executors.defaultThreadFactory(), new ThreadPoolExecutor.DiscardOldestPolicy());

    private final KubeSettingService repository;

    public KubeService(@NotNull Project myProject) {
        this.repository = myProject.getService(KubeSettingService.class);
    }

    public void create(@NotNull KubeCreateCommand command) {
        System.out.println(command);
        repository.loadState(new KubeState(command.kubeConfigPath));
        FileInputStream stream = null;
        try {
            stream = new FileInputStream(command.getKubeConfigPath());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        KubernetesClient client = DefaultKubernetesClient.fromConfig(stream);
        client.v1().events().inNamespace("matrix-ns").list().getItems().stream()
                .map(Event::getMessage)
                .forEach(System.out::println);
    }


}
