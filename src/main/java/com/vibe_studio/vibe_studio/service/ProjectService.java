package com.vibe_studio.vibe_studio.service;

import com.vibe_studio.vibe_studio.dto.project.ProjectRequest;
import com.vibe_studio.vibe_studio.dto.project.ProjectResponse;
import com.vibe_studio.vibe_studio.dto.project.ProjectSummaryResponse;
import org.jspecify.annotations.Nullable;

import java.util.List;

public interface ProjectService {
    List<ProjectSummaryResponse> getUserProjects();

    ProjectSummaryResponse getUserProjectById(Long id);

    ProjectResponse createProject(ProjectRequest request);

    ProjectResponse updateProject(Long id, ProjectRequest request);

    void softDelete(Long id);
}
