package sahab.singh.customlistview;

public class MovieDataType {

    private String imagelink;
    private String nameofmovie;
    private String yearofmovie;

    public MovieDataType(String imagelink, String nameofmovie, String yearofmovie) {
        this.imagelink = imagelink;
        this.nameofmovie = nameofmovie;
        this.yearofmovie = yearofmovie;
    }
    //getter help in taking data from

    public String getImagelink() {
        return imagelink;
    }

    public void setImagelink(String imagelink) {
        this.imagelink = imagelink;
    }

    public String getNameofmovie() {
        return nameofmovie;
    }

    public void setNameofmovie(String nameofmovie) {
        this.nameofmovie = nameofmovie;
    }

    public String getYearofmovie() {
        return yearofmovie;
    }

    public void setYearofmovie(String yearofmovie) {
        this.yearofmovie = yearofmovie;
    }
}