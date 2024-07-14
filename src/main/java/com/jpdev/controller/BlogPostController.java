package com.jpdev.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpdev.entities.BlogPost;
import com.jpdev.services.BlogPostService;

@RestController
@RequestMapping("/api/posts")

public class BlogPostController {

	@Autowired
	private BlogPostService blogPostService;
	
	@GetMapping
	public List<BlogPost> getAllPosts(){
		return blogPostService.getAllPosts();
	}
	
	@GetMapping("/{id}")
	public BlogPost getPostById(@PathVariable Long id){
		return blogPostService.getPostsById(id);
	}
	
	@PostMapping
	public BlogPost createPost(@RequestBody BlogPost blogPost){
		return blogPostService.createPost(blogPost);
	}
	
	@PutMapping("/{id}")
	public BlogPost updatePost(@PathVariable Long id, @RequestBody BlogPost postDetails){
		return blogPostService.updatePost(id, postDetails);
	}
	
	@DeleteMapping("/{id}")
	public void deletePost(@PathVariable Long id){
		blogPostService.deletePost(id);
	}
}
