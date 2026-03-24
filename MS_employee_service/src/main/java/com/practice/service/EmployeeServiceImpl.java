package com.practice.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.practice.dto.ApiResponseDTO;
import com.practice.dto.DepartmentDTO;
import com.practice.dto.EmployeeDTO;
import com.practice.dto.ProductDTO;
import com.practice.entity.Employee;
import com.practice.repo.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepo repo;
	
//	@Autowired
//	private RestTemplate restTemplate;
	
	
//	@Autowired
//	private WebClient webclient;
	
	@Autowired
	private APIClients apiclient;
	
//	
//	@Autowired
//	private ProductClient productClient;

	@Override
	public EmployeeDTO saveEmployee(EmployeeDTO employeeDto) {
		Employee employee=new Employee();
		employee.setName(employeeDto.getName());
		employee.setEmail(employeeDto.getEmail());
		employee.setDepartmentCode(employeeDto.getDepartmentCode());
		employee.setProductCode(employeeDto.getProductCode());
		
		
		Employee saved = repo.save(employee);
		
		return new EmployeeDTO(
				saved.getName(),
				saved.getEmail(),
				saved.getDepartmentCode(), 
				saved.getProductCode()
				
				);
	 }

	

	@Override
	public ApiResponseDTO getEmployeeById(Long id) {
		
		    Employee employee = repo.findById(id).orElseThrow(() -> new RuntimeException("Employee not found with id: " + id));
		    
		   
		    
		   DepartmentDTO departmentDTO= apiclient.getDepartmentByCode(employee.getDepartmentCode());
		   
//		  ProductDTO productDTO= productClient.getProductByCode(employee.getProductCode());
		    
           EmployeeDTO employeeDTO=new EmployeeDTO(
        		        employee.getName(),
		            employee.getEmail(),
		            employee.getDepartmentCode(),
		            employee.getProductCode()


        		   );
           
           ApiResponseDTO apiResponseDTO=new ApiResponseDTO();
		    
		    		apiResponseDTO.setEmployee(employeeDTO);
		    		apiResponseDTO.setDepartment(departmentDTO);
//		    		apiResponseDTO.setProduct(productDTO);
		    		return apiResponseDTO;
		    		
		    		
		            		    
		}

		
	}


