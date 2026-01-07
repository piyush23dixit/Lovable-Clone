package com.example.lovable_clone.service;

import com.example.lovable_clone.dto.project.FIleNode;
import com.example.lovable_clone.dto.project.FileContentResponse;

import java.util.List;

public interface FileService {
    List<FIleNode> getFileTree(Long projectId, Long userId);

    FileContentResponse getFIle(Long projectId, String path, Long userId);
}
