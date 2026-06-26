package com.vibe_studio.vibe_studio.service;

import com.vibe_studio.vibe_studio.dto.project.FileContentResponse;
import com.vibe_studio.vibe_studio.dto.project.FileNode;

import java.util.List;

public interface FileService {

    List<FileNode> getFileTree(Long projectId, Long userId);

    FileContentResponse getFileContent(Long projectId, String path, Long userId);

}
