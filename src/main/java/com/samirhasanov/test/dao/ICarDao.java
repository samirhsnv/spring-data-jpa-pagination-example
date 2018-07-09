/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.samirhasanov.test.dao;

import com.samirhasanov.test.domain.Car;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author Hasanov (Asus)
 */
public interface ICarDao extends PagingAndSortingRepository<Car, Long> {
    
}
