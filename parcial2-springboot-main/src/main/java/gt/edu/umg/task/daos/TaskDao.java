package gt.edu.umg.task.daos;

import gt.edu.umg.task.entities.Task;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TaskDao extends CrudRepository<Task, Long> {


}
