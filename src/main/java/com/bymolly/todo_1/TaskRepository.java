package com.bymolly.todo_1;

import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task,
        Long>{
}
