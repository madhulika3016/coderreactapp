package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.Laptop;

public interface LaptopRepo extends JpaRepository<Laptop, Integer>
{

}
