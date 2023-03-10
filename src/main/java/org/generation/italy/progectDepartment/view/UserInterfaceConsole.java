package org.generation.italy.progectDepartment.view;

import org.generation.italy.progectDepartment.model.data.services.abstractions.AbstractDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserInterfaceConsole {
    AbstractDepartmentService service;

    @Autowired
    public UserInterfaceConsole(AbstractDepartmentService service) {
        this.service = service;
    }
    public void start(){

    }
}
