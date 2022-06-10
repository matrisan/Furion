package com.matrixboot.furion.domain.entity;

/**
 * create in 2022/6/5 23:55
 *
 * @author shishaodong
 * @version 0.0.1
 */
public class JenkinsState {

    private String server;

    private String username;

    private String password;

    private String job;

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
