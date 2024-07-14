package com.jpdev.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpdev.entities.BlogPost;
import com.jpdev.repo.BlogPostRepository;

@Service
public class BlogPostService {

	@Autowired
	private BlogPostRepository blogPostRepository;
	
	public List<BlogPost> getAllPosts(){
		return blogPostRepository.findAll();
	}
	
	public BlogPost getPostsById(Long id) {
		return blogPostRepository.findById(id).orElse(null);
	}
	
	public BlogPost createPost(BlogPost blogPost) {
		return blogPostRepository.save(blogPost);
	}
	
	public BlogPost updatePost(Long id, BlogPost postDetails) {
		BlogPost post = blogPostRepository.findById(id).orElse(null);
		if (post != null) {
			post.setTitle(postDetails.getTitle());
			post.setContent(postDetails.getContent());
			post.setAuthor(postDetails.getAuthor());
			
			return blogPostRepository.save(post);
		}
		return null;
	}
	
	public void deletePost(Long id) {
		blogPostRepository.deleteById(id);
	}
	
}
