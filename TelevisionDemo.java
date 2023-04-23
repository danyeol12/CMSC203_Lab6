package lab6;

import java.util.Scanner;

/** 
* This class tests the Television class
*/
public class TelevisionDemo
	{
	public static void main(String[] args)
	{
		//create a Scanner object to read from the keyboard
		Scanner keyboard = new Scanner (System.in);
		//declare variables
		int station; //the user’s channel choice
		//declare and instantiate a television object
		Television bigScreen = new Television("Toshiba", 55);
		//turn the power on
		bigScreen.power();
		//display the state of the television
		System.out.println("A " + bigScreen.getScreenSize() + "-inch " +
				bigScreen.getManufacturer() + " has been turned on.");
		//prompt the user for input and store into station
		System.out.print("What channel do you want? ");
		station = keyboard.nextInt();
		//change the channel on the television
		bigScreen.setChannel(station);
		//increase the volume of the television
		bigScreen.increaseVolume();
		//display the the current channel and volume of the television
		System.out.println("Channel: " + bigScreen.getChannel() +
				", Volume: " + bigScreen.getVolume());
		System.out.println("Too loud!! I am lowering the volume.");
		//decrease the volume of the television
		bigScreen.decreaseVolume();
		bigScreen.decreaseVolume();
		bigScreen.decreaseVolume();
		bigScreen.decreaseVolume();
		bigScreen.decreaseVolume();
		bigScreen.decreaseVolume();
		//display the current channel and volume of the television
		System.out.println("Channel: " + bigScreen.getChannel() +
				", Volume: " + bigScreen.getVolume());
		System.out.println(); //for a blank line
		//HERE IS WHERE YOU DO TASK #5
		
		// Declare and instantiate a Television object
		Television portable = new Television("Sharp", 19);

		// Toggle power on the portable TV
		portable.power();

		// Inform the user that the TV has been powered on
		System.out.println("A " + portable.getScreenSize() + "-inch " +
		        portable.getManufacturer() + " has been turned on.");

		// Ask the user for their channel preference and set the channel
		System.out.print("What channel do you want? ");
		int desiredChannel = keyboard.nextInt();
		portable.setChannel(desiredChannel);

		// Decrease the volume twice
		for (int i = 0; i < 2; i++) {
		    portable.decreaseVolume();
		}

		// Display the current state of the Television
		System.out.println("Channel: " + portable.getChannel() +
		        ", Volume: " + portable.getVolume());
		}
	}
