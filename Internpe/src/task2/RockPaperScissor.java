package task2;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			//create an array of strings and we store the moves 
			//i.e. rock paper scissors in that. So the length of the array = 3
			String [] availableMoves = {"Rock", "Paper", "Scissors"};
			//the computer move would be the randomized element of that list and for that, 
			//we use the Random() function on the indices of the array so that we get the randomized index between [0,2]
			String computerMove = availableMoves[new Random().nextInt(availableMoves.length)];
			System.out.println("Computer has choosen its move ");
			System.out.println();
			System.out.println("Now Its your turn to choose. Good Luck!");
			System.out.println();
			
			//User Move
			String userMove ;
			// loop until the user chooses the correct move
			while(true) {
				System.out.println("Please choose your move from these available moves : 'Rock' 'Paper' 'Scissors' ");
				System.out.println("Enter the move you choose : ");
				userMove = sc.nextLine();
				
				// checking if user's move is one of the available moves or not
				if(userMove.equals("Rock") || userMove.equals("Paper") || userMove.equals("Scissors")) {
					System.out.println();
					break;
				}
				// if user didn't enter a valid input
				System.out.println();
				System.out.println("Invalid Move!!");
				System.out.println("Please Enter the move from the available moves only ! ");
				System.out.println();
			}
			//printing what computer choose
			System.out.println("Computer choose : " + computerMove);
			//3. COMPARING THE MOVES & DECIDING THE WINNER
			// checking for a tie
			if(userMove.equals("computerMove")) {
				System.out.println("its a Tie !!");
			}
			//checking for all other moves possible
			else if(userMove.equals("Rock")) {
				
				if(computerMove.equals("Paper")) {
					System.out.println("Computer Won !!");
					System.out.println("Better Luck Next Time !!");
				}
				else if(computerMove.equals("Scissors")) {
					System.out.println("you won");
					System.out.println("Congratulations!!");
				}
			}
				else if(userMove.equals("Rock")) {
								
								if(computerMove.equals("Paper")) {
									System.out.println("Computer Won !!");
									System.out.println("Better Luck Next Time !!");
								}
								else if(computerMove.equals("Scissors")) {
									System.out.println("you won");
									System.out.println("Congratulations!!");
								}
							}
				else if(userMove.equals("Paper")) {
					
					if(computerMove.equals("Rock")) {
						System.out.println("Computer Won !!");
						System.out.println("Better Luck Next Time !!");
					}
					else if(computerMove.equals("Scissors")) {
						System.out.println("you won");
						System.out.println("Congratulations!!");
					}
				}
				else if(userMove.equals("Scissors")) {
					
					if(computerMove.equals("Paper")) {
						System.out.println("Computer Won !!");
						System.out.println("Better Luck Next Time !!");
					}
					else if(computerMove.equals("Rock")) {
						System.out.println("you won");
						System.out.println("Congratulations!!");
					}
				}
			System.out.println();
			String playAgain;
			System.out.println("Do you want to play again ?");
			// loop until the user chooses the correct option
			
			while(true) {
				System.out.println("Type 'yes' or 'no' ");
				playAgain = sc.nextLine();
				if(playAgain.equals("yes") || playAgain.equals("Yes") || playAgain.equals("no") || playAgain.equals("No")) {
					System.out.println();
					System.out.println("*****************************************************************************");
					System.out.println();
					break;
			}
				System.out.println();
				System.out.println("Invalid Input");
				System.out.println();
		}
			if(playAgain.equals("no") || playAgain.equals("No")) {
				break;
			}
		}
		

	}

}
