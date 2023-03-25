package GRP66.ITPMProject3Y2Sem.DTO;

public class ArticleDTO {
    private int ArticleID;
    private String tittle;
    private String image;
    private String description;

    public ArticleDTO() {
    }
    public ArticleDTO(int articleID, String tittle, String image, String description) {
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
        return "ArticleDTO{" +
                "ArticleID=" + ArticleID +
                ", tittle='" + tittle + '\'' +
                ", image='" + image + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
