package com.tts.TechTalentBlog.Controller;

import com.tts.TechTalentBlog.Model.BlogPost;
import com.tts.TechTalentBlog.Repository.BlogPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class BlogPostController {

    @Autowired
    private BlogPostRepository blogPostRepository;

    @GetMapping("/blogposts")
    public String index(BlogPost blogPost, Model model) {
        model.addAttribute("posts", blogPostRepository.findAll());
        return "blogpost/index";
    }

    @PostMapping("/")
    public String addNewBlogPost(BlogPost blogPost, Model model) {
        blogPostRepository.save(blogPost);
        // posts.add(blogPost);
        model.addAttribute("title", blogPost.getTitle());
        model.addAttribute("author", blogPost.getAuthor());
        model.addAttribute("blogEntry", blogPost.getBlogEntry());
        return "blogPost/result";
    }

    @GetMapping("/blogposts/new")
    public String newBlog(BlogPost blogPost) {
        return "blogposts/new";
    }


}
