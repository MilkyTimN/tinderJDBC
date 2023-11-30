package model.response;

public class MainListClientResponse {
    private int id;
    private String fullName;
    private String about;
    private int age;
    private String city;

    public MainListClientResponse(int id, String fullName, String about, int age, String city) {
        this.id = id;
        this.fullName = fullName;
        this.about = about;
        this.age = age;
        this.city = city;
    }

    public MainListClientResponse() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "MainListClientResponse{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", about='" + about + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }
}
