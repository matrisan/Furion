package com.matrixboot.furion.application.service;

import com.intellij.openapi.components.Service;
import com.intellij.openapi.project.Project;

/**
 * TODO
 * <p>
 * create in 2022/6/10 22:23
 *
 * @author shishaodong
 * @version 0.0.1
 */
@Service
public final class TestService {

    private final Project myProject;

    public TestService(Project project) {
        myProject = project;
    }
}
