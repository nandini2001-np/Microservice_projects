package com.practice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.dto.DepartmentDTO;
import com.practice.entity.Department;
import com.practice.repository.DepartmentRepo;


@Service
public class DepartmentServiceImpl implements DepartmentService {
	
     @Autowired
	private DepartmentRepo repo;

	 @Override
	 public DepartmentDTO saveDepartment(DepartmentDTO departmentdto) {
		Department department=new Department();
		department.setDepartmentName(departmentdto.getDepartmentName());
		department.setDepartmentDescription(departmentdto.getDepartmentDescription());
		department.setDepartmentCode(departmentdto.getDepartmentCode());
		
		Department saved = repo.save(department);
		
		return new DepartmentDTO(
				saved.getDepartmentName(),
				saved.getDepartmentDescription(),
				saved.getDepartmentCode()
				);
	 }

	 @Override
	 public DepartmentDTO findDepartmentbycode(String departmentcode) {
		Department department = repo.findByDepartmentCode(departmentcode);
		return new DepartmentDTO(
				department.getDepartmentName(),
				department.getDepartmentDescription(),
				department.getDepartmentCode()
				);
	 }


	

	
}
