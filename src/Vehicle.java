public class Vehicle {
    private String vehicleID; // Unique for each vehicle
    private String make; // Take the brand of the vehicle
    private String model; //Model of the vehicle
    private int year;
    private double pricePerDay;

    public Vehicle(){
        this("No Vehicle ID","No brand","No model",1000,0.0);
    }

    public Vehicle(String vehicleID,String make,String model,int year, double pricePerDay){
        setVehicleID(vehicleID);
        setMake(make);
        setModel(model);
        setYear(year);
        setPricePerDay(pricePerDay);

    }

    public void setVehicleID(String vehicleID){
        if (vehicleID == null){
            System.out.println("Invalid vehicle Id. Fatal error");
            System.exit(0);
        }
        this.vehicleID = vehicleID;
    }

    public void setMake(String make){
        if(make == null){
            System.out.println("Invalid brand. Fatal error");
            System.exit(0);
        }
        this.make = make;
    }

    public void setModel(String model){
        if (model == null){
            System.out.println("Invalid model. Fatal error");
        }
        this.model = model;
    }

    public void setYear(int year){
        if(year < 0){
            System.out.println("Invalid year");
            System.exit(0);
        }
        this.year = year;
    }

    public void setPricePerDay(double pricePerDay){
        if (pricePerDay < 0 ){
            System.out.println("Invalid Price");
        }
        this.pricePerDay = pricePerDay;
    }

    public String getVehicleID(){return vehicleID;}
    public String getMake(){return make;}
    public String getModel(){return model;}
    public int getYear(){return year;}
    public double getPricePerDay(){return pricePerDay;}


    public String toString() {
        return "Car information" + "\n"+
                "Vehicle ID: " + getVehicleID() + "\n"+
                "Brand: " + getMake() + "\n"+
                "Model: "+ getModel()+ "\n"+
                "Year: " + getYear()+ "\n"+
                "Price per day: "+ getPricePerDay();

    }


    public boolean equals(Vehicle otherVehicle) {
        return getVehicleID().equals(otherVehicle.getVehicleID())&&
                getModel().equals(otherVehicle.getModel())&&
                getMake().equals(otherVehicle.getMake())&&
                getYear()== otherVehicle.getYear()&&
                getPricePerDay() == otherVehicle.getPricePerDay();

    }
}
