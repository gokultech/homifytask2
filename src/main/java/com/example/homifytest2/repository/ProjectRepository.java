package com.example.homifytest2.repository;

import com.example.homifytest2.model.Project;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {

	Optional<Project> findAll(Long projectId, Long courseId);

}