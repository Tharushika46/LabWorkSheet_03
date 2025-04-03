package Q_04;

class Bicycle {
    // Data Member
    private Owner owner;
    private String modelName;
    private String manufactureYear;

    public Bicycle() {
    }

    public Bicycle(Owner owner, String modelName, String manufactureYear) {
        this.owner = owner;
        this.modelName = modelName;
        this.manufactureYear = manufactureYear;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(String manufactureYear) {
        this.manufactureYear = manufactureYear;
    }
}
