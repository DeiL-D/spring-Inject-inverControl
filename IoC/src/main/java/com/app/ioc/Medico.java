package com.app.ioc;

public class Medico  {
Utensilios utensilio;
public void setUtensilio(Utensilios utensiolio) {
	this.utensilio = utensiolio;
}
public void operar() {
	System.out.println("operando");
	utensilio.usar();
}
}
