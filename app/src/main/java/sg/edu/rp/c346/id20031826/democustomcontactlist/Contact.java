package sg.edu.rp.c346.id20031826.democustomcontactlist;

public class Contact {

    private String name;
    private int countryCode;
    private int phoneNum;
    private char gender;

    public Contact(String name, int countryCode, int phoneNum, char gender) {
        this.name = name;
        this.countryCode = countryCode;
        this.phoneNum = phoneNum;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public int getCountryCode() {
        return countryCode;
    }

    public int setCountryCode(int countryCode) {
        this.countryCode = countryCode;
        return countryCode;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public int setPhoneNum(int PhoneNum) {
        this.phoneNum = phoneNum;
        return phoneNum;
    }

    public char getGender() {
        return gender;
    }

    public char setGender(char gender) {
        this.gender = gender;
        return gender;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", countryCode=" + countryCode +
                ", phoneNum=" + phoneNum +
                ", gender=" + gender +
                '}';
    }

}
