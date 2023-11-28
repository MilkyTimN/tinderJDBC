package model.entity;

import model.enums.*;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Client {
    private Integer id;
    private ClientStatus status;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private String email;
    private String fullName;
    private int age;
    private Gender gender;
    private FamilyStatus familyStatus;
    private Country country;
    private String city;
    private String about;
    private Zodiac zodiac;
    private LocalDate birthDate;

    public Client(Integer id, ClientStatus status, LocalDateTime createdDate, LocalDateTime updatedDate, String email, String fullName, int age, Gender gender, FamilyStatus familyStatus, Country country, String city, String about, Zodiac zodiac, LocalDate birthDate) {
        this.id = id;
        this.status = status;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
        this.email = email;
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
        this.familyStatus = familyStatus;
        this.country = country;
        this.city = city;
        this.about = about;
        this.zodiac = zodiac;
        this.birthDate = birthDate;
    }

    public Client(ClientStatus status, LocalDateTime createdDate, LocalDateTime updatedDate, String email, String fullName, int age, Gender gender, FamilyStatus familyStatus, Country country, String city, String about, Zodiac zodiac, LocalDate birthDate) {
        this.status = status;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
        this.email = email;
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
        this.familyStatus = familyStatus;
        this.country = country;
        this.city = city;
        this.about = about;
        this.zodiac = zodiac;
        this.birthDate = birthDate;
    }

    public Client() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ClientStatus getStatus() {
        return status;
    }

    public void setStatus(ClientStatus status) {
        this.status = status;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDateTime getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(LocalDateTime updatedDate) {
        this.updatedDate = updatedDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public FamilyStatus getFamilyStatus() {
        return familyStatus;
    }

    public void setFamilyStatus(FamilyStatus familyStatus) {
        this.familyStatus = familyStatus;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public Zodiac getZodiac() {
        return zodiac;
    }

    public void setZodiac(Zodiac zodiac) {
        this.zodiac = zodiac;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", status=" + status +
                ", createdDate=" + createdDate +
                ", updatedDate=" + updatedDate +
                ", email='" + email + '\'' +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", familyStatus=" + familyStatus +
                ", country=" + country +
                ", city='" + city + '\'' +
                ", about='" + about + '\'' +
                ", zodiac=" + zodiac +
                ", birthDate=" + birthDate +
                '}';
    }
}
