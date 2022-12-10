/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.Luciano.Security.Dto;

import javax.validation.constraints.NotBlank;

/**
 *
 * @author Luciano
 */
public class LoginUsuario {
    //no puede estar en blanco o vacio;
    @NotBlank
    private String nombreUsuario;
    @NotBlank
    private String password;
    
    //Getters and Setters

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
