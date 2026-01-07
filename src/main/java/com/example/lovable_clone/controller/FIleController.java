package com.example.lovable_clone.controller;

import com.example.lovable_clone.dto.project.FIleNode;
import com.example.lovable_clone.dto.project.FileContentResponse;
import com.example.lovable_clone.service.FileService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/projects/{projectId}/files")
public class FIleController {

    private final FileService fileService;

    @GetMapping
    public ResponseEntity<List<FIleNode>> getFileTree(@PathVariable Long projectId) {
        Long userId=1L;
        return ResponseEntity.ok(fileService.getFileTree(projectId,userId));
    }

    @GetMapping("/{*path}")
        public ResponseEntity<FileContentResponse> getFile(
                @PathVariable Long projectId,
                @PathVariable String path){
        Long userId=1L;
        return ResponseEntity.ok(fileService.getFIle(projectId,path,userId));
        }
}
