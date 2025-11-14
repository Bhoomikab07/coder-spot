package com.xworkz.busdepo.internal;

public class BookingDto {

        int busId;
        char busType;
        long routeId;
        double mileage;
        boolean isAvailable;
        float fuelCapacity;


        Integer capacity;
        String busName;
        Character busGrade;
        Boolean isAC;
        Double price;
        Float cost;
        Long number;

        public BookingDto(int busId, char busType, long routeId, double mileage, boolean isAvailable, float fuelCapacity,
                      Integer capacity, String busName, Character busGrade, Boolean isAC, Double price, Float cost, Long number) {
            this.busId = busId;
            this.busType = busType;
            this.routeId = routeId;
            this.mileage = mileage;
            this.isAvailable = isAvailable;
            this.fuelCapacity = fuelCapacity;

            this.capacity = capacity;
            this.busName = busName;
            this.busGrade = busGrade;
            this.isAC = isAC;
            this.price = price;
            this.cost = cost;
            this.number = number;
        }

        public void setBusId(int busId) {
            this.busId = busId;
        }

        public int getBusId() {
            return busId;
        }

        public void setBusType(char busType) {
            this.busType = busType;
        }

        public char getBusType() {
            return busType;
        }

        public void setRouteId(long routeId) {
            this.routeId = routeId;
        }

        public long getRouteId() {
            return routeId;
        }

        public void setMileage(double mileage) {
            this.mileage = mileage;
        }

        public Double getMileage() {
            return mileage;
        }

        public void setAvailable(boolean available) {
            isAvailable = available;
        }

        public boolean getIsAvailable() {
            return isAvailable;
        }

        public void setFuelCapacity(float fuelCapacity) {
            this.fuelCapacity = fuelCapacity;
        }

        public void setCapacity(Integer capacity) {
            this.capacity = capacity;
        }

        public Integer getCapacity() {
            return capacity;
        }

        public void setBusName(String busName) {
            this.busName = busName;
        }

        public String getBusName() {
            return busName;
        }

        public void setBusGrade(Character busGrade) {
            this.busGrade = busGrade;
        }

        public Character getBusGrade() {
            return busGrade;
        }

        public void setAC(Boolean AC) {
            isAC = AC;
        }

        public Boolean getAC() {
            return isAC;
        }

        public void setPrice(Double price) {
            this.price = price;
        }

        public Double getPrice() {
            return price;
        }

        public void setCost(Float cost) {
            this.cost = cost;
        }

        public Float getCost() {
            return cost;
        }

        public void setNumber(Long number) {
            this.number = number;
        }

        public Long getNumber() {
            return number;
        }
        @Override
        public String toString(){
            return "Depo [busId =" +busId + ",busType= "+ busType +",routeId ="+routeId+",mileage="+mileage+",isAvailable="+isAvailable+",fuelCapacity="+fuelCapacity+"," +
                    "capacity ="+capacity+",busName="+busName+",busGrade="+busGrade+",isAc="+isAC+",price="+price+",cost="+cost+",number="+number+",]";
        }

        public int hashCode() {
            int primeNumber = 11;
            int result = 1;
            result = primeNumber + result + busId;
            result = primeNumber + result + capacity;
            result = primeNumber + result + ((busName == null) ? null : busName.hashCode());
            result = primeNumber + result + ((busGrade == null)? null : busGrade.hashCode());
            result = primeNumber + result + ((isAC == null)? null : isAC.hashCode());
            result = primeNumber + result + ((price == null)? null : price.hashCode());
            result = primeNumber + result +((cost == null)? null : cost.hashCode());
            result = primeNumber + result + ((number == null)? null : number.hashCode());

            return result;

        }
        @Override
        public boolean equals(Object obj){
            if (this==obj){
                return true;
            }
            if (!(this instanceof Object)){
                return false;
            }
            BookingDto bookingDto = (BookingDto) obj;
            return this.price == bookingDto.price && (this.busName == null? bookingDto.busName == null : this.busName.equals(bookingDto.busName));

        }
    }



