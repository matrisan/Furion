package com.matrixboot.furion.infrastructure.common;

/**
 * create in 2022/6/4 14:58
 *
 * @author shishaodong
 * @version 0.0.1
 */

public class JenkinsCreateCommand {

    private String url;

    private String username;

    private String password;

    private String job;

    public JenkinsCreateCommand(String url, String username, String password, String job) {
        this.url = url;
        this.username = username;
        this.password = password;
        this.job = job;
    }

    public String getUrl() {
        return url;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getJob() {
        return job;
    }

    @Override
    public String toString() {
        return "JenkinsCreateCommand{" +
                "url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}
