package com.example.homifytest2.controller;

import com.example.homifytest2.exception.ResourceNotFoundException;
import com.example.homifytest2.model.Project;
import com.example.homifytest2.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ProjectController {

    @Autowired
    ProjectRepository projectRepository;

    // Create a new project
    @PostMapping("/projects/owners")
    public Project createProject(@Valid @RequestBody Project project) {
       
    	return projectRepository.save(project);
    }
    
    // Get a Single project
    
    @GetMapping("/projects/{id}/owners")
    public Project getProjectById(@PathVariable(value = "id") Long projectId ,Long ownerId)
    {
        return projectRepository.findAll(projectId, ownerId)
        		
        .orElseThrow(() -> new ResourceNotFoundException("Project", "id", projectId));
    }
    // Update a project
    
    @PutMapping("/projects/{id}")
    public Project updateProject(@PathVariable(value = "id") Long projectId,
                                            @Valid @RequestBody Project projectDetails) {

        Project project = projectRepository.findById(projectId)
                .orElseThrow(() -> new ResourceNotFoundException("Project", "id", projectId));

        project.setHeader(projectDetails.getHeader());
        project.setTitle(projectDetails.getTitle());
        project.setDescription(projectDetails.getDescription());
        project.setDuration(projectDetails.getDuration());
        project.setOwner(projectDetails.getOwner());
        project.setTypes(projectDetails.getTypes());
        

        Project updatedProject = projectRepository.save(project);
        return updatedProject;
    }

    // Delete a Project
    @DeleteMapping("/projects/{id}/courses")
    public ResponseEntity<?> deleteNote(@PathVariable(value = "id") Long projectId, Long courseId) 
    {
        Project project = projectRepository.findAll(projectId,courseId)
        .orElseThrow(() -> new ResourceNotFoundException("Project", "id", projectId));

        projectRepository.delete(project);

        return ResponseEntity.ok().build();
    }
    
    // get all projects of professionals
    
    @GetMapping("/projects/courses")
    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }
}
