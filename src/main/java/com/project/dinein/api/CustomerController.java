package com.project.dinein.api;

import com.project.dinein.model.Dish;
import com.project.dinein.model.Person;
import com.project.dinein.service.CustomerService;
import com.project.dinein.service.DineOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    private CustomerService customerService;

    @Autowired

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/customers")
    @ResponseBody
    public List<Person> listPersons(Model theModel) {
        return customerService.findAll();

//        theModel.addAttribute("dishes", theDishes);
//
//        return
    }

    @GetMapping("/customers/{dishId}")
    public Person getCustomerById(@PathVariable("customerId") Integer customerId){

        return customerService.findById(customerId);
//        return personService.findById(id);
    }

    @DeleteMapping("/customer/{dishId}")
    public void deleteCustomer(@RequestParam("id") Integer id){

        customerService.deleteById(id);
//        personService.deleteById(id);
    }

    @PostMapping("/customer")
    public String saveEmployee(@ModelAttribute("customer") Person theCustomer) {

        // save the employee
        customerService.save(theCustomer);

        // use a redirect to prevent duplicate submissions
//        return "redirect:/employees/list";
        return "";
    }



}
