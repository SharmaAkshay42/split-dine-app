package com.project.dinein.service;

import com.project.dinein.dao.OrderRepository;
import com.project.dinein.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Service
public class DineOrderService {

//    private final DineOrderDAO dineOrderDAO;

    private OrderRepository orderRepository;

    @Autowired
    public DineOrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }


//    public DineOrderService(DineOrderDAO dineOrderDAO) {
//        this.dineOrderDAO = dineOrderDAO;
//    }

    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    public Order findById(Integer theId) {
//        Optional<Dish> result = dishRepository.findDishById2(theId);

        Optional<Order> result = orderRepository.findById(theId);

        Order theOrder = null;

        if (result.isPresent()) {
            theOrder = result.get();
        } else {
            // we didn't find the employee
            throw new RuntimeException("Did not find order id - " + theId);
        }
        return theOrder;
    }

    public void save(Order theOrder) {
        orderRepository.save(theOrder);
    }

    public void deleteById(Integer theId) {
        orderRepository.deleteById(theId);
    }


}
