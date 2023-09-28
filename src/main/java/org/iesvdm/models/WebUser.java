package org.iesvdm.models;

    enum UserState {New, Active, Blocked, Banned};
public class WebUser {

    // ATTRIBUTES:
    private String login_id;
    private String password;
    public UserState state;

    // CONSTRUCTOR:
    public WebUser(){

    }

    // METHODS:


}
