package org.generation.italy.progectDepartment.model.data.services.implementations;

import org.generation.italy.progectDepartment.model.data.abstractions.DepartmentRepository;
import org.generation.italy.progectDepartment.model.data.exceptions.DataException;
import org.generation.italy.progectDepartment.model.data.exceptions.EntityNotFoundException;
import org.generation.italy.progectDepartment.model.data.services.abstractions.AbstractDepartmentService;
import org.generation.italy.progectDepartment.model.entities.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class StandardDepartmentService implements AbstractDepartmentService {
    private DepartmentRepository repo;
    @Autowired

    public StandardDepartmentService(DepartmentRepository repo) {
        this.repo = repo;
    }

    @Override
    public Department saveDepartment(Department department) throws DataException {
        return null;
    }

    @Override
    public void deleteById(long id) throws DataException, EntityNotFoundException {

    }

    @Override
    public Iterable<Department> findByDepartmentNameLike(String part) throws DataException {
        return null;
    }
}
