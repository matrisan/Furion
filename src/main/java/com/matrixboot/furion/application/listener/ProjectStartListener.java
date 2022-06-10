package com.matrixboot.furion.application.listener;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.intellij.notification.Notifications;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.project.ProjectManagerListener;
import org.jetbrains.annotations.NotNull;

import java.util.Date;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/**
 * <p>
 * create in 2022/6/9 23:53
 *
 * @author shishaodong
 * @version 0.0.1
 */
public class ProjectStartListener implements ProjectManagerListener {

    private static final ThreadFactory NAME_THREAD_FACTORY = new ThreadFactoryBuilder().setNameFormat("task-pool-%d").build();

    private static final ScheduledThreadPoolExecutor POOL_EXECUTOR = new ScheduledThreadPoolExecutor(2, NAME_THREAD_FACTORY);

    @Override
    public void projectOpened(@NotNull Project project) {
        POOL_EXECUTOR.scheduleAtFixedRate(new BackgroundTask(), 5, 5, TimeUnit.SECONDS);
    }

    static class BackgroundTask implements Runnable {

        @Override
        public void run() {
            System.out.println("-----------------ProjectStartListener-----------------scheduleAtFixedRate - " + new Date());
        }
    }

}
