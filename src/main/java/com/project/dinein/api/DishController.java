package com.project.dinein.api;

import com.project.dinein.model.Dish;
import com.project.dinein.model.Person;
import com.project.dinein.service.DishService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DishController {

    private DishService dishService;

    public DishController(DishService dishService) {
        this.dishService = dishService;
    }

    @GetMapping("/dishes")
    @ResponseBody
    public List<Dish> listDishes(Model theModel) {
        return dishService.findAll();

//        theModel.addAttribute("dishes", theDishes);
//
//        return
    }

    @GetMapping("/dishes/{dishId}")
    public Dish getDishById(@PathVariable("dishId") int dishId){

        return dishService.findById(dishId);
//        return personService.findById(id);
    }

    @GetMapping("/dishes/type/{type}")
    public List<Dish> findDishByType(@PathVariable("type") String type) {
        return dishService.findDishByType(type);
    }

    @DeleteMapping("/dishes/{dishId}")
    public void deleteDishById(@RequestParam("id") int id){

        dishService.deleteById(id);
//        personService.deleteById(id);
    }

}
