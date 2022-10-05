// Problem Statement:-
// Create a library class and implement the following:

// Create a constructor that takes the book list as an argument.
// getBookList(): This function should return the list of all book present in the library.
// issueBook(bookname, user): This function takes an argument of bookname and user, in bookname, we specify the name of the book, and in user, we specify the name of the user. This function will issue the book to the user.
// returnBook(bookname): This function will take one argument, which is the name of the book. The purpose of this function is to remove the book from the users borrowed book data. It is totally up to you how you implement it.



console.log("This is tutorial 32 - solution");
// create a class library and implement the following:
// constructor must take the book list as an argument
// getBookList()
// issueBook(bookname, user)
// returnBook(bookname)

class Library {
  constructor(bookList) {
    this.bookList = bookList;
    this.issuedBooks = {};
  }

  getBookList() {
    this.bookList.forEach((element) => {
      console.log(element);
    });
  }

  issueBook(bookname, user) {
    if (this.issuedBooks[bookname] == undefined) {
      this.issuedBooks[bookname] = user;
    } else {
      console.log("This book is already issued!");
    }
  }

  returnBook(bookname) {
    delete this.issuedBooks[bookname];
  }
}



