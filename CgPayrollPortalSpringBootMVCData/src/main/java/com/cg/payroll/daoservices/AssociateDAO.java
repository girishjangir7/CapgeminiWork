package com.cg.payroll.daoservices;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cg.payroll.beans.Associate;
public interface AssociateDAO extends JpaRepository<Associate, Integer>{
	
	@Query(value="from Associate a where a.firstName = :name")
	List<Associate> getAllAssociateByName(String name);// Custom Method in DAO using Query
}
