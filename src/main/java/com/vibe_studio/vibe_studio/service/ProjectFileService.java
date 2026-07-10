package com.vibe_studio.vibe_studio.service;

import com.vibe_studio.vibe_studio.dto.project.FileContentResponse;
import com.vibe_studio.vibe_studio.dto.project.FileTreeResponse;

public interface ProjectFileService {
    FileTreeResponse getFileTree(Long projectId);

    FileContentResponse getFileContent(Long projectId, String path);

    void saveFile(Long projectId, String filePath, String fileContent);
}
