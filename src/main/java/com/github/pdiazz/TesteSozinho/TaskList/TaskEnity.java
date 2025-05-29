package com.github.pdiazz.TesteSozinho.TaskList;

import jakarta.persistence.*;


@Entity
@Table(name = "Tasks")
public class TaskEnity {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String nameTask;

    @Column
    private String descricaoTask;

    @Column
    private Boolean concluida;


    @Override
    public String toString() {
        return "TaskEnity{" +
                "concluida=" + concluida +
                ", id=" + id +
                ", nameTask='" + nameTask + '\'' +
                ", descricaoTask='" + descricaoTask + '\'' +
                '}';
    }

    public Boolean getConcluida() {
        return concluida;
    }

    public void setConcluida(Boolean concluida) {
        this.concluida = concluida;
    }

    public String getDescricaoTask() {
        return descricaoTask;
    }

    public void setDescricaoTask(String descricaoTask) {
        this.descricaoTask = descricaoTask;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameTask() {
        return nameTask;
    }

    public void setNameTask(String nameTask) {
        this.nameTask = nameTask;
    }
}
