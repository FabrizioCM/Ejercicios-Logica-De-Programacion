package org.generation.salpd7;

import java.util.Scanner;

public class SALPD7 {
	public static void main (String[]args) {
		int Hours = 24;
		int Minutes = 60;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un día de la semana: ");
        String inputDay = scanner.nextLine();
        System.out.print("Ingresa una Hora del Dí(Utiliza horario militar 24hrs): ");
        int inputHour = scanner.nextInt();
        System.out.print("Ingresa minutos: ");
        int inputMinutes = scanner.nextInt();
        int MinutesToSubstract =((Hours-inputHour)* Minutes - inputMinutes);  
        
        
        String WeekDays[] = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes"};
        if (inputHour<Hours || inputMinutes<Minutes) {
        	
		
        int dayIndex = -1;
        for (int i = 0; i < WeekDays.length; i++) {
            if (inputDay.equalsIgnoreCase(WeekDays[i])) {
                dayIndex = i;
                break;
            }
        }

        if (dayIndex == -1) {
            System.out.println("Día no válido");
        } else {
        	int daysUntilFriday = (4 - dayIndex + 5) % 5;
        	int CorrectDays = daysUntilFriday-1;
            int HoursUntilFriday = (CorrectDays * Hours)+15;
            int MinutesUntilFriday = (HoursUntilFriday * Minutes)+MinutesToSubstract;
            
            System.out.println(CorrectDays);
            System.out.println(HoursUntilFriday);
            System.out.println("Minutos hasta el fin de semana: " + MinutesUntilFriday);
        }
        
        }else {
        	System.out.println("No valido Muchachon");
        }
        scanner.close();
	}
}
