package web.model;


public class Car {
    private String carBrand;
    private String carModel;
    private String carNumber;

    public Car(String carBrand, String carModel, String carNumber) {
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.carNumber = carNumber;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    @Override
    public String toString() {
        return "Марка машины: " + carBrand +
                ", Модель: " + carModel +
                ", Номер: " + carNumber;
    }
}
