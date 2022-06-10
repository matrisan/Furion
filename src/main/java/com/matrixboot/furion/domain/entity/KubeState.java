package com.matrixboot.furion.domain.entity;

/**
 * create in 2022/6/5 00:00
 *
 * @author shishaodong
 * @version 0.0.1
 */
public class KubeState {

    public String kubeConfigPath;

    public KubeState() {
    }

    public KubeState(String kubeConfigPath) {
        this.kubeConfigPath = kubeConfigPath;
    }

    public String getKubeConfigPath() {
        return kubeConfigPath;
    }

    public void setKubeConfigPath(String kubeConfigPath) {
        this.kubeConfigPath = kubeConfigPath;
    }

    @Override
    public String toString() {
        return "KubeState{" +
                "kubeConfigPath='" + kubeConfigPath + '\'' +
                '}';
    }
}
