package GRP66.ITPMProject3Y2Sem.Service.ServiceIMPL;
import GRP66.ITPMProject3Y2Sem.DTO.ArticleDTO;
import GRP66.ITPMProject3Y2Sem.Entity.ArticleEntity;
import GRP66.ITPMProject3Y2Sem.Repository.ArticleRepo;
import GRP66.ITPMProject3Y2Sem.Service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleServiceIMPL implements ArticleService {
    @Autowired
    private ArticleRepo articleRepo;

    @Override
    public String saveArticle(ArticleDTO article) {

        ArticleEntity articleEnti=new ArticleEntity(
                article.getArticleID(),
                article.getTittle(),
                article.getImage(),
                article.getDescription()

        );
        articleRepo.save(articleEnti);
        return "your article adding completed !!!.";
    }
}
