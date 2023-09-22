package com.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.entity.Coder;

//@Repository
public interface CoderRepository extends JpaRepository<Coder, Integer>
{
	Optional<Coder> getCoderByCname(String cname);
	
	@Query("Select c from Coder c where c.tech=?1 order by c.cname")
	List<Coder>  getCoderByTechSortedByCname(String tech);

}
