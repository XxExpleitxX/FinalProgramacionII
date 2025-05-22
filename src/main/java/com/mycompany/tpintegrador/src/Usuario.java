package com.mycompany.tpintegrador.src;

public class Usuario {

    private String authoID;
    private String username;


    public Usuario() {
    }

    public Usuario(String authoID, String username) {
        this.authoID = authoID;
        this.username = username;
    }

    public String getAuthoID() {
        return authoID;
    }

    public void setAuthoID(String authoID) {
        this.authoID = authoID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "authoID='" + authoID + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
