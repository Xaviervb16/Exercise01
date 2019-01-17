package com.company;
//Xavier Bradley, 1/17/19, Gives basic info along with average temperature for that week
public class Main {

    public static void main(String[] args) {
	double temperature[] = {25, 30, 22, 7, 24};
	int zipcode = 43123;
	String city = "Grove City";
	double avgTemp = 0;
	double sum = 0;
	double total= 0;
        for (int i = 0; i <= 4; i++) {
           total = total + temperature[i];
        }
        avgTemp = total/5;
        System.out.println("City: " + city + " The zip code is " + zipcode + " The average temp is: " + avgTemp);
    }
}
