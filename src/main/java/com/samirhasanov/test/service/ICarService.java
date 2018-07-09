/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.samirhasanov.test.service;

import com.samirhasanov.test.domain.Car;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 *
 * @author Hasanov (Asus)
 */
public interface ICarService {
    public Page<Car> findAllCars(PageRequest pageRequest);
}
