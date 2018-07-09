/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.samirhasanov.test.controller;

import com.samirhasanov.test.domain.Car;
import com.samirhasanov.test.form.CarForm;
import com.samirhasanov.test.service.ICarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.hateoas.PagedResources;
import org.springframework.hateoas.PagedResources.PageMetadata;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Hasanov (Asus)
 */
@RestController
@RequestMapping(value = "/cars", produces = MediaType.APPLICATION_JSON_VALUE)
public class CarController {
    
    @Autowired
    private ICarService carService;
    
    @GetMapping
    protected PagedResources<Car> findCars(CarForm form) {
        Page<Car> carsPage = carService.findAllCars(PageRequest.of(form.getPage(), form.getPagesize(), Sort.by("id")));
        PagedResources<Car> resources = new PagedResources(carsPage.getContent(), 
                new PageMetadata(carsPage.getSize(), 
                                 carsPage.getNumber(), 
                                 carsPage.getTotalElements(), 
                                 carsPage.getTotalPages()));
        
        return resources;
    }
}
