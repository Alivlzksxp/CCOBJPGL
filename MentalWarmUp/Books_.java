package MentalWarmUp;

class Books_ {
    
    String bookTitle;
    String bookAuthor;
    int noOf_copies;

    public Books_(String bookTitle, String bookAuthor, int noOf_copies) {
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
}

