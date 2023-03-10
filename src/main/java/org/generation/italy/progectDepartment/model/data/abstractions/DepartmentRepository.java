package org.generation.italy.progectDepartment.model.data.abstractions;

import org.generation.italy.progectDepartment.model.data.exceptions.DataException;
import org.generation.italy.progectDepartment.model.data.exceptions.EntityNotFoundException;
import org.generation.italy.progectDepartment.model.entities.Department;

public interface DepartmentRepository {
    Department saveDepartment(Department department) throws DataException;
    void deleteById(long id) throws DataException, EntityNotFoundException;
    Iterable<Department> findByDepartmentNameLike(String part) throws DataException;
}
