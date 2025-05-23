package com.mycompany.tpintegrador.src;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Usuario {

    private String authoID;
    private String username;

    public Usuario(String authoID, String username) {
        this.authoID = authoID;
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
