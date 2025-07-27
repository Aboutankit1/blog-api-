package com.ankit.blogapi.controller;

import com.ankit.blogapi.entity.Blog;
import com.ankit.blogapi.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/blog")
public class BlogController {

    @Autowired
    private BlogRepository blogRepository;

    // Create a new blog: POST /api/blog/create
    @PostMapping("/create")
    public Blog createBlog(@RequestBody Blog blog) {
        return blogRepository.save(blog);
    }

    // Get all blogs: GET /api/blog/all
    @GetMapping("/all")
    public List<Blog> getAllBlogs() {
        return blogRepository.findAll();
    }

    // Get a single blog by ID: GET /api/blog/{id}
    @GetMapping("/{id}")
    public Blog getBlogById(@PathVariable Long id) {
        return blogRepository.findById(id).orElse(null);
    }

    // Update blog: PUT /api/blog/update/{id}
    @PutMapping("/update/{id}")
    public Blog updateBlog(@PathVariable Long id, @RequestBody Blog blog) {
        Blog existing = blogRepository.findById(id).orElse(null);
        if (existing != null) {
            existing.setTitle(blog.getTitle());
            existing.setContent(blog.getContent());
            existing.setAuthor(blog.getAuthor());
            return blogRepository.save(existing);
        }
        return null;
    }

    // Delete blog: DELETE /api/blog/delete/{id}
    @DeleteMapping("/delete/{id}")
    public void deleteBlog(@PathVariable Long id) {
        blogRepository.deleteById(id);
    }
}
