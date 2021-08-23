package com.tts.TechTalentBlog.Controller;

import com.tts.TechTalentBlog.Model.BlogPost;
import com.tts.TechTalentBlog.Repository.BlogPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class BlogPostController {

    @Autowired
    private BlogPostRepository blogPostRepository;

    @GetMapping("/")
    public String index(BlogPost blogPost, Model model) {
        model.addAttribute("posts", blogPostRepository.findAll());
        return "blogPost/index";
    }

    @PostMapping("/blogPost")
    public String addNewBlogPost(BlogPost blogPost, Model model) {
        blogPostRepository.save(blogPost);
        // posts.add(blogPost);
        model.addAttribute("title", blogPost.getTitle());
        model.addAttribute("author", blogPost.getAuthor());
        model.addAttribute("blogEntry", blogPost.getBlogEntry());
        return "blogPost/result";
    }

    @GetMapping("/blogPost/new")
    public String newBlog(BlogPost blogPost) {
        return "blogPost/new";
    }



    @GetMapping("/blogPost/{id}")
    public String editPostById(@PathVariable Long id, BlogPost blogPost, Model model) {
        model.addAttribute("blogPost", blogPostRepository.findById(id).orElseThrow());
        return "blogPost/edit";
    }

    @PostMapping("/blogPost/update/{id}")
    public String updateExistingPost(@PathVariable Long id, BlogPost blogPost, Model model) {
        System.out.println(blogPost);
        var actualPost = blogPostRepository.findById(id).orElseThrow();
        actualPost.setAuthor(blogPost.getAuthor());
        actualPost.setTitle(blogPost.getTitle());
        actualPost.setBlogEntry(blogPost.getBlogEntry());
        blogPostRepository.save(actualPost);
        model.addAttribute("blogPost", actualPost);
        return "blogPost/result";
    }

    @RequestMapping("/blogPost/delete/{id}")
    public String deletePostById(@PathVariable Long id, BlogPost blogPost) {
        blogPostRepository.deleteById(id);
        return "blogPost/delete";
    }
}
