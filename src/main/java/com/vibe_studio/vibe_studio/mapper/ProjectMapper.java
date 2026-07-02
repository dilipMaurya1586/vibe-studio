package com.vibe_studio.vibe_studio.mapper;


import com.vibe_studio.vibe_studio.dto.project.ProjectResponse;
import com.vibe_studio.vibe_studio.dto.project.ProjectSummaryResponse;
import com.vibe_studio.vibe_studio.entity.Project;
import com.vibe_studio.vibe_studio.enums.ProjectRole;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProjectMapper {

    ProjectResponse toProjectResponse(Project project);

    ProjectSummaryResponse toProjectSummaryResponse(Project project, ProjectRole role);

    List<ProjectSummaryResponse> toListOfProjectSummaryResponse(List<Project> projects);

}