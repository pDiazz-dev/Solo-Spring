package com.github.pdiazz.TesteSozinho.TaskList;

import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    private TaskRepository taskRepository;


    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public TaskEnity salvandoTask(TaskEnity novaTask){
        return taskRepository.save(novaTask);
    }

    public TaskEnity pesquisarPorId(Integer id){
        return taskRepository.findById(id).orElse(null);

    }
    public void apagarPorId(Integer id) {
        taskRepository.deleteById(id);
    }

    public TaskEnity atualizar(Integer id , TaskEnity taskEnity){
        taskEnity.setId(id);
        return taskRepository.save(taskEnity);
    }

}
