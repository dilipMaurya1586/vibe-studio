package com.vibe_studio.vibe_studio.mapper;

import com.vibe_studio.vibe_studio.dto.project.FileNode;
import com.vibe_studio.vibe_studio.entity.ProjectFile;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProjectFileMapper {

    List<FileNode> toListOfFileNode(List<ProjectFile> projectFileList);
}
