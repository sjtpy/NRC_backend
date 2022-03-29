package com.example.samprojectdb.repository;
import com.example.samprojectdb.entity.Child;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChildRepo extends JpaRepository<Child,Integer> {

    Child findChildByName(String name);
}
