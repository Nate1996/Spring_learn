package com.NATE.poji;



public class User {
    private int it;
    private String username;
    private String jobs;
    private int phone;

    public int getIt() {
        return it;
    }

    public void setIt(int it) {
        this.it = it;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getJobs() {
        return jobs;
    }

    public void setJobs(String jobs) {
        this.jobs = jobs;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "it=" + it +
                ", username='" + username + '\'' +
                ", jobs='" + jobs + '\'' +
                ", phone=" + phone +
                '}';
    }
}
