package com.github.pdiazz.TesteSozinho.TaskList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/taks")
@Controller
public class TaskController {

    @Autowired
    private TaskService taskService;


    @PostMapping("/salvar")
    public TaskEnity salvarTask(@RequestBody TaskEnity salvar){
        return taskService.salvandoTask(salvar);
    }

    @GetMapping("{id}")
    public TaskEnity buscar(@PathVariable("id") Integer id){
        return taskService.pesquisarPorId(id);
    }

    @DeleteMapping("{id}")
    public void deletar(@PathVariable("id") Integer id){
        taskService.apagarPorId(id);
    }

    @PutMapping("{id}")
    public TaskEnity atualizar(@PathVariable("id") Integer id , @RequestBody TaskEnity taskEnity){
        return taskService.atualizar(id, taskEnity);
    }
}
