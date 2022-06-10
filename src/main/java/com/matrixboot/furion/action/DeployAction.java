package com.matrixboot.furion.action;

import com.intellij.notification.Notification;
import com.intellij.notification.NotificationType;
import com.intellij.notification.Notifications;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.project.Project;
import com.matrixboot.furion.application.service.JenkinsService;
import com.matrixboot.furion.infrastructure.common.JenkinsBuildCommand;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * create in 2022/6/5 23:46
 *
 * @author shishaodong
 * @version 0.0.1
 */
public class DeployAction extends AnAction {

    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {
        JenkinsService service = getJenkinsService(e);
        service.build(new JenkinsBuildCommand());
        Notifications.Bus.notify(getNotification());
    }

    private JenkinsService getJenkinsService(@NotNull AnActionEvent e) {
        Project requiredData = e.getRequiredData(CommonDataKeys.PROJECT);
        return requiredData.getService(JenkinsService.class);
    }

    @Contract(" -> new")
    private @NotNull Notification getNotification() {
        return new Notification(GROUP_ID, TITLE, MESSAGE, NotificationType.INFORMATION);
    }

    private static final String MESSAGE = "部署任务已经触发!";

    private static final String TITLE = "Pugna";

    private static final String GROUP_ID = "PugnaGroup";
}
