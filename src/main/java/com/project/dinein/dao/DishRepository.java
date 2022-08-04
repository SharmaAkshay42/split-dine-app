package com.project.dinein.dao;

// public interface EmployeeRepository extends JpaRepository<Employee, Integer>

import com.project.dinein.model.Dish;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface DishRepository extends JpaRepository<Dish, Integer> {

    @Query(value="select d from Dish d where d.dishId = ?1")
    Optional<Dish> findDishById2(Integer dishId);

    @Query(value="select d from Dish d where d.type = ?1")
    List<Dish> findDishByType(String type);

}
