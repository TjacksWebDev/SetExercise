package com.coderscampus.setsmain;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class SetExerciseApp {

	public static void main(String[] args) {
		
			// Instantiate new hashset
		Set<String> pokerHands =extractDataFromCSV("PokerHands.csv");
			System.out.println("Task #1: ");
			printToConsole(pokerHands);
				
				System.out.println("Task #2: ");		
				// remove ACE HIGH and QUEEN HIGH
				pokerHands.remove("ACE HIGH");
				pokerHands.remove("QUEEN HIGH");
				printToConsole(pokerHands);
				
				System.out.println("Task #3: ");
				// Update PAIR to DEUCES
				pokerHands.remove("PAIR");
				pokerHands.add("DEUCES");
				
				printToConsole(pokerHands);
				}
				
			
			
			public static void printToConsole(Set<String> pokerHands) {
				System.out.println("--------------------------------------");
				for(String pokerHand: pokerHands ) {
					System.out.println(pokerHand);
				}
				System.out.println("--------------------------------------");
			}
	
			// extract the data from the CSV
			public static Set<String> extractDataFromCSV(String fileName) {
				Set<String> pokerHands = new HashSet<>();
				
				try(BufferedReader reader = new BufferedReader(new FileReader("PokerHands.csv"))){
					String line;
					while((line=reader.readLine()) != null) {
						String[] playerAndHand = line.split(",");
						pokerHands.add(playerAndHand[1]);
					}				
				
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				return pokerHands;
			}

		}
