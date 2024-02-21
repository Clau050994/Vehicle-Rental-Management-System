public class Car extends Vehicle {

    private int seatingCapacity;
    private String fuelType;
    private String transmissionType;
    private String color;
    private String category; // SUV,luxury,sport,economic;
    private boolean hasGPS;

    public Car (){
        this("No Vehicle ID","No brand","No model",1000,0.0,
                0,"No fuel Typer", " No trasmission Typer",
                "No color","No category", false);
    }

    public Car (String vehicleID,String make,String model,int year,
                double pricePerDay,int seatingCapacity,String fuelType,
                String transmissionType,String color,String category,boolean hasGPS){

        super(vehicleID,make,model,year,pricePerDay);
        setSeatingCapacity(seatingCapacity);
        setFuelType(fuelType);
        setTransmissionType(transmissionType);
        setColor(color);
        setCategory(category);
        setHasGPS(hasGPS);
    }

    public void setSeatingCapacity(int seatingCapacity){
        if (seatingCapacity == 0){
            System.out.println("Invalid seating. Fatal error");
            System.exit(0);
        }
        this.seatingCapacity = seatingCapacity;

    }

    public void  setFuelType(String fuelType){
        if (fuelType == null){
            System.out.println("Invalid Fuel type");
            System.exit(0);
        }
        this.fuelType = fuelType;
    }

    public void setTransmissionType(String transmissionType){
        if (fuelType == null){
            System.out.println("Invalid Transmission type");
            System.exit(0);
        }
        this.transmissionType = transmissionType;
    }

    public void setColor(String color){
        if (fuelType == null){
            System.out.println("Invalid Color");
            System.exit(0);
        }
        this.color = color;
    }
    public void setCategory(String category){
        if (fuelType == null){
            System.out.println("Invalid Category");
            System.exit(0);
        }
        this.category = category;
    }

    public void setHasGPS(boolean hasGPS){
        this.hasGPS = hasGPS;

        }

    @Override    // i need to define this
    public double calculateRentalPrice(int duration) {
        return 0;
    }

    public int getSeatingCapacity(){return  seatingCapacity;}
    public String getFuelType(){return fuelType;}
    public String getTransmissionType(){return transmissionType;}
    public String getColor(){return color;}
    public String getCategory(){return category;}
    public boolean isHasGPS(){return hasGPS;}




    public String toString(){
        return super.toString() +
                "Seating Capacity: "+getSeatingCapacity()+"\n"+
                "Fuel Type :"+ getFuelType()+"\n"+
                "Transmission Type: "+ transmissionType+"\n"+
                "Color: "+getColor() +"\n"+
                "Category:" + getCategory()+"\n"+
                "GPS: " + isHasGPS();


    }





}
