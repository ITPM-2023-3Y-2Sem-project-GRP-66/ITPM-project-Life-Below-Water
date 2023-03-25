package GRP66.ITPMProject3Y2Sem.Controller;

import GRP66.ITPMProject3Y2Sem.DTO.ArticleDTO;
import GRP66.ITPMProject3Y2Sem.Service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/article")
@CrossOrigin
public class ArticleController {
    @Autowired
    private ArticleService articleService;
    @PostMapping("/saveArticle")
    public String Customer(@RequestBody ArticleDTO article){
       String message=articleService.saveArticle(article);
        return message;
    }

}
