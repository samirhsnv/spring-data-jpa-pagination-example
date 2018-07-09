/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.samirhasanov.test.service;

import com.samirhasanov.test.dao.ICarDao;
import com.samirhasanov.test.domain.Car;
import com.samirhasanov.test.form.CarForm;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import static org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers.*;

/**
 *
 * @author Hasanov (Asus)
 */
@Service
public class CarService implements ICarService {
    private final ICarDao carDao;
    
    public CarService(ICarDao carDao) {
        this.carDao = carDao;
    }
    
    @Override
    public Page<Car> findAllCars(PageRequest pageRequest) {
        return carDao.findAll(pageRequest);
    }
    
}
