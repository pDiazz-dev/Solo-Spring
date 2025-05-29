package com.github.pdiazz.TesteSozinho.TaskList;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<TaskEnity , Integer> {


    void delete(TaskEnity taskEnity);
}
