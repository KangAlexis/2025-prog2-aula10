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
    
    private static int valorId = 0;
    private int id;
    private String nome;
    private String sobrenome;
    private LocalDate dataNasc;
    private String sexo;
    private String pais;
    private String estado;
    private String cidade;
    private String email;
    private String senha;

    public Pessoa() {
        
    }

    public Pessoa(int id, String nome, String sobrenome, LocalDate dataNasc, String sexo, String pais, String estado, String cidade, String email, String senha) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNasc = dataNasc;
        this.sexo = sexo;
        this.pais = pais;
        this.estado = estado;
        this.cidade = cidade;
        this.email = email;
        this.senha = senha;
    }

    public static int getValorId() {
        return valorId;
    }

    public static void setValorId(int valorId) {
        Pessoa.valorId = valorId;
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

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        
        this.id = valorId++;
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

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
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
        return "Pessoa{" + "id=" + id + ", nome=" + nome + ", sobrenome=" + sobrenome + ", dataNasc=" + dataNasc + ", sexo=" + sexo + ", pais=" + pais + ", estado=" + estado + ", cidade=" + cidade + '}';
    }
}
