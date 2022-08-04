package com.project.dinein.api;

import com.project.dinein.model.Dish;
import com.project.dinein.model.Order;
import com.project.dinein.service.DineOrderService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {

    private DineOrderService orderService;


    public OrderController(DineOrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/orders")
    @ResponseBody
    public List<Order> listDishes(Model theModel) {
        return orderService.findAll();

//        theModel.addAttribute("dishes", theDishes);
//
//        return
    }

    @GetMapping("/orders/{dishId}")
    public Order getOrderById(@PathVariable("orderId") int orderId){

        return orderService.findById(orderId);
//        return personService.findById(id);
    }

    @DeleteMapping("/orders/{orderId}")
    public void deleteOrders(@RequestParam("orderId") int orderId){

        orderService.deleteById(orderId);
//        personService.deleteById(id);
    }

    @PostMapping("/orders")
    public void createOrders(@RequestParam("order") Order theOrder) {
        orderService.save(theOrder);
    }
}
