package Manager;


public class EastAsiaCountries extends Country{

    private String countryTerrain;

    public EastAsiaCountries() {
    }

    public EastAsiaCountries(String countryTerrain, String countryCode, String countryName, double countryArea) {
        super(countryCode, countryName, countryArea);
        this.countryTerrain = countryTerrain;
    }

    @Override
    public void display() {
        super.display();
        System.out.printf("%-25s\n", this.countryTerrain);
    }

    public String getCountryTerrain() {
        return countryTerrain;
    }

    public void setCountryTerrain(String countryTerrain) {
        this.countryTerrain = countryTerrain;
    }



}

/*
@Override
public int compareTo(Country otherCountry) {
    // So sánh diện tích của quốc gia hiện tại và quốc gia khác
    if (this.getCountryArea() < otherCountry.getCountryArea()) {
        return -1; // Quốc gia hiện tại có diện tích nhỏ hơn, đứng trước trong danh sách
    } else if (this.getCountryArea() > otherCountry.getCountryArea()) {
        return 1; // Quốc gia hiện tại có diện tích lớn hơn, đứng sau trong danh sách
    } else {
        return 0; // Hai quốc gia có diện tích bằng nhau, không thay đổi thứ tự
    }
}

*/
