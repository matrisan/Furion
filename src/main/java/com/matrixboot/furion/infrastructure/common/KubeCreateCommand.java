package com.matrixboot.furion.infrastructure.common;


/**
 * create in 2022/6/4 14:54
 *
 * @author shishaodong
 * @version 0.0.1
 */

public class KubeCreateCommand {

    public String kubeConfigPath;

    public KubeCreateCommand(String kubeConfigPath) {
        this.kubeConfigPath = kubeConfigPath;
    }

    public String getKubeConfigPath() {
        return kubeConfigPath;
    }

    @Override
    public String toString() {
        return "KubeCreateCommand{" +
                "kubeConfigPath='" + kubeConfigPath + '\'' +
                '}';
    }
}
