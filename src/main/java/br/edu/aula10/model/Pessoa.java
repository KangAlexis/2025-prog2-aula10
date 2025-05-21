/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.aula10.model;

import java.time.LocalDate;

/**
 *
 * @author User
 */
public class Pessoa {
    
    private String nome;
    private String sobrenome;
    private LocalDate dataNasc;
    private String sexo;
    private String estado;
    private String cidade;
    private String email;
    private String senha;

    public Pessoa() {
        
    }

    public Pessoa( String nome, String sobrenome, LocalDate dataNasc, String sexo, String estado, String cidade, String email, String senha) {
      
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNasc = dataNasc;
        this.sexo = sexo;
        this.estado = estado;
        this.cidade = cidade;
        this.email = email;
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "Nome=" + nome + ", sobrenome=" + sobrenome + ", dataNasc=" + dataNasc + ", sexo=" + sexo + ", estado=" + estado + ", cidade=" + cidade + ", email=" + email + ", senha=" + senha + '}';
    }

    
}
