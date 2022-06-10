package com.matrixboot.furion.application.listener;

import com.intellij.openapi.vcs.VcsException;
import com.intellij.openapi.vcs.changes.CommitResultHandler;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * create in 2022/6/10 23:44
 *
 * @author shishaodong
 * @version 0.0.1
 */
public class NotificationListenerImpl implements CommitResultHandler {

    @Override
    public void onSuccess(@NotNull String commitMessage) {
        System.out.println("commitMessage " + commitMessage);
    }

    @Override
    public void onCancel() {
        CommitResultHandler.super.onCancel();
    }

    @Override
    public void onFailure(@NotNull List<VcsException> errors) {
        CommitResultHandler.super.onFailure(errors);
    }
}
