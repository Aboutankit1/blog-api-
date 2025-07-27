package com.ankit.blogapi.repository;

import com.ankit.blogapi.entity.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Blog, Long> {
}
