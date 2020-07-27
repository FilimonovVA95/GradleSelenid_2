package company.name.character.testers;

import company.name.character.AbstractCharacter;
import company.name.enums.TesterCareer;
import company.name.enums.TesterEducation;

public abstract class AbstractTester extends AbstractCharacter {

    /**
     * Стенд для теста, email, пароль, зарегестрирован или нет
     */
    public String stand;
    public String email;
    public String password;
    public boolean isRegistration;

    /**
     * Данные профиля
     */
    public String fioProfile;
    public String dataBirth;
    public String address;
    public boolean isMan;
    public boolean isMarried;
    public TesterEducation education;
    public TesterCareer career;
    public String income;
    public int children;

    /**
     * Данные реквизитов
     */
    public String bankName;
    public int bik;
    public int correspondentAccount;
    public int passportNumber;
    public String whoIssuedPassport;
    public String whenIssuedPassport;
    public int departmentCodePassport;
    public int inn;
    public int snils;
    public String registrationAddress;
    public String actualAddress;
    public int numberPhone;
}
