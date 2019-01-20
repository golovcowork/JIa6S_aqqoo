package data_layer;

import java.util.List;

public final class UserBuilder {
    private String fistname;
    private String lastname;
    private int age;
    private String username;
    private String password;
    private String address;
    private String town;
    private String county;
    private String postcode;
    private String email;

    protected UserBuilder() {
    }

    public static UserBuilder anUser() {
        return new UserBuilder();
    }

    public UserBuilder withFistname(String fistname) {
        this.fistname = fistname;
        return this;
    }

    public UserBuilder withLastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    public UserBuilder withAge(int age) {
        this.age = age;
        return this;
    }

    public UserBuilder withUsername(String username) {
        this.username = username;
        return this;
    }

    public UserBuilder withPassword(String password) {
        this.password = password;
        return this;
    }

    public UserBuilder withAddress(String address) {
        this.address = address;
        return this;
    }

    public UserBuilder withTown(String town) {
        this.town = town;
        return this;
    }

    public UserBuilder withCounty(String county) {
        this.county = county;
        return this;
    }

    public UserBuilder withPostcode(String postcode) {
        this.postcode = postcode;
        return this;
    }

    public UserBuilder withEmail(String email) {
        this.email = email;
        return this;
    }

    public User build() {
        User user = new User();
        user.setFistname(fistname);
        user.setLastname(lastname);
        user.setAge(age);
        user.setUsername(username);
        user.setPassword(password);
        user.setAddress(address);
        user.setTown(town);
        user.setCounty(county);
        user.setPostcode(postcode);
        user.setEmail(email);
        return user;
    }
}
