package com.senai.backend.hospital.models;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="agendamento")
public class Agendamento {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="data_hora")
    private LocalDateTime dataHora;

    @Column(name="observacoes_medicas")
    private String observacoesMedicas;

    @Column(name="status")
    private String status;

    @OneToMany(mappedBy="tratamento")
    private List<Tratamento> tratamentos;

    @ManyToOne
    @JoinColumn(name="medico_id")
    private Medico medico;

    @ManyToOne
    @JoinColumn(name="paciente_id")
    private Paciente paciente;

    public Agendamento() {
    }

    public Agendamento(LocalDateTime dataHora, Integer id, Medico medico, String observacoesMedicas, Paciente paciente, String status, List<Tratamento> tratamentos) {
        this.dataHora = dataHora;
        this.id = id;
        this.medico = medico;
        this.observacoesMedicas = observacoesMedicas;
        this.paciente = paciente;
        this.status = status;
        this.tratamentos = tratamentos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public String getObservacoesMedicas() {
        return observacoesMedicas;
    }

    public void setObservacoesMedicas(String observacoesMedicas) {
        this.observacoesMedicas = observacoesMedicas;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Tratamento> getTratamentos() {
        return tratamentos;
    }

    public void setTratamentos(List<Tratamento> tratamentos) {
        this.tratamentos = tratamentos;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }


}
