package com.project.dinein.service;

import com.project.dinein.dao.DishRepository;
import com.project.dinein.model.Dish;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DishService {

    private DishRepository dishRepository;

    @Autowired

    public DishService(DishRepository dishRepository) {
        this.dishRepository = dishRepository;
    }

    public List<Dish> findAll() {
        return dishRepository.findAll();
    }

    public List<Dish> findDishByType(String type) {
        return dishRepository.findDishByType(type);
    }

    public Dish findById(Integer theId) {
//        Optional<Dish> result = dishRepository.findDishById2(theId);

        Optional<Dish> result = dishRepository.findById(theId);

        Dish theDish = null;

        if (result.isPresent()) {
            theDish = result.get();
        } else {
            // we didn't find the employee
            throw new RuntimeException("Did not find dish id - " + theId);
        }
        return theDish;
    }


    public void save(Dish theDish) {
        dishRepository.save(theDish);
    }

    public void deleteById(int theId) {
        dishRepository.deleteById(theId);
    }
}
