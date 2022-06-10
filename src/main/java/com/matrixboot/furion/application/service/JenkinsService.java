package com.matrixboot.furion.application.service;

import com.intellij.openapi.components.Service;
import com.intellij.openapi.project.Project;
import com.matrixboot.furion.infrastructure.common.JenkinsBuildCommand;

/**
 * TODO
 * <p>
 * create in 2022/6/5 23:44
 *
 * @author shishaodong
 * @version 0.0.1
 */
@Service
public final class JenkinsService {

    public JenkinsService(Project project) {
    }

    public void build(JenkinsBuildCommand command) {

    }
}
