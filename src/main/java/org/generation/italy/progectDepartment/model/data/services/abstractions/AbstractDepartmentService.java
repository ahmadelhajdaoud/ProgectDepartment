package org.generation.italy.progectDepartment.model.data.services.abstractions;

import org.generation.italy.progectDepartment.model.data.abstractions.DepartmentRepository;
import org.generation.italy.progectDepartment.model.data.exceptions.DataException;
import org.generation.italy.progectDepartment.model.data.exceptions.EntityNotFoundException;
import org.generation.italy.progectDepartment.model.entities.Department;

public interface AbstractDepartmentService {
    Department saveDepartment(Department department) throws DataException;
    void deleteById(long id) throws DataException, EntityNotFoundException;
    Iterable<Department> findByDepartmentNameLike(String part) throws DataException;
}
