package MentalWarmUp;

import java.util.Scanner;

public class BookRental_ {
	
    String bookTitle;
    String bookAuthor;
    int noOf_copies;

    public void Books_(String bookTitle, String bookAuthor, int noOf_copies) {
    	this.bookTitle = bookTitle;
    	this.bookAuthor = bookAuthor;
    	this.noOf_copies = noOf_copies;
    }

	public String getTitle() {
        return bookTitle;
    }

    public String getAuthor() {
        return bookAuthor;
    }

    public int getCopies() {
        return noOf_copies;
    }

    public void setTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public void setAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public void setCopies(int noOf_copies) {
        this.noOf_copies = noOf_copies;
    }

	 public static void main(String[] args) {
	        Book[] book = {
	            new Book("System Analysis and Design", "Gary B. Shelly", 2),
	            new Book("Android Application", "Corinne Hoisington", 3),
	            new Book("Programming Concepts and Logic Formulation", "Rosauro E. Manuel", 4)
	        };

	        Scanner sc = new Scanner(System.in);

	        boolean rentAgain = true;

	        while (rentAgain) {
	            System.out.println("\nELECTRONIC BOOK RENTAL SYSTEM");
	            System.out.println("**********************************************************************************************");
	            
	            System.out.println();
	            for (int i = 0; i < book.length; i++) {
	                System.out.println((i+1) + " " + book[i].getTitle() + ", " + book[i].getAuthor() + " [Copies of Book Available = " + book[i].getCopies() + "]\n");
	            }

	            System.out.println("**********************************************************************************************");
	            System.out.print("WELCOME! CHOOSE A BOOK TO RENT BY ENTERING YOUR CHOOSEN BOOK'S NUMBER: ");
	            int index = sc.nextInt() - 1;

	            if (index < 0 || index >= book.length) {
	                System.out.println("SORRY THE NUMBER YOU ENTER DOES NOT EXIST, TRY AGAIN!");
	            } 
	            else if (book[index].getCopies() == 0) {
	                System.out.println("THIS BOOK IS CURRENTLY OUT OF STOCK, PLEASE TRY AGAIN ANOTHER TIME. THANK YOU!");
	            } 
	            else {
	                book[index].setCopies(book[index].getCopies() - 1);
	                System.out.printf("You Rented the book %s by %s \nHAPPY READING!\n \nDo You Want To Rent Again? Y/N\n", book[index].getTitle(), book[index].getAuthor());
	                String input = sc.next();
	                if (!input.equalsIgnoreCase("Y")) {
	                	rentAgain = false;
	                }
	            }
	        }
	        System.out.println("\nTHANK YOU FOR RENTING OUR BOOKS, PLEASE RENT AGAIN NEXT TIME!");
	    }
	}
