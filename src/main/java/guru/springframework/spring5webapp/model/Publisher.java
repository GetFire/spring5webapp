package guru.springframework.spring5webapp.model;

import javax.persistence.Entity;

@Entity
public class Publisher extends AbstractModel<Publisher> {
    private String name;
    private String addressLine;
    private String city;
    private String zip;
    private String state;

    public Publisher() {
    }

    public Publisher(String name, String addressLine, String city, String zip, String state) {
        this.name = name;
        this.addressLine = addressLine;
        this.city = city;
        this.zip = zip;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddressLine() {
        return addressLine;
    }

    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "id='" + getId() + '\'' +
                ", name='" + name + '\'' +
                ", addressLine='" + addressLine + '\'' +
                ", city='" + city + '\'' +
                ", zip='" + zip + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
