package com.senai.backend.hospital.models;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="medico")
public class Medico {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="nome")
    private String nome;

    @Column(name="especializacao")
    private String especializacao;

    @Column(name="limiteDiario")
    private int limiteDiario;

    @Column(name="status")
    private boolean status;

    @Column(name="dataHoraCriacao")
    private LocalDateTime dataHoraCriacao;

    @Column(name="dataHoraAtualizacao")
    private LocalDateTime dataHoraAtualizacao;

    @OneToMany(mappedBy="carga_horaria")
    private List<CargaHoraria> listaCargaHoraria;

    @OneToMany(mappedBy="agendamento")
    private List<Agendamento> agendamentos;

    public Medico() {
    }

    public Medico(LocalDateTime dataHoraAtualizacao, LocalDateTime dataHoraCriacao, String especializacao, Integer id, int limiteDiario, List<CargaHoraria> listaCargaHoraria, String nome, boolean status, List<Agendamento> agendamentos) {
        this.dataHoraAtualizacao = dataHoraAtualizacao;
        this.dataHoraCriacao = dataHoraCriacao;
        this.especializacao = especializacao;
        this.id = id;
        this.limiteDiario = limiteDiario;
        this.listaCargaHoraria = listaCargaHoraria;
        this.nome = nome;
        this.status = true;
        this.agendamentos = agendamentos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    public int getLimiteDiario() {
        return limiteDiario;
    }

    public void setLimiteDiario(int limiteDiario) {
        this.limiteDiario = limiteDiario;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public LocalDateTime getDataHoraCriacao() {
        return dataHoraCriacao;
    }

    public void setDataHoraCriacao(LocalDateTime dataHoraCriacao) {
        this.dataHoraCriacao = dataHoraCriacao;
    }

    public LocalDateTime getDataHoraAtualizacao() {
        return dataHoraAtualizacao;
    }

    public void setDataHoraAtualizacao(LocalDateTime dataHoraAtualizacao) {
        this.dataHoraAtualizacao = dataHoraAtualizacao;
    }

    public List<CargaHoraria> getListaCargaHoraria() {
        return listaCargaHoraria;
    }

    public void setListaCargaHoraria(List<CargaHoraria> listaCargaHoraria) {
        this.listaCargaHoraria = listaCargaHoraria;
    }

    public List<Agendamento> getAgendamentos() {
        return agendamentos;
    }

    public void setAgendamentos(List<Agendamento> agendamentos) {
        this.agendamentos = agendamentos;
    }

}
