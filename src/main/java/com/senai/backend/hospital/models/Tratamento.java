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
@Table(name="tratamento")
public class Tratamento {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="status")
    private String status;

    @Column(name="descricao")
    private String descricao;

    @Column(name="custo")
    private Double custo;

    @Column(name="duracao_minutos")
    private int duracaoMinutos;

    @Column(name="dataHoraCriacao")
    private LocalDateTime dataHoraCriacao;

    @Column(name="dataHoraAtualizacao")
    private LocalDateTime dataHoraAtualizacao;

    @OneToMany(mappedBy="categoria")
    private List<Categoria> categorias;

    public Tratamento() {
    }

    public Tratamento(Double custo, LocalDateTime dataHoraAtualizacao, LocalDateTime dataHoraCriacao, String descricao, int duracaoMinutos, Integer id, String status, List<Categoria> categorias) {
        this.custo = custo;
        this.dataHoraAtualizacao = dataHoraAtualizacao;
        this.dataHoraCriacao = dataHoraCriacao;
        this.descricao = descricao;
        this.duracaoMinutos = duracaoMinutos;
        this.id = id;
        this.status = status;
        this.categorias = categorias;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getCusto() {
        return custo;
    }

    public void setCusto(Double custo) {
        this.custo = custo;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
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

    public List<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<Categoria> categorias) {
        this.categorias = categorias;
    }

}
