package com.employee.com.mapper;

import java.util.List;
import org.mapstruct.Mapper;

import com.employee.com.model.Employee;
import com.employee.com.model.EmployeeVo;

@Mapper(componentModel = "Spring")
public interface EmployeeMapper {
	
	 // Logger Logger = LoggerFactory.getLogger("mapper is mapping vo to dto");
	//EmployeeMapper MAPPER = Mappers.getMapper(EmployeeMapper.class);
	List<EmployeeVo> toEmployeeVo(List<Employee> list);
	List<Employee> toEmployees(List<EmployeeVo> list);
	Employee toEmployee(EmployeeVo employee);
	EmployeeVo toEmployeeVo(Employee employee1);
	
	

}
