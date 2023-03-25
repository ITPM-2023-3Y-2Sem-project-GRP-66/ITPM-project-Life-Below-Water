package GRP66.ITPMProject3Y2Sem.Entity;

import javax.persistence.*;

@Entity
@Table(name="Article")
public class ArticleEntity {
    @Id
    @Column(name="article_ID",length = 45)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ArticleID;

    @Column(name="article_title",length = 100,nullable = false)
    private String tittle;

    @Column(name="image",length = 100)
    private String image;

    @Column(name="description",length = 100,nullable = false)
    private String description;

    public ArticleEntity() {
    }

    public ArticleEntity(int articleID, String tittle, String image, String description) {
        ArticleID = articleID;
        this.tittle = tittle;
        this.image = image;
        this.description = description;
    }

    public int getArticleID() {
        return ArticleID;
    }

    public String getTittle() {
        return tittle;
    }

    public String getImage() {
        return image;
    }

    public String getDescription() {
        return description;
    }

    public void setArticleID(int articleID) {
        ArticleID = articleID;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {

        return "ArticleEntity{" +
                "ArticleID=" + ArticleID +
                ", tittle='" + tittle + '\'' +
                ", image='" + image + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
