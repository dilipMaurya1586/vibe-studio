package com.vibe_studio.vibe_studio.mapper;


import com.vibe_studio.vibe_studio.dto.project.ProjectResponse;
import com.vibe_studio.vibe_studio.dto.project.ProjectSummaryResponse;
import com.vibe_studio.vibe_studio.entity.Project;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProjectMapper {

    ProjectResponse toProjectResponse(Project project);

    @Mapping(target = "projectName", source = "name")
    ProjectSummaryResponse toProjectSummaryResponse(Project project);

    List<ProjectSummaryResponse> toListOfProjectSummaryResponse(List<Project> projects);

}