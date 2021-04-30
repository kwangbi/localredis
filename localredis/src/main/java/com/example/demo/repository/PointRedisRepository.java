package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.dto.Point;

public interface PointRedisRepository extends CrudRepository<Point, String> {
}
