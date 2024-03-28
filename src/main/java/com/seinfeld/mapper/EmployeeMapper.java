package com.seinfeld.mapper;

import com.seinfeld.dto.DivisionDTO;
import com.seinfeld.dto.EmployeeDTO;
import com.seinfeld.entity.Division;
import com.seinfeld.entity.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface EmployeeMapper {

    @Mapping(target = "employeeId", source = "entity.id")
    @Mapping(target = "employeeName", source = "entity.name")
    @Mapping(target = "employeeStartAt", source = "entity.startAt",
            dateFormat = "dd-MM-yyyy")
    EmployeeDTO employeeToEmployeeDTO(Employee entity);

    @Mapping(target = "id", source = "dto.employeeId")
    @Mapping(target = "name", source = "dto.employeeName")
    @Mapping(target = "startAt", source = "dto.employeeStartAt",
            dateFormat = "dd-MM-yyyy")
    Employee employeeDTOtoEmployee(EmployeeDTO dto);

    @Mapping(target = "dtoId", source = "entity.id")
    @Mapping(target = "dtoName", source = "entity.name")
    DivisionDTO divisionToDivisionDTO(Division entity);

    @Mapping(target = "id", source = "dto.dtoId")
    @Mapping(target = "name", source = "dto.dtoName")
    Division divisionDTOtoDivision(DivisionDTO dto);
}
