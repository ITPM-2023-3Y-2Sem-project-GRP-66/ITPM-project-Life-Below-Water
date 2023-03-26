package GRP66.ITPMProject3Y2Sem.Repository;

import GRP66.ITPMProject3Y2Sem.Entity.ArticleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface ArticleRepo extends JpaRepository<ArticleEntity, Integer> {
}
