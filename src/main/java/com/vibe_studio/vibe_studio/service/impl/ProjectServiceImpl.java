package com.vibe_studio.vibe_studio.service.impl;

import com.vibe_studio.vibe_studio.dto.project.ProjectRequest;
import com.vibe_studio.vibe_studio.dto.project.ProjectResponse;
import com.vibe_studio.vibe_studio.dto.project.ProjectSummaryResponse;
import com.vibe_studio.vibe_studio.entity.Project;
import com.vibe_studio.vibe_studio.mapper.ProjectMapper;
import com.vibe_studio.vibe_studio.repository.ProjectRepository;
import com.vibe_studio.vibe_studio.repository.UserRepository;
import com.vibe_studio.vibe_studio.service.ProjectService;
import jakarta.transaction.Transactional;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.apache.catalina.User;
import org.hibernate.annotations.FilterDef;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@Transactional
public class ProjectServiceImpl implements ProjectService {

    ProjectRepository projectRepository;
    UserRepository userRepository;
    ProjectMapper projectMapper;

    @Override
    public ProjectResponse createProject(ProjectRequest request, Long userId) {

        User owner = userRepository.findById(userId).orElseThrow();

        Project project = Project.builder()
                .name(request.name())
                .owner(owner)
                .isPublic(false)
                .build();

        project = projectRepository.save(project);
        return projectMapper.toProjectResponse(project);
    }

    @Override
    public List<ProjectSummaryResponse> getUserProjects(Long userId) {

//        return projectRepository.findAllAccessibleByUser(userId)
//                .stream()
//                .map(projectMapper::toProjectSummaryResponse)
//                .collect(Collectors.toList());

        var projects = projectRepository.findAllAccessibleByUser(userId);
        return projectMapper.toListOfProjectSummaryResponse(projects);
    }

    @Override
    public ProjectResponse getUserProjectById(Long id, Long userId) {
        return null;
    }

    @Override
    public ProjectResponse updateProject(Long id, ProjectRequest request, Long userId) {
        return null;
    }

    @Override
    public void softDelete(Long id, Long userId) {

    }
}